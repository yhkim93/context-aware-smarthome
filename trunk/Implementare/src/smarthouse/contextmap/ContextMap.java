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

public class ContextMap {
	
	private HashMap<String, Sensor> m = new HashMap<String, Sensor>();
	private SensorContextMap sensorMap;
	private DeviceContextMap deviceMap;
	private HumanContextMap humanMap;
	
	
	public ContextMap(CreateModel model){
		sensorMap=new SensorContextMap();
		sensorMap.buildSensorMap(model);
		deviceMap=new DeviceContextMap();
		deviceMap.buildDeviceMap(model);
		humanMap=new HumanContextMap();
		humanMap.buildHumanMap(model);
	}
	
	public SensorContextMap getSensorContextMap(){
		return sensorMap;
	}
	
	public DeviceContextMap getDeviceContextMap(){
		return deviceMap;
	}
	
	public HumanContextMap getHumanContextMap(){
		return humanMap;
	}
	
	public void buildMap(CreateModel model){
		sensorMap.buildSensorMap(model);
		deviceMap.buildDeviceMap(model);
		humanMap.buildHumanMap(model);
		
		
	}
	

		
	
}

