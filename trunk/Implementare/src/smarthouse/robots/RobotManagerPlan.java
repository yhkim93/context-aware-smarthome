package smarthouse.robots;

import java.util.Vector;

import smarthouse.ontology.beanynizer.Robot;
import smarthouse.ontology.beanynizer.Sensor;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;;

public class RobotManagerPlan extends Plan 
{

	/**
	 * For Serializing Purposes
	 */
	private static final long serialVersionUID = 531146574272520485L;

	@Override
	public void body() {
		
		/*get robots*/
		getLogger().info("I am the Robot Manager and will control all the robots...");
		jadex.adapter.fipa.AgentIdentifier receiver;
		receiver = new AgentIdentifier("KBAgent",true);
		IMessageEvent me = createMessageEvent("requestContextData");
		me.setContent("getRobots");
		me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
		getLogger().info("I will now get infos about robots from smart house");
		IMessageEvent reply = sendMessageAndWait(me);
		Vector<Robot> robots =(Vector<Robot>) reply.getContent();
		
		getLogger().info("Reply from KB "+robots.size());
	    getBeliefbase().getBelief("robotType").setFact(robots);
	    
	    for(Robot robot : robots)
	    {
	    	IGoal ca = createGoal("ams_create_agent");
	    	ca.getParameter("type").setValue("smarthouse.robots.Robot");
	    	getLogger().info("The instance name of the robot is: "+robot.getInstanceName());
	    	ca.getParameter("name").setValue(robot.getInstanceName());
		    dispatchSubgoalAndWait(ca);
		    AgentIdentifier createdagent = (AgentIdentifier)ca.getParameter("agentidentifier").getValue();
		    getBeliefbase().getBelief("newRobot").setFact(robot);
		    me = createMessageEvent("context_info");
	    	me.setContent(robot);
	    	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(new AgentIdentifier(createdagent.getLocalName(),true));
	    	sendMessage(me);
	    
	    }
	}
	

}
