/*
 * CleaningDeviceData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package smarthouse.ontology.beanynizer;



/**
 *  Java class for concept CleaningDevice of SmartHouseOntology ontology.
 */
public abstract class CleaningDeviceData	extends Device implements nuggets.INugget
{
	//-------- constants ----------

	//-------- attributes ----------

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>CleaningDevice</code>.
	 */
	public CleaningDeviceData()  { //
	}

	//-------- accessor methods --------

	//-------- object methods --------

	/**
	 *  Get a string representation of this CleaningDevice.
	 *  @return The string representation.
	 */
	public String toString() {
		return "CleaningDevice("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this CleaningDevice using the nuggets utility.
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
	 * Restore this CleaningDevice 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: devicestatus =  (String)v; return;
		case 1: instancename =  (String)v; return;
		case 2: timestamp =  (String)v; return;
		case 3: haslocation =  (Location)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((2076528075*name.charAt(0))>>>15)%4;
}

}
