package PresentationLayer;
import javax.swing.*;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.*;

public class StartMonitoringGUIPlan extends Plan
{
	protected Gui gui;
	protected AgentIdentifier ta;
	public StartMonitoringGUIPlan()
	{
		getLogger().info("Created: "+this);
		this.gui=new Gui(this.getExternalAccess());
		this.ta=null;
	}

	public void body()
	{
		
		getEventbase().addInternalEventListener("request_search", new IInternalEventListener()
		{
			public void internalEventOccurred(AgentEvent ae)
			{
				getLogger().info("Created"+this);
				

				IGoal df_search = createGoal("df_search");
				df_search.getParameter("description").setValue(getPropertybase().getProperty("service_seller"));
				getLogger().info("ok: "+this);
				
				dispatchSubgoalAndWait(df_search);
				/*AgentDescription[] result = (AgentDescription[])df_search.getParameterSet("result").getValues();
				if(result.length == 0)
					fail();
				
				AgentIdentifier[] sellers = new AgentIdentifier[result.length];*/
				
			}
		}, false);
		
		
		
	}
	
	
	
	
}
