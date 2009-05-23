package PresentationLayer;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;

public class StartSensorGUIPlan extends Plan
{
	protected AgentIdentifier ta;
	public StartSensorGUIPlan()
	{
		new Gui(this.getExternalAccess());
	}

	public void body()
	{
	}
	
	
	
	
}
