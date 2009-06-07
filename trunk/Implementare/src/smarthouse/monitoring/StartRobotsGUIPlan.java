package smarthouse.monitoring;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;

public class StartRobotsGUIPlan extends Plan
{
	protected AgentIdentifier ta;
	public StartRobotsGUIPlan()
	{
		new SmartHouseManagement(this.getExternalAccess());
	}

	public void body()
	{
	}
	
	
	
	
}
