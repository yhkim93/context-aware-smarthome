package KBLayer;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import sensor.util.Devices;
import sensor.util.Sensors;

import java.util.Vector;

public class ContextPlan extends Plan
{
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
		Vector sensors,devices;
		Vector sensorTypes,deviceTypes;

		getLogger().info("Plan body: "+this);
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		getLogger().info("Sender: " + aId.getName());

		
		String requestString=(String)request.getContent();
		getLogger().info(requestString);
      
        if (requestString.equals("getSensorTypes")){
			sensorTypes=Sensors.getSensorTypes(model);
			msg = request.createReply("context_info");
			msg.setContent(sensorTypes);
			sendMessage(msg);

		}
		else if (requestString.equals("getSensors")){
			sensors=Sensors.getSensors(model);
			msg = request.createReply("context_info");
			msg.setContent(sensors);
			sendMessage(msg);

		}
		else if (requestString.equals("getDevices")){
			getLogger().info("getDevices");
			devices=Devices.getDevices(model);
			
			 
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
			getLogger().info("Sensor"+requestString.substring(requestString.indexOf(" ")+1,requestString.length())+"x");
			
			String type=Sensors.getSensorType(requestString.substring(requestString.indexOf(" ")+1,requestString.length()),model);
			Vector v=new Vector();
			v.add(type);
			getLogger().info("TYPE"+type);
			msg = request.createReply("context_info");
			msg.setContent(v);
			sendMessage(msg);
			
		}	
		
	}

	
}
