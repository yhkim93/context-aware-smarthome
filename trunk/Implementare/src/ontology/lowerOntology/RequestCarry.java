/*
 * RequestCarry.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package ontology.lowerOntology;

import jadex.adapter.fipa.AgentAction;


/**
 *  Java class for concept RequestCarry of SmartHouseOntology ontology.
 */
public class RequestCarry	extends AgentAction implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	/** Attribute for slot target. */
	protected  Target  target;

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>RequestCarry</code>.
	 */
	public RequestCarry()  { //
	}

	//-------- accessor methods --------

	/**
	 *  Get the target of this RequestCarry.
	 * @return target
	 */
	public Target  getTarget() {
		return this.target;
	}

	/**
	 *  Set the target of this RequestCarry.
	 * @param target the value to be set
	 */
	public void  setTarget(Target target) {
		this.target = target;
	}

	//-------- object methods --------

	/**
	 *  Get a string representation of this RequestCarry.
	 *  @return The string representation.
	 */
	public String toString() {
		return "RequestCarry("
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this RequestCarry using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		int idTarget = c.declare(target);
		// persist the nugget
		c.startConcept(this);
		if (idTarget>0) 
			c.put("target", idTarget);
	}
	
	/**
	 * Restore this RequestCarry 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		target =  (Target)v; 
	}
}
