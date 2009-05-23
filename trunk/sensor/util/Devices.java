package sensor.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import ontology.lowerOntology.Device;
import ontology.lowerOntology.Location;
import ontology.lowerOntology.Sensor;
import KBLayer.CreateModel;
import KBLayer.CurrentModel;

public class Devices {
	
	public static Vector getDevices(CreateModel model){
		Vector devices=new Vector();
		Vector deviceTypes=getDeviceTypes(model);
		Iterator dit=deviceTypes.iterator();
		while (dit.hasNext())
		{
			String t=(String)dit.next();
			if (!t.equals("Sensor")){
				Vector deviceSubTypes=getDeviceSubTypes(model,t);
				Iterator it = deviceSubTypes.iterator();
				while(it.hasNext()){
					Vector v=getDevices((String)it.next(),model);
					devices.ensureCapacity(devices.size() + v.size());
					for(Enumeration e = v.elements(); e.hasMoreElements(); ){
						devices.add(e.nextElement());
					}
				}
			}
		}
		return devices;
	}
	
	public static Vector getDeviceTypes(CreateModel model) {
		Vector deviceTypes=CurrentModel.getDeviceTypes(model);
		return deviceTypes;
	}
	
	public static Vector getDeviceSubTypes(CreateModel model, String dt) {
		Vector deviceTypes=CurrentModel.getDeviceSubTypes(model, dt);
		return deviceTypes;

	}

	public static String getDeviceType(String ind,CreateModel model) {
		//String type=model.getIndividualType(ind);
		String type="";
		return type;

	}
	
	public static Vector getDevices(String deviceType, CreateModel model) {
		Vector deviceInd=new Vector();
		Vector devices=new Vector();
		/*deviceInd=model.getIndividuals(deviceType);
		for (int i=0;i<deviceInd.size(); i++) {
			String crt=(String)deviceInd.elementAt(i);
			Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation"));
			Device s=new Device(model.getIndividualPropertyValue(crt,"deviceStatus"),
					loc,
					model.getIndividualPropertyValue(crt,"instanceName"),
					model.getIndividualPropertyValue(crt,"timestamp")
			);

			devices.addElement(s);
		}*/
		return devices;
	}  

		
}