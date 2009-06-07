package smarthouse.devices;

import java.util.Iterator;
import java.util.Vector;

import smarthouse.ontology.beanynizer.Device;
import smarthouse.ontology.beanynizer.Sensor;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.IGoal;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class InitDevicePlan extends Plan {
	
	public void body()
	{
		IMessageEvent request = (IMessageEvent)getInitialEvent();
		AgentIdentifier aId = (AgentIdentifier)request.getParameter("sender").getValue();
		
		Device device=(Device)request.getContent();
	    getBeliefbase().getBelief("device").setFact(device);
	}

}
