package PresentationLayer;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.*;

public class StartRobotsGUIPlan extends Plan
{
	protected AgentIdentifier ta;
	public StartRobotsGUIPlan()
	{
		new Gui(this.getExternalAccess());
	}

	public void body()
	{
	}
	
	
	
	
}
