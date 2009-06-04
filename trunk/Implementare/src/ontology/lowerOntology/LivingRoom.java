/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of LivingRoom.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>LivingRoom</code> of SmartHouseOntology ontology.
 */
public class LivingRoom  extends LivingRoomData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>LivingRoom</code>.
   */
  public LivingRoom() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>LivingRoom</code>.
   * @param instancename    
   */
  public LivingRoom(String instancename) {
    // Constructor using required slots (change if desired).
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>LivingRoom</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public LivingRoom(LivingRoom proto) {
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>LivingRoom</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "LivingRoom("
         + "instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>LivingRoom</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new LivingRoom(this);
  }
  
  /** 
   *  Test the equality of this <code>LivingRoom</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>LivingRoom</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof LivingRoom) {
      LivingRoom cmp=(LivingRoom)obj;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}
