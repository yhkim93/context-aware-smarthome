/**
 * 
 */
package smarthouse.util;

import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.ontology.beanynizer.Location;
import smarthouse.ontology.beanynizer.Robot;


/**
 * @author Mihai Ratiu
 */
public class RobotsUtil {
	
	public static Vector<Robot> getRobots(CreateModel model){
		Vector<String> robotIndividuals = new Vector<String>();
		Vector<Robot> robots = new Vector<Robot>();
		robotIndividuals = model.getIndividuals("Robot");
		for(String robotInd : robotIndividuals)
		{
			Location loc = new Location(model.getIndividualPropertyValue(robotInd,"hasLocation")); 
		    String name = model.getIndividualPropertyValue(robotInd,"instanceName");		
			Robot robot = new Robot(loc, name);
			robots.addElement(robot);
		}
		return robots;
	}	
	
}
