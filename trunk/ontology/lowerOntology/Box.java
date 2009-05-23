/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Box.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>Box</code> of SmartHouseOntology ontology.
 */
public class Box  extends BoxData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Box</code>.
   */
  public Box() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Box</code>.
   * @param haslocation    
   * @param instancename    
   */
  public Box(Location haslocation, String instancename) {
    // Constructor using required slots (change if desired).
    setHasLocation(haslocation);
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Box</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Box(Box proto) {
    setHasLocation(proto.getHasLocation());
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Box</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "Box("
         + "haslocation="+getHasLocation()
         + ", instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>Box</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Box(this);
  }
  
  /** 
   *  Test the equality of this <code>Box</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Box</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Box) {
      Box cmp=(Box)obj;
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
