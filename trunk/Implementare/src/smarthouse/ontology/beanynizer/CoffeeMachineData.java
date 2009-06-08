/*
 * CoffeeMachineData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept CoffeeMachine of SmartHouseOntology ontology.
 */
public abstract class CoffeeMachineData	extends KitchenDevice implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>CoffeeMachine</code>.
	 */
	public CoffeeMachineData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this CoffeeMachine.
	 *  @return The string representation.
	 */
	public String toString() {
		return "CoffeeMachine("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this CoffeeMachine using the nuggets utility.
	 * @param c 
	 */
	public void _persist(nuggets.ICruncher c) {
		// declare references
		int idHasLocation = c.declare(haslocation);
		// persist the nugget
		c.startConcept(this);
		if (devicestatus!=null) 
			c.put("devicestatus", devicestatus);
		if (idHasLocation>0) 
			c.put("haslocation", idHasLocation);
		if (instancename!=null) 
			c.put("instancename", instancename);
		if (timestamp!=null) 
			c.put("timestamp", timestamp);
	}
	
	/**
	 * Restore this CoffeeMachine 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: devicestatus =  (String)v; return;
		case 1: haslocation =  (Location)v; return;
		case 2: timestamp =  (String)v; return;
		case 3: instancename =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((1682377566*name.charAt(0))>>>15)%4;
}

}