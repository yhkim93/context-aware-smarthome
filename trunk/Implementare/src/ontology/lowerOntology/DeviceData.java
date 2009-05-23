/*
 * DeviceData.java
 *
 * Generated by Protege plugin Beanynizer. 
 * Changes will be lost! 
 */
package ontology.lowerOntology;



/**
 *  Java class for concept Device of SmartHouseOntology ontology.
 */
public abstract class DeviceData	extends PhysicalObject implements nuggets.INugget
{
	//-------- constants ----------

	/** Predefined value "ON" for slot deviceStatus. */
	public static String  DEVICESTATUS_ON  = "ON";
	/** Predefined value "OFF" for slot deviceStatus. */
	public static String  DEVICESTATUS_OFF  = "OFF";

	//-------- attributes ----------

	/** Attribute for slot deviceStatus. */
	protected  String  devicestatus;

	/** Attribute for slot timestamp. */
	protected  String  timestamp;

	//-------- constructors --------

	/**
	 *  Default Constructor. <br>
	 *  Create a new <code>Device</code>.
	 */
	public DeviceData()  { //
	}

	//-------- accessor methods --------

	/**
	 *  Get the deviceStatus of this Device.
	 * @return deviceStatus
	 */
	public String  getDeviceStatus() {
		return this.devicestatus;
	}

	/**
	 *  Set the deviceStatus of this Device.
	 * @param devicestatus the value to be set
	 */
	public void  setDeviceStatus(String devicestatus) {
		this.devicestatus = devicestatus;
	}

	/**
	 *  Get the timestamp of this Device.
	 * @return timestamp
	 */
	public String  getTimestamp() {
		return this.timestamp;
	}

	/**
	 *  Set the timestamp of this Device.
	 * @param timestamp the value to be set
	 */
	public void  setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	//-------- object methods --------

	/**
	 *  Get a string representation of this Device.
	 *  @return The string representation.
	 */
	public String toString() {
		return "Device("
		+ "devicestatus="+getDeviceStatus()
		+ ", haslocation="+getHasLocation()
		+ ", instancename="+getInstanceName()
		+ ", timestamp="+getTimestamp()
           + ")";
	}
	
	//--------- nuggets methods ---------
	
	/**
	 * Persist this Device using the nuggets utility.
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
	 * Restore this Device 
	 * @param a the name of the attribute
	 * @param v the value of the attribute
	 */
	public void _set(String a, Object v) { //
		switch(hash(a)) {
		case 0: haslocation =  (Location)v; return;
		case 1: timestamp =  (String)v; return;
		case 2: devicestatus =  (String)v; return;
		case 3: instancename =  (String)v; return;
		}                        
	}
	
private static final int hash(String name) {
   return ((1411735230*name.charAt(0))>>>15)%4;
}

}
