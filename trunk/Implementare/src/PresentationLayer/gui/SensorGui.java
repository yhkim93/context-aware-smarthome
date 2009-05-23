package PresentationLayer.gui;
import jadex.runtime.*;

public class SensorGui  {
	
	private IExternalAccess agent;
	public static final int TIMEOUT = 15000;
	
	
	public SensorGui(final IExternalAccess agent){
		agent.getLogger().info("x"+agent.getAgentName());
		this.agent = agent;
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	     public void run() {
	    		Fereastra f = new Fereastra();
	    		f.setSize(1024,768);
	    		f.setVisible(true);
	    		f.show();
	      }
	 });
		
	}
	
	
		
	}
	   
	