package smarthouse.ontology.beanynizer;

public class Robot extends RobotData implements nuggets.INugget
{
	/** 
	   *  Default Constructor. <br>
	   *  Create a new <code>NonHuman</code>.
	   */
	  public Robot() {
	    // Empty constructor required for JavaBeans (do not remove).
	  }

	  /** 
	   *  Init Constructor. <br>
	   *  Create a new <code>Robot</code>.
	   * @param haslocation    
	   * @param instancename    
	   */
	  public Robot(Location haslocation, String instancename) {
	    // Constructor using required slots (change if desired).
	    setHasLocation(haslocation);
	    setInstanceName(instancename);
	  }


	  /** 
	   *  Clone Constructor. <br>
	   *  Create a new <code>Robot</code>.<br>
	   *  Copy all attributes from <code>proto</code> to this instance.
	   *
	   *  @param proto The prototype instance.
	   */
	  public Robot(Robot proto) {
	    setHasLocation(proto.getHasLocation());
	    setInstanceName(proto.getInstanceName());
	  }

	  //-------- custom code --------
	  
	  
	  //-------- Object methods -----
	  
	  /**
	   *  Get a string representation of this <code>Robot</code>.
	   *  @return The string representation.
	   */
	  public String toString() {
	    return "Robot("
	         + "haslocation="+getHasLocation()
	         + ", instancename="+getInstanceName()
	         + ")";
	  }
	  
	  /** 
	   *  Get a clone of this <code>Robot</code>.
	   *  @return a shalow copy of this instance.
	   */
	  public Object clone() {
	    return new Robot(this);
	  }
	  
	  /** 
	   *  Test the equality of this <code>Robot</code> 
	   *  and an object <code>obj</code>.
	   *
	   *  @param obj the object this test will be performed with
	   *  @return false if <code>obj</code> is not of <code>Robot</code> class,
	   *          true if all attributes are equal.   
	   */
	  public boolean equals(Object obj) {
	    if (obj instanceof Robot) {
	      Robot cmp=(Robot)obj;
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
