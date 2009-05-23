package sensor;

import ontology.lowerOntology.Sensor;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class InitSensorPlan extends Plan {
	
	public void body()
	{
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		
		Sensor sensor=(Sensor)request.getContent();
		
	    getBeliefbase().getBelief("sensor").setFact(sensor);
	    getLogger().info("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	}

}
