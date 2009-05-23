package PresentationLayer;
import PresentationLayer.util.SensorGui;
import jadex.runtime.IExternalAccess;

import javax.swing.*;
import java.awt.*;

public class Gui  {

	public Gui(final IExternalAccess agent){

		agent.getLogger().info("x"+agent.getAgentName());

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SensorGui s=new SensorGui(agent);
				JFrame frame = new JFrame("Monitoring Interface");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(1024,768));
				frame.getContentPane().add(s.getPanel());
				frame.pack();
				frame.setVisible(true);
			}
		});


	}
}
