/*
 * $class.javaName.java
 *
 * Generated by Protege plugin Beanynizer. 
 * This class implements the functionality of Garage.
 * Feel free to change.
 *
 */
package smarthouse.ontology.beanynizer;


/**
 *  Editable Java class for concept <code>Garage</code> of SmartHouseOntology ontology.
 */
public class Garage  extends GarageData implements nuggets.INugget
{
  //-------- constructors --------

  /** 
   *  Default Constructor. <br>
   *  Create a new <code>Garage</code>.
   */
  public Garage() {
    // Empty constructor required for JavaBeans (do not remove).
  }

  /** 
   *  Init Constructor. <br>
   *  Create a new <code>Garage</code>.
   * @param instancename    
   */
  public Garage(String instancename) {
    // Constructor using required slots (change if desired).
    setInstanceName(instancename);
  }


  /** 
   *  Clone Constructor. <br>
   *  Create a new <code>Garage</code>.<br>
   *  Copy all attributes from <code>proto</code> to this instance.
   *
   *  @param proto The prototype instance.
   */
  public Garage(Garage proto) {
    setInstanceName(proto.getInstanceName());
  }

  //-------- custom code --------
  
  
  //-------- Object methods -----
  
  /**
   *  Get a string representation of this <code>Garage</code>.
   *  @return The string representation.
   */
  public String toString() {
    return "Garage("
         + "instancename="+getInstanceName()
         + ")";
  }
  
  /** 
   *  Get a clone of this <code>Garage</code>.
   *  @return a shalow copy of this instance.
   */
  public Object clone() {
    return new Garage(this);
  }
  
  /** 
   *  Test the equality of this <code>Garage</code> 
   *  and an object <code>obj</code>.
   *
   *  @param obj the object this test will be performed with
   *  @return false if <code>obj</code> is not of <code>Garage</code> class,
   *          true if all attributes are equal.   
   */
  public boolean equals(Object obj) {
    if (obj instanceof Garage) {
      Garage cmp=(Garage)obj;
      if (getInstanceName()!=cmp.getInstanceName() &&
           (getInstanceName()==null || !getInstanceName().equals(cmp.getInstanceName()))
          ) return false;
      return true;
    }
    return false;
  }
}

