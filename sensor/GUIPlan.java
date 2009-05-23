package sensor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.*;

public class GUIPlan extends Plan{

protected AgentIdentifier ta;

	public GUIPlan()
	{
		getLogger().info("Created: "+this);
	}

		
	public void body()
	{
		while(ta==null)
		{
			// Create a service description to search for.
			ServiceDescription sd = new ServiceDescription();
			sd.setName("sell");
			AgentDescription dfadesc = new AgentDescription();
			dfadesc.addService(sd);

			// Use a subgoal to search for a translation agent
			IGoal ft = createGoal("df_search");
            ft.getParameter("description").setValue(dfadesc);
          	//ft.getParameter("df", null); //new AID("df@vsispro3:1099/JADE") mit "http://vsispro3.informatik.uni-hamburg.de:1521/acc")

			dispatchSubgoalAndWait(ft);
            //Object result = ft.getResult();
            AgentDescription[]	result = (AgentDescription[])ft.getParameterSet("result").getValues();

			if(result.length>0)
			{
				this.ta = result[0].getName();
				getLogger().info("Found: ");
				jadex.adapter.fipa.AgentIdentifier receiver;
				receiver = new AgentIdentifier("LightSensor",true);
				IMessageEvent me = createMessageEvent("message");
				me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
				me.setContent("xx");
				IMessageEvent reply =sendMessageAndWait(me, 15000);
			}
			else
			{
				//if(result instanceof Exception)
				//	((Exception)result).printStackTrace();
				System.out.println("No translation agent found.");
				waitFor(5000);
			}
		}
		
	}
}