package smarthouse.monitoring;
import java.util.Vector;

import smarthouse.ontology.beanynizer.Sensor;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.model.IMBelief;
import jadex.model.IMBeliefbase;
import jadex.runtime.IExternalAccess;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class GuiDataPlan extends Plan {
	private IExternalAccess agent;
	private static final int TIMEOUT = 15000;

	public GuiDataPlan() {
	
	}
	
	public void body()
	{
		IMBeliefbase model;
		IMBelief belief;
		
		getLogger().info("Sensor information");
		jadex.adapter.fipa.AgentIdentifier receiver;
		receiver = new AgentIdentifier("KBAgent",true);
		IMessageEvent me = createMessageEvent("requestContextData");
		me.setContent("getSensorTypes");

		me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
		
		IMessageEvent reply = sendMessageAndWait(me);
		getLogger().info("Sending message");
		Vector sensorTypes=new Vector();
		sensorTypes=(Vector)reply.getContent();
		getLogger().info("reply from KB AGENT"+sensorTypes.elementAt(0));

	    getBeliefbase().getBelief("sensorType").setFact(sensorTypes);
	    
	    for(int i=0;i<sensorTypes.size();i++){
		    model = (IMBeliefbase)getBeliefbase().getModelElement();
		    belief = model.createBelief((String)sensorTypes.elementAt(i), Vector.class, -1, "false");
		    this.getBeliefbase().registerBelief(belief);
		}
	    	
	    /*IMessageEvent me1= createMessageEvent("requestContextData");
		me1.setContent("getSensors");
		me1.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
		IMessageEvent reply1 = sendMessageAndWait(me1);
		Vector sensors=new Vector();
		sensors=(Vector)reply1.getContent();
		
		Vector v=new Vector();
		for(int i=0; i<sensors.size();i++){
			v=(Vector)sensors.elementAt(i);
			this.getBeliefbase().getBelief((String)sensorTypes.elementAt(i)).setFact(v);
			for(int j=0; j<v.size();j++){
				Sensor s=(Sensor)v.elementAt(j);
				
				
			}
		}*/
		getLogger().info("reply from KB AGENT SENSORS");
	 
	}
}
