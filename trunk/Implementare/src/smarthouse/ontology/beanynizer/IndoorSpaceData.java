/*
 * IndoorSpaceData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept IndoorSpace of SmartHouseOntology ontology.
 */
public abstract class IndoorSpaceData	extends Location implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>IndoorSpace</code>.
	 */
	public IndoorSpaceData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this IndoorSpace.
	 *  @return The string representation.
	 */
	public String toString() {
		return "IndoorSpace("
		+ "instancename="+getInstanceName()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this IndoorSpace using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		// persist the nugget
		c.startConcept(this);
		if (instancename!=null) 
			c.put("instancename", instancename);
	}
	
	/**
	 * Restore this IndoorSpace 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		instancename =  (String)v; 
	}
}
