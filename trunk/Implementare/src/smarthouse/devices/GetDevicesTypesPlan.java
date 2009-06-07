package smarthouse.devices;

import java.util.Iterator;
import java.util.Vector;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.ServiceDescription;
import jadex.model.IMBelief;
import jadex.model.IMBeliefbase;
import jadex.runtime.IGoal;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import smarthouse.ontology.beanynizer.Device;
import smarthouse.ontology.beanynizer.Sensor;

public class GetDevicesTypesPlan extends Plan {
private IMBeliefbase model;
private IMBelief belief;

public void body()
{
	/*get devices*/
	getLogger().info("Device Manager");
	jadex.adapter.fipa.AgentIdentifier receiver;
	receiver = new AgentIdentifier("KBAgent",true);
	IMessageEvent me = createMessageEvent("requestContextData");
	me.setContent("getDevices");
	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
	IMessageEvent reply = sendMessageAndWait(me);
	Vector<Device> devices=new Vector<Device>();
	devices=(Vector)reply.getContent();
	
	getLogger().info("Reply from KB : "+devices.size()+" found");
    
	getBeliefbase().getBelief("deviceType").setFact(devices);
    
	
     for(Device s : devices){   	 
    	
    
    	IGoal ca = createGoal("ams_create_agent");
    	ca.getParameter("type").setValue("smarthouse.devices.Device");
    	getLogger().info("The instance name of the device is: "+s.getInstanceName());
    	ca.getParameter("name").setValue(s.getInstanceName());
	    dispatchSubgoalAndWait(ca);
	    AgentIdentifier createdagent = (AgentIdentifier)ca.getParameter("agentidentifier").getValue();
	    

	    me = createMessageEvent("context_info");
    	me.setContent(s);
    	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(new AgentIdentifier(createdagent.getLocalName(),true));
    	sendMessage(me);
    
     }
 	
}
	
	
}
