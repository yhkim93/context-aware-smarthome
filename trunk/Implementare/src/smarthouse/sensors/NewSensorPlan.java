package smarthouse.sensors;

import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IGoal;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import smarthouse.ontology.beanynizer.Sensor;

public class NewSensorPlan extends Plan {


   /**
	* 
	*/
	private static final long serialVersionUID = 3597277382163333319L;

	public void body()
	{
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		String requestString="";
		AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		/*if (request.getContent().getClass().equals("java.lang.String")){
			requestString=(String)request.getContent();
		}*/
		
		getLogger().info(request.getContent()+"REQUEST");
		if (request.getContent().toString().contains("getSensorType")){
			requestString=(String)request.getContent();
			getLogger().info("Get sensor type zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzx");
			
			getLogger().info("SensorType"+requestString.substring(requestString.indexOf(" ")+1,requestString.length())+"x");
			String type=(requestString).substring(requestString.indexOf(" ")+1,requestString.length());


			/*create sensor agent*/
			IGoal ca = createGoal("ams_create_agent");
			ca.getParameter("type").setValue("smarthouse.sensors."+type);
			Sensor s=(Sensor)getBeliefbase().getBelief("newSensor").getFact();
			ca.getParameter("name").setValue(s.getInstanceName());
			dispatchSubgoalAndWait(ca);
			AgentIdentifier createdagent = (AgentIdentifier)ca.getParameter("agentidentifier").getValue();


			/*init sensor belief*/
			IMessageEvent me = createMessageEvent("update");
			me.setContent(s);
			me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(new AgentIdentifier(createdagent.getLocalName(),true));
			sendMessage(me);
		}

		else{
			getLogger().info("New Sensor will be created");
			
			Sensor s=(Sensor)request.getContent();
			getLogger().info(s.getInstanceName());
			getBeliefbase().getBelief("newSensor").setFact(s);

		}
	}

}



