package smarthouse.knowledge.base;
import java.util.Vector;

import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;
import smarthouse.ontology.beanynizer.Robot;
import smarthouse.util.DevicesUtil;
import smarthouse.util.RobotsUtil;
import smarthouse.util.SensorsUtil;

public class ContextPlan extends Plan
{
	
	private static final long serialVersionUID = 3226710242677404316L;
	
	protected AgentIdentifier ta;
	private CreateModel model;
	public ContextPlan()
	{
		model=(CreateModel)getBeliefbase().getBelief("model").getFact();

		this.ta=null;
	}

	public void body()
	{
		IMessageEvent msg=null;
		Vector<?> sensors,devices;
		Vector<String> sensorTypes;//,deviceTypes;

		getLogger().info("Plan body: "+this);
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		
		getLogger().info("Sender: " + aId.getName());

		
		String requestString=(String)request.getContent();
		getLogger().info("Request is "+ requestString + " and model namespace is "+ model.getNamespace());
		
		if (requestString.equals("getSensorTypes")){
			sensorTypes=SensorsUtil.getSensorTypes(model);
			getLogger().info("Sensor type list is: " + sensorTypes.size());
			msg = request.createReply("context_info");
			msg.setContent(sensorTypes);
			sendMessage(msg);

		}
		else if (requestString.equals("getSensors")){
			sensors=SensorsUtil.getSensors(model);
			msg = request.createReply("context_info");
			msg.setContent(sensors);
			sendMessage(msg);

		}
		else if (requestString.equals("getDevices")){
			getLogger().info("getDevices");
			devices=DevicesUtil.getDevices(model);
			
			
			
			msg = request.createReply("context_info");
			msg.setContent(devices);
			sendMessage(msg);

		}
		/*else if (requestString.contains("getSensor")){
			/*getLogger().info("Sensor"+requestString.substring(requestString.indexOf(" ")+1,requestString.length())+"x");
			Sensor s=getSensor(requestString.substring(requestString.indexOf(" ")+1,requestString.length()));
			sensors=new Vector();
			msg = request.createReply("context_info");
			msg.setContent(s);
			sendMessage(msg);			
		}*/	
		
		else if (requestString.contains("getSensorType")){
			
			String typeSubstring = requestString.substring(requestString.indexOf(" ")+1,requestString.length());
			getLogger().info("Sensor Type Searched is: "+ typeSubstring);
			
			String type=SensorsUtil.getSensorType(typeSubstring,model);
			
			getLogger().info("Sensor Type Found is: "+ type);
			Vector<String> v= new Vector<String>();
			v.add(type);
			msg = request.createReply("context_info");
			msg.setContent(v);
			sendMessage(msg);
			
		} 
		else if(requestString.contains("getRobots"))
		{
			Vector<Robot> robots= RobotsUtil.getRobots(model);
			msg = request.createReply("context_info");
			msg.setContent(robots);
			getLogger().info("Inside getRobots. Found "+robots.size()+" robots to send to RobotManager");
			sendMessage(msg);
		}
		
	}

	
}
