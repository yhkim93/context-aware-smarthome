package smarthouse.robots;

import smarthouse.ontology.beanynizer.Location;
import smarthouse.ontology.beanynizer.Robot;
import smarthouse.ontology.beanynizer.Sensor;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class MoveRobotPlan extends Plan
{

	/**
	 * For serializing purposes
	 */
	private static final long serialVersionUID = -7789610412850883632L;

	@Override
	public void body() {
		
		IMessageEvent request = (IMessageEvent)getInitialEvent();
	//	AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		Location location = (Location) request.getParameter("location").getValue();
		((Robot)getBeliefbase().getBelief("robot").getFact()).setHasLocation(location);
		
	}

}
