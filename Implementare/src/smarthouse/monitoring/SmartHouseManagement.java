package smarthouse.monitoring;
import java.awt.Dimension;
import javax.swing.JFrame;

import smarthouse.monitoring.util.SmartHouseMonitoringUtil;
import jadex.runtime.*;

public class SmartHouseManagement  {
	private IExternalAccess agent;

	public SmartHouseManagement(final IExternalAccess agent){

		agent.getLogger().info("x"+agent.getAgentName());
		this.agent = agent;
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SmartHouseMonitoringUtil s=new SmartHouseMonitoringUtil(agent);
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
