package smarthouse.sensors;


import java.util.Vector;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.IGoal;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

import smarthouse.ontology.beanynizer.Sensor;

public class GetSensorTypesPlan extends Plan {

	private static final long serialVersionUID = -5215945227280277907L;
	//private IMBeliefbase model;
	//private IMBelief belief;

public void body()
{
	/*get sensors*/
	getLogger().info("Sensor Manager");
	jadex.adapter.fipa.AgentIdentifier receiver;
	receiver = new AgentIdentifier("KBAgent",true);
	IMessageEvent me = createMessageEvent("requestContextData");
	me.setContent("getSensors");
	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
	IMessageEvent reply = sendMessageAndWait(me);
	Vector<Sensor> sensors =(Vector)reply.getContent();
	
	getLogger().info("Reply from KB "+sensors.size());
    getBeliefbase().getBelief("sensorType").setFact(sensors);
    
    
	
    for(Sensor s : sensors){

    	/*get sensor type*/
    	me = createMessageEvent("requestContextData");
    	me.setContent("getSensorType "+(s.getInstanceName()));
    	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(new AgentIdentifier("KBAgent",true));
    	reply = sendMessageAndWait(me);
    	
    	getLogger().info("Reply size from KB is: "+((Vector)reply.getContent()).size());
       
    	String type=((Vector)reply.getContent()).elementAt(0).toString();  
    	
    	getLogger().info("Creating Instance " +
    			""+s.getInstanceName()+" and type is "+type);
    	
    	/*create sensor agent*/
    	IGoal ca = createGoal("ams_create_agent");
    	ca.getParameter("type").setValue("smarthouse.sensors."+type);
    	ca.getParameter("name").setValue(s.getInstanceName());
    	getLogger().info("SubGoal was created and now will be submitted");
	    try
	    {
	    	dispatchSubgoalAndWait(ca);
	    } 
	    catch (Throwable e) {
		    getLogger().info("Caught Exception");
	    	e.printStackTrace();
		}
	    
	    
    	
	    AgentIdentifier createdagent = (AgentIdentifier)ca.getParameter("agentidentifier").getValue();
	    
	    getLogger().info("Agent Created Succesfully. Details "+ createdagent.getName());
	    
	    ServiceDescription service1 = new ServiceDescription(
	            createdagent.getLocalName(), "Sensor", "SmartHouse");
	    ServiceDescription[] services = new ServiceDescription[]{service1};
	    AgentDescription desc = SFipa.createAgentDescription(null, services, null, null, null);
	    IGoal register = createGoal("df_register");
	    register.getParameter("description").setValue(desc);
	    dispatchSubgoal(register);
	   
	    
	    /*init sensor belief*/
	    me = createMessageEvent("update");
    	me.setContent(s);
    	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(new AgentIdentifier(createdagent.getLocalName(),true));
    	sendMessage(me);
    
 }
 	
}
	
	
}
