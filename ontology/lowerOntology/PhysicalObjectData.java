/*
 * PhysicalObjectData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package ontology.lowerOntology;



/**
 *  Java class for concept PhysicalObject of SmartHouseOntology ontology.
 */
public abstract class PhysicalObjectData	extends ContextEntity implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	/** Attribute for slot hasLocation. */
	protected  Location  haslocation;

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>PhysicalObject</code>.
	 */
	public PhysicalObjectData()  { //
	}

	//-------- accessor methods --------

	/**
	 *  Get the hasLocation of this PhysicalObject.
	 * @return hasLocation
	 */
	public Location  getHasLocation() {
		return this.haslocation;
	}

	/**
	 *  Set the hasLocation of this PhysicalObject.
	 * @param haslocation the value to be set
	 */
	public void  setHasLocation(Location haslocation) {
		this.haslocation = haslocation;
	}

	//-------- object methods --------

	/**
	 *  Get a string representation of this PhysicalObject.
	 *  @return The string representation.
	 */
	public String toString() {
		return "PhysicalObject("
		+ "haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this PhysicalObject using the nuggets utility.
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
	 * Restore this PhysicalObject 
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
   return ((37060439*name.charAt(0))>>>15)%2;
}

}
