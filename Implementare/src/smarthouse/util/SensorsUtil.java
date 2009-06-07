package smarthouse.util;

import java.util.Enumeration;
import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.knowledge.base.CurrentModel;
import smarthouse.ontology.beanynizer.Location;
import smarthouse.ontology.beanynizer.Sensor;

public class SensorsUtil {
	
	/*returns a vector of all sensor instances*/
	public static Vector<Sensor> getSensors(CreateModel model){
		Vector<Sensor> sensors=new Vector<Sensor>();
		Vector<String> sensorTypes=getSensorTypes(model);
		for(String s : sensorTypes){
			Vector<Sensor> v=getSensors( s , model );
			sensors.ensureCapacity(sensors.size() + v.size());
			for(Enumeration<Sensor> e = v.elements(); e.hasMoreElements(); ){
				sensors.add(e.nextElement());
			}
		}
		return sensors;
	}
	
	/*returns a vector of all sensor types*/
	
	public static Vector<String> getSensorTypes(CreateModel model) {
		Vector<String> sensorTypes=CurrentModel.getSensorTypes(model);
		return sensorTypes;
	}
	
	/*returns the type for a sensor*/
	
	public static String getSensorType(String ind,CreateModel model) {
		
		String type=model.getIndividualType(ind);
		
		return type;

	}
	/*  returns all sensors of a specific type*/
	public static Vector<Sensor> getSensors(String sensorType, CreateModel model) {
		
		Vector<Sensor> sensors=new Vector<Sensor>();
		Vector<String> sensorInd=model.getIndividuals(sensorType);
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
		}
		
		System.out.println("Sensor list size is: "+sensors.size());
		
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