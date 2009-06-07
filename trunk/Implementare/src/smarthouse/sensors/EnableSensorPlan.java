package smarthouse.sensors;

import smarthouse.ontology.beanynizer.Sensor;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class EnableSensorPlan extends Plan {
		
		public void body()
		{
			IMessageEvent request = (IMessageEvent)getInitialEvent();
			AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
			((Sensor)getBeliefbase().getBelief("sensor").getFact()).setDeviceStatus("ON");
		}

}
