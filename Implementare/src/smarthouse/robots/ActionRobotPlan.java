package smarthouse.robots;

import smarthouse.ontology.beanynizer.Robot;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import smarthouse.ontology.beanynizer.*;
public class ActionRobotPlan extends Plan
{

	/**
	 * For serializing purposes
	 */
	private static final long serialVersionUID = -3898818158009683975L;

	@Override
	public void body() {
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		//	AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
			Activity activity = (Activity) request.getParameter("action").getValue();
			//((Robot)getBeliefbase().getBelief("device").getFact());		
	}
	

}
