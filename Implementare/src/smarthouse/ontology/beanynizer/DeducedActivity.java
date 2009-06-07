/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of DeducedActivity.
 * Feel free to change.
 *
 */
package smarthouse.ontology.beanynizer;


/**
 *  Editable Java class for concept <code>DeducedActivity</code> of SmartHouseOntology ontology.
 */
public class DeducedActivity  extends DeducedActivityData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>DeducedActivity</code>.
   */
  public DeducedActivity() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>DeducedActivity</code>.
   * @param haslocation    
   * @param instancename    
   */
  public DeducedActivity(Location haslocation, String instancename) {
    // Constructor using required slots (change if desired).
    setHasLocation(haslocation);
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>DeducedActivity</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public DeducedActivity(DeducedActivity proto) {
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>DeducedActivity</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "DeducedActivity("
         + "haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>DeducedActivity</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new DeducedActivity(this);
  }
  
  /** 
   *  Test the equality of this <code>DeducedActivity</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>DeducedActivity</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof DeducedActivity) {
      DeducedActivity cmp=(DeducedActivity)obj;
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

