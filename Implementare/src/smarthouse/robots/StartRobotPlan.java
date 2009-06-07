package smarthouse.robots;


import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import smarthouse.ontology.beanynizer.Robot;

public class StartRobotPlan extends Plan 
{
	
	/**
	 * For serializing purposes
	 */
	private static final long serialVersionUID = 3675705932311303233L;

	public void body()
	{
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		//AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		
		Robot robot=(Robot)request.getContent();
	    getBeliefbase().getBelief("robot").setFact(robot);
	}

}
