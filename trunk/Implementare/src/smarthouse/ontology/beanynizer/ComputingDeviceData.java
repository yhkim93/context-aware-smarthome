/*
 * ComputingDeviceData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept ComputingDevice of SmartHouseOntology ontology.
 */
public abstract class ComputingDeviceData	extends Device implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>ComputingDevice</code>.
	 */
	public ComputingDeviceData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this ComputingDevice.
	 *  @return The string representation.
	 */
	public String toString() {
		return "ComputingDevice("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this ComputingDevice using the nuggets utility.
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
	 * Restore this ComputingDevice 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: instancename =  (String)v; return;
		case 1: haslocation =  (Location)v; return;
		case 2: devicestatus =  (String)v; return;
		case 3: timestamp =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((50293002*name.charAt(0))>>>15)%4;
}

}
