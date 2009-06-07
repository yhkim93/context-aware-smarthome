package smarthouse.contextmap;

import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


import com.hp.hpl.jena.ontology.Individual;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.ontology.beanynizer.Sensor;

public class SensorContextMap {
	
	private HashMap<String, Sensor> m = new HashMap<String, Sensor>();
	private SensorWrapper w;
	
	
	public HashMap<String, Sensor> getSensorMap(CreateModel model){
		buildSensorMap(model);
		return m;
		
		
	}
	public void buildSensorMap(CreateModel model){
		w=new SensorWrapper(model);
		Iterator it=w.getSensorList().iterator();
        while (it.hasNext()){
        	Sensor ss=(Sensor)it.next();
        	m.put(ss.getInstanceName(),ss);
	    }
        //System.out.println(m.toString());
        
	  }
	
	
		
	public Vector<Sensor> getSensorsByType(String sensorType){
		Vector<Sensor> v=new Vector<Sensor>();
		for (Map.Entry<String, Sensor> e : m.entrySet()){
		    if ((w.getSensorTypeById(e.getKey())).equals(sensorType)){
		    	Sensor s=e.getValue();
		    	v.addElement(s);
		    }
		}
		return v;
	}

	public Vector<String> getSensorsIdsByType(String sensorType){
		Vector<String> v=new Vector<String>();
		for (Map.Entry<String, Sensor> e : m.entrySet()){
		    if ((w.getSensorTypeById(e.getKey())).equals(sensorType)){
		    	Sensor s=e.getValue();
		    	v.addElement(s.getInstanceName());
		    }
		}
		return v;
	}
	
	public Vector<String> getSensorTypes(){
		HashSet<String> s=new HashSet<String>();
		for (Map.Entry<String, Sensor> e : m.entrySet()){
		    String type=w.getSensorTypeById(e.getKey());
		    s.add(type);
		 }
		
		Vector<String> v=new Vector<String>(s);
		return v;
	}

	public Vector getAllowableValue(){
		return w.getAllowableValue();
	}
	
	public Vector getAllowableStatus(){
		return w.getAllowableStatus();
	}
	
	public Vector getAllowableLocations(){
		return w.getAllowableLocations();
	}
	
	public Sensor getSensorById(String id){
		for (Map.Entry<String, Sensor> e : m.entrySet()){
		    if ((e.getKey()).equals(id)){
		    	Sensor s=e.getValue();
		    	return s;
		    }
		}
		return null;
	}
	
	public static void main(String[] args) {
	    SensorContextMap c=new SensorContextMap();
	    //c.buildSensorMap();  
	        
        
    }
	
	public void createSensor(String individualClass,String sensorValue, String timestamp, String deviceStatus,String instanceName,String location) {
	w.createSensor(individualClass, sensorValue, timestamp, deviceStatus, instanceName, location);
	}
	
	public void setSensorStatus(String sensorId ,String status){
		w.setSensorStatus(sensorId, status);
	}
	
		
	public void setSensorValue(String sensorId ,String s){
		w.setSensorValue(sensorId, s);
	}


		
	
}

