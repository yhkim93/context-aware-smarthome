/*
 * EntertainmentActivityData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package ontology.lowerOntology;



/**
 *  Java class for concept EntertainmentActivity of SmartHouseOntology ontology.
 */
public abstract class EntertainmentActivityData	extends Activity implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>EntertainmentActivity</code>.
	 */
	public EntertainmentActivityData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this EntertainmentActivity.
	 *  @return The string representation.
	 */
	public String toString() {
		return "EntertainmentActivity("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this EntertainmentActivity using the nuggets utility.
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
	 * Restore this EntertainmentActivity 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: instancename =  (String)v; return;
		case 1: haslocation =  (Location)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((873642527*name.charAt(0))>>>15)%2;
}

}