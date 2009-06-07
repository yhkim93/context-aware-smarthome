package smarthouse.monitoring;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;

public class StartSensorGUIPlan extends Plan
{
	protected AgentIdentifier ta;
	public StartSensorGUIPlan()
	{
		new SmartHouseManagement(this.getExternalAccess());
	}

	public void body()
	{
	}
	
	
	
	
}
