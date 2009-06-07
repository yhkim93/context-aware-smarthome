/*
 * DeducedActivityData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept DeducedActivity of SmartHouseOntology ontology.
 */
public abstract class DeducedActivityData	extends Activity implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>DeducedActivity</code>.
	 */
	public DeducedActivityData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this DeducedActivity.
	 *  @return The string representation.
	 */
	public String toString() {
		return "DeducedActivity("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this DeducedActivity using the nuggets utility.
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
	 * Restore this DeducedActivity 
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
   return ((705979140*name.charAt(0))>>>15)%2;
}

}
