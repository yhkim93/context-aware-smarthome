/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Target.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>Target</code> of SmartHouseOntology ontology.
 */
public class Target  extends TargetData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Target</code>.
   */
  public Target() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Target</code>.
   * @param location    
   */
  public Target(Location location) {
    // Constructor using required slots (change if desired).
    setLocation(location);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Target</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Target(Target proto) {
    setLocation(proto.getLocation());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Target</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "Target("
         + "location="+getLocation()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>Target</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Target(this);
  }
  
  /** 
   *  Test the equality of this <code>Target</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Target</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Target) {
      Target cmp=(Target)obj;
      if (getLocation()!=cmp.getLocation() &&
           (getLocation()==null || !getLocation().equals(cmp.getLocation()))
          ) return false;
      return true;
    }
    return false;
  }
}

