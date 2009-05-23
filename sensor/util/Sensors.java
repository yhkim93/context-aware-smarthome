package sensor.util;

import KBLayer.CreateModel;
import KBLayer.CurrentModel;
import ontology.lowerOntology.Sensor;

import java.util.Enumeration;
import java.util.Vector;

public class Sensors {
	
	/*returns a vector of all sensor instances*/
	public static Vector getSensors(CreateModel model){
		Vector sensors=new Vector();
		Vector sensorTypes=getSensorTypes(model);
		java.util.Iterator it = sensorTypes.iterator();
		while(it.hasNext()){
			Vector v=getSensors((String)it.next(),model);
			sensors.ensureCapacity(sensors.size() + v.size());
			for(Enumeration e = v.elements(); e.hasMoreElements(); ){
				sensors.add(e.nextElement());
			}
		}
		return sensors;
	}
	
	/*returns a vector of all sensor types*/
	
	public static Vector getSensorTypes(CreateModel model) {
		Vector sensorTypes=CurrentModel.getSensorTypes(model);
		return sensorTypes;

	}
	
	/*returns the type for a sensor*/
	
	public static String getSensorType(String ind,CreateModel model) {
		//String type=model.getIndividualType(ind);
		String type="";
		return type;

	}
	/* returns all sensors of a specific type*/
	public static Vector getSensors(String sensorType, CreateModel model) {
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

		
	public static Sensor getSensor(String sensorId,CreateModel model) {
		//Location loc=new Location(model.getIndividualPropertyValue(sensorId,"hasLocation"));
		/*Sensor s=new Sensor(model.getIndividualPropertyValue(sensorId,"deviceStatus"),
				loc,
				model.getIndividualPropertyValue(sensorId,"instanceName"),
				model.getIndividualPropertyValue(sensorId,"sensorValue"),
				model.getIndividualPropertyValue(sensorId,"timestamp")
		);*/
		Sensor s=new Sensor();

		return s;	

	}  

}