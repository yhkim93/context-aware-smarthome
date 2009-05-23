package contextMap;

import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import ontology.lowerOntology.Device;

import KBLayer.CreateModel;

import com.hp.hpl.jena.ontology.Individual;


public class DeviceContextMap {
	
	private HashMap<String, Device> m = new HashMap<String, Device>();
	private DeviceWrapper w;
	
	
	public HashMap<String, Device> getDeviceMap(CreateModel model){
		buildDeviceMap(model);
		return m;
		
		
	}
	public void buildDeviceMap(CreateModel model){
		w=new DeviceWrapper(model);
		Iterator it=w.getDeviceList().iterator();
        while (it.hasNext()){
        	Device ss=(Device)it.next();
        	m.put(ss.getInstanceName(),ss);
	    }
        
	  }
	
	public Vector<Device> getDevicesByType(String deviceType){
		Vector<Device> v=new Vector<Device>();
		for (Map.Entry<String, Device> e : m.entrySet()){
		    if ((w.getDeviceTypeById(e.getKey())).equals(deviceType)){
		    	Device s=e.getValue();
		    	v.addElement(s);
		    }
		}
		return v;
	}

	public Vector<Device> getDevicesBySubType(String deviceType){
		Vector<Device> v=new Vector<Device>();
		for (Map.Entry<String, Device> e : m.entrySet()){
		    if ((w.getDeviceSubTypeById(e.getKey())).equals(deviceType)){
		    	Device s=e.getValue();
		    	v.addElement(s);
		    }
		}
		return v;
	}
	
	public Vector<String> getDevicesIdsByType(String deviceType){
		Vector<String> v=new Vector<String>();
		for (Map.Entry<String, Device> e : m.entrySet()){
		    if ((w.getDeviceTypeById(e.getKey())).equals(deviceType)){
		    	Device s=e.getValue();
		    	v.addElement(s.getInstanceName());
		    }
		}
		return v;
	}
	
	public Vector getDeviceSubTypes(String type){
	return w.getDeviceSubTypes(type);	
		
	}

	public Vector getDeviceTypes(){
		return w.getDeviceTypes();	
	}
		
	public Vector getAllowableStatus(){
		return w.getAllowableStatus();
	}
	
	public Vector getAllowableLocations(){
		return w.getAllowableLocations();
	}
	
	public Device getDeviceById(String id){
		for (Map.Entry<String, Device> e : m.entrySet()){
			//System.out.println("Keys"+e.getKey());
		    if ((e.getKey()).equals(id)){
		    	Device s=e.getValue();
		    	return s;
		    }
		   // System.out.println(s); 
		}
		return null;
	}
	
	public static void main(String[] args) {
	    DeviceContextMap c=new DeviceContextMap();
	    //c.buildDeviceMap();  
	        
        
    }
	
	public void createDevice(String individualClass, String timestamp, String deviceStatus,String instanceName,String location) {
	w.createDevice(individualClass, timestamp, deviceStatus, instanceName, location);
	}
	
	public void setDeviceStatus(String deviceId ,String status){
		w.setDeviceStatus(deviceId, status);
	}
	


		
	
}

