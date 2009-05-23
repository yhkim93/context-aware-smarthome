package sensor;

import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.model.IMBelief;
import jadex.model.IMBeliefbase;
import jadex.runtime.IGoal;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import ontology.lowerOntology.Sensor;

import java.util.Vector;

public class GetSensorTypesPlan extends Plan {
private IMBeliefbase model;
private IMBelief belief;

public void body()
{
	/*get sensors*/
	getLogger().info("Sensor Manager");
	jadex.adapter.fipa.AgentIdentifier receiver;
	receiver = new AgentIdentifier("KBAgent",true);
	IMessageEvent me = createMessageEvent("requestContextData");
	me.setContent("getSensors");
	me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
	IMessageEvent reply = sendMessageAndWait(me);
	Vector sensors=new Vector();
	sensors=(Vector)reply.getContent();
	getLogger().info("Reply from KB "+sensors.size());
    getBeliefbase().getBelief("sensorType").setFact(sensors);
    

    for (Object sensor : sensors) {
        /*get sensor type*/
        Sensor s = (Sensor) sensor;
        me = createMessageEvent("requestContextData");
        me.setContent("getSensorType " + (s.getInstanceName()));
        me.getParameterSet(SFipa.RECEIVERS).addValue(new AgentIdentifier("KBAgent", true));
        reply = sendMessageAndWait(me);
        String type = ((Vector) reply.getContent()).elementAt(0).toString();

        getLogger().info("CREATING INSTANCE " + s.getInstanceName());

        /*create sensor agent*/
        IGoal ca = createGoal("ams_create_agent");
        ca.getParameter("type").setValue("sensor." + type);
        ca.getParameter("name").setValue(s.getInstanceName());
        dispatchSubgoalAndWait(ca);
        AgentIdentifier createdagent = (AgentIdentifier) ca.getParameter("agentidentifier").getValue();

        /*ServiceDescription service1 = new ServiceDescription(
                  createdagent.getLocalName(), "Sensor", "SmartHouse");
          ServiceDescription[] services = new ServiceDescription[]{service1};
          AgentDescription desc = SFipa.createAgentDescription(null, services, null, null, null);
          IGoal register = createGoal("df_register");
          register.getParameter("description").setValue(desc);
          dispatchSubgoal(register);
          */

        /*init sensor belief*/
        me = createMessageEvent("update");
        me.setContent(s);
        me.getParameterSet(SFipa.RECEIVERS).addValue(new AgentIdentifier(createdagent.getLocalName(), true));
        sendMessage(me);
        

    }

}
	
	
}
