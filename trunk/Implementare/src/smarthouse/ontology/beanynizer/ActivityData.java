/*
 * ActivityData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept Activity of SmartHouseOntology ontology.
 */
public abstract class ActivityData	extends ContextEntity implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	/** Attribute for slot hasLocation. */
	protected  Location  haslocation;

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>Activity</code>.
	 */
	public ActivityData()  { //
	}

	//-------- accessor methods --------

	/**
	 *  Get the hasLocation of this Activity.
	 * @return hasLocation
	 */
	public Location  getHasLocation() {
		return this.haslocation;
	}

	/**
	 *  Set the hasLocation of this Activity.
	 * @param haslocation the value to be set
	 */
	public void  setHasLocation(Location haslocation) {
		this.haslocation = haslocation;
	}

	//-------- object methods --------

	/**
	 *  Get a string representation of this Activity.
	 *  @return The string representation.
	 */
	public String toString() {
		return "Activity("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this Activity using the nuggets utility.
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
	 * Restore this Activity 
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
   return ((518907758*name.charAt(0))>>>15)%2;
}

}