/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of EntertainmentActivity.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>EntertainmentActivity</code> of SmartHouseOntology ontology.
 */
public class EntertainmentActivity  extends EntertainmentActivityData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>EntertainmentActivity</code>.
   */
  public EntertainmentActivity() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>EntertainmentActivity</code>.
   * @param haslocation    
   * @param instancename    
   */
  public EntertainmentActivity(Location haslocation, String instancename) {
    // Constructor using required slots (change if desired).
    setHasLocation(haslocation);
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>EntertainmentActivity</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public EntertainmentActivity(EntertainmentActivity proto) {
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>EntertainmentActivity</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "EntertainmentActivity("
         + "haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>EntertainmentActivity</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new EntertainmentActivity(this);
  }
  
  /** 
   *  Test the equality of this <code>EntertainmentActivity</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>EntertainmentActivity</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof EntertainmentActivity) {
      EntertainmentActivity cmp=(EntertainmentActivity)obj;
      if (getHasLocation()!=cmp.getHasLocation() &&
           (getHasLocation()==null || !getHasLocation().equals(cmp.getHasLocation()))
          ) return false;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

