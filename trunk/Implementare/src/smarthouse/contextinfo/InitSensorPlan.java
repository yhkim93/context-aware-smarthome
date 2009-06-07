package smarthouse.contextinfo;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.IGoal;
import jadex.runtime.Plan;

import java.util.Vector;

public class InitSensorPlan extends Plan {
	
	public void body()
	{
		/*get all sensors*/
		ServiceDescription sd = new ServiceDescription();
		sd.setType("Sensor");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		SearchConstraints sc = new SearchConstraints();
        sc.setMaxResults(100);
 		// Use a subgoal to search for a sensor agent
		IGoal ft = createGoal("df_search");
        ft.getParameter("description").setValue(dfadesc);
      	ft.getParameter("constraints").setValue(sc);
        dispatchSubgoalAndWait(ft);
        AgentDescription[]	result = (AgentDescription[])ft.getParameterSet("result").getValues();
		if(result.length>0)
		{
			getLogger().info("found"+result.toString());
			getLogger().info(result[1].getName().getName()+" "+result[0].getName().getName()+" "+result.length);
		}
		Vector v=new Vector();
		v.add(result);
		//getLogger().info(((AgentDescription)v.elementAt(0)).getName().toString());
		this.getBeliefbase().getBelief("sensorNames").setFact(v);
		
		
		

	}

}
