/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Location.
 * Feel free to change.
 *
 */
package ontology.lowerOntology;


/**
 *  Editable Java class for concept <code>Location</code> of SmartHouseOntology ontology.
 */
public class Location  extends LocationData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Location</code>.
   */
  public Location() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Location</code>.
   * @param instancename    
   */
  public Location(String instancename) {
    // Constructor using required slots (change if desired).
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Location</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Location(Location proto) {
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Location</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "Location("
         + "instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>Location</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Location(this);
  }
  
  /** 
   *  Test the equality of this <code>Location</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Location</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Location) {
      Location cmp=(Location)obj;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

