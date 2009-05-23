package KBLayer;

import java.util.Vector;

public class CurrentModel {
	
	public static Vector getSensorTypes(CreateModel model){
		Vector sensorType=new Vector();
		//sensorType=model.getSubclasses("Sensor"); 
		return sensorType;
	}
	
	public static Vector getDeviceTypes(CreateModel model){
		Vector deviceType=new Vector();
		//deviceType=model.getDirectSubclasses("Device"); 
		return deviceType;
	}
	
	public static Vector getDeviceSubTypes(CreateModel model, String devicetype){
		Vector deviceType=new Vector();
		//deviceType=model.getDirectSubclasses(devicetype); 
		return deviceType;
	}
	
	public static Vector getDeviceTypeIndividuals(CreateModel model,String deviceType) {
		Vector deviceInd=new Vector();
		Vector devices=new Vector();
		/*deviceInd=model.getIndividuals(deviceType);
		if (deviceInd!=null){
			for (int i=0;i<deviceInd.size(); i++) {
				String crt=(String)deviceInd.elementAt(i);
				Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation"));
				Device s=new Device(model.getIndividualPropertyValue(crt,"deviceStatus"),
										loc,
										model.getIndividualPropertyValue(crt,"instanceName"),
										model.getIndividualPropertyValue(crt,"timestamp")
										);
				
				devices.addElement(s);
			}
		}*/
		return devices;
	}
	
	public static Vector getSensorTypeIndividuals(CreateModel model,String sensorType) {
		Vector sensorInd=new Vector();
		Vector sensors=new Vector();
		/*sensorInd=model.getIndividuals(sensorType);
		for (int i=0;i<sensorInd.size(); i++) {
			String crt=(String)sensorInd.elementAt(i);
			Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation"));
			Sensor s=new Sensor(model.getIndividualPropertyValue(crt,"deviceStatus"),
									loc,
									model.getIndividualPropertyValue(crt,"instanceName"),
									model.getIndividualPropertyValue(crt,"sensorValue"),
									model.getIndividualPropertyValue(crt,"timestamp")
									);
			
			sensors.addElement(s);
		}*/
		return sensors;
	}

	

}
