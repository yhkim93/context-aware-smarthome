/**
 * 
 */
package smarthouse.ontology.beanynizer;

/**
 * @author BigB
 *
 */
public class RobotData extends NonHuman implements nuggets.INugget
{
	public RobotData(){
		
	}
	
	public String toString() {
		return "NonHuman("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this NonHuman using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		int idHasLocation = c.declare(haslocation);
		// persist the nugget
		c.startConcept(this);
		if (idHasLocation>0) 
			c.put("haslocation", idHasLocation);
		if (instancename!=null) 
			c.put("instancename", instancename);
	}
	
	/**
	 * Restore this NonHuman 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: haslocation =  (Location)v; return;
		case 1: instancename =  (String)v; return;
		}                        
	}
	
	private static final int hash(String name) {
	   return ((20412825*name.charAt(0))>>>15)%2;
	}
}
