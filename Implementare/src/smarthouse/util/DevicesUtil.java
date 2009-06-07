package smarthouse.util;

import java.util.Enumeration;
import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.knowledge.base.CurrentModel;
import smarthouse.ontology.beanynizer.Device;
import smarthouse.ontology.beanynizer.Location;

public class DevicesUtil {
	
	public static Vector<Device> getDevices(CreateModel model){
		Vector<Device> devices=new Vector<Device>();
		Vector<String> deviceTypes=getDeviceTypes(model);
		for (String device : deviceTypes)
		{			
			if (!device.equals("Sensor")){
				Vector<String> deviceSubTypes=getDeviceSubTypes(model,device);
				
				for(String d : deviceSubTypes){
					Vector<Device> v=getDevices( d, model );
					devices.ensureCapacity(devices.size() + v.size());
					for(Enumeration<Device> e = v.elements(); e.hasMoreElements(); ){
						devices.add(e.nextElement());
					}
				}
			}
		}
		return devices;
	}
	
	public static Vector<String> getDeviceTypes(CreateModel model) {
		Vector<String> deviceTypes=CurrentModel.getDeviceTypes(model);
		return deviceTypes;
	}
	
	public static Vector<String> getDeviceSubTypes(CreateModel model, String dt) {
		Vector<String> deviceTypes=CurrentModel.getDeviceSubTypes(model, dt);
		return deviceTypes;

	}

	public static String getDeviceType(String ind,CreateModel model) {
		String type=model.getIndividualType(ind);
		return type;

	}
	
	public static Vector<Device> getDevices(String deviceType, CreateModel model) {
		Vector<String> deviceInd=new Vector<String>();
		Vector<Device> devices=new Vector<Device>();
		deviceInd=model.getIndividuals(deviceType);
		
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
		return devices;
	}  

		
}