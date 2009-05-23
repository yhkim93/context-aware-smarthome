/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of ContextEntity.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>ContextEntity</code> of SmartHouseOntology ontology.
 */
public class ContextEntity  extends ContextEntityData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>ContextEntity</code>.
   */
  public ContextEntity() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>ContextEntity</code>.
   * @param instancename    
   */
  public ContextEntity(String instancename) {
    // Constructor using required slots (change if desired).
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>ContextEntity</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public ContextEntity(ContextEntity proto) {
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>ContextEntity</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "ContextEntity("
         + "instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>ContextEntity</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new ContextEntity(this);
  }
  
  /** 
   *  Test the equality of this <code>ContextEntity</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>ContextEntity</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof ContextEntity) {
      ContextEntity cmp=(ContextEntity)obj;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

