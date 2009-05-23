/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of HumiditySensor.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>HumiditySensor</code> of SmartHouseOntology ontology.
 */
public class HumiditySensor  extends HumiditySensorData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>HumiditySensor</code>.
   */
  public HumiditySensor() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>HumiditySensor</code>.
   * @param devicestatus    
   * @param haslocation    
   * @param instancename    
   * @param sensorvalue    
   * @param timestamp    
   */
  public HumiditySensor(String devicestatus, Location haslocation, String instancename, String sensorvalue, String timestamp) {
    // Constructor using required slots (change if desired).
    setDeviceStatus(devicestatus);
    setHasLocation(haslocation);
    setInstanceName(instancename);
    setSensorValue(sensorvalue);
    setTimestamp(timestamp);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>HumiditySensor</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public HumiditySensor(HumiditySensor proto) {
    setDeviceStatus(proto.getDeviceStatus());
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
    setSensorValue(proto.getSensorValue());
    setTimestamp(proto.getTimestamp());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>HumiditySensor</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "HumiditySensor("
         + "devicestatus="+getDeviceStatus()
         + ", haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ", sensorvalue="+getSensorValue()
         + ", timestamp="+getTimestamp()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>HumiditySensor</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new HumiditySensor(this);
  }
  
  /** 
   *  Test the equality of this <code>HumiditySensor</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>HumiditySensor</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof HumiditySensor) {
      HumiditySensor cmp=(HumiditySensor)obj;
      if (getDeviceStatus()!=cmp.getDeviceStatus() &&
           (getDeviceStatus()==null || !getDeviceStatus().equals(cmp.getDeviceStatus()))
          ) return false;
      if (getHasLocation()!=cmp.getHasLocation() &&
           (getHasLocation()==null || !getHasLocation().equals(cmp.getHasLocation()))
          ) return false;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      if (getSensorValue()!=cmp.getSensorValue() &&
           (getSensorValue()==null || !getSensorValue().equals(cmp.getSensorValue()))
          ) return false;
      if (getTimestamp()!=cmp.getTimestamp() &&
           (getTimestamp()==null || !getTimestamp().equals(cmp.getTimestamp()))
          ) return false;
      return true;
    }
    return false;
  }
}

