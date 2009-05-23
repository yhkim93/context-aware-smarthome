package contextMap;

import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComboBox;

import ontology.lowerOntology.Device;
import ontology.lowerOntology.Location;

import KBLayer.CreateModel;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.rdf.model.Resource;

public class DeviceWrapper {
	private static CreateModel model;
	private static String lowerNS="http://www.owl-ontologies.com/Ontology1207603095.owl#";
	private static String upperNS="http://amalia.eu-greenvalley.com/robots/smarthouse_upper.owl#";
	
	
	DeviceWrapper(CreateModel model){
		this.model=model;
	}

    public void createDevice(String individualClass, String timestamp, String deviceStatus,String instanceName,String location) {
		Individual x=model.createIndividual(instanceName,individualClass,lowerNS);
		model.setPropertyValue(instanceName, "timestamp",timestamp,true,lowerNS);
		model.setPropertyValue(instanceName, "instanceName", instanceName,true,lowerNS);
		model.setPropertyValue(instanceName, "deviceStatus", deviceStatus,true,lowerNS);
		model.setPropertyValue(instanceName,"hasLocation",location,false,lowerNS);
   }
	
	public Vector getDeviceListByType(String deviceType) {
		Vector  devices=new Vector();
		Vector deviceInd=new Vector();
		deviceInd=model.getIndividuals(deviceType,lowerNS);
		for (int i=0;i<deviceInd.size(); i++) {
			String crt=(String)deviceInd.elementAt(i);
			Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation",lowerNS));
			Device s=new Device(model.getIndividualPropertyValue(crt,"deviceStatus",lowerNS),
									loc,
									model.getIndividualPropertyValue(crt,"instanceName",lowerNS),
									model.getIndividualPropertyValue(crt,"timestamp",lowerNS)
									);
			devices.addElement(s);
		}
		return devices;
	}
	
	public Vector getDeviceList() {
		Vector  devices=new Vector();
		Vector deviceTypes=getDeviceTypes();
		Vector deviceSubTypes;
		for(Iterator it=deviceTypes.iterator();it.hasNext();)
		{
			String type=(String)it.next();
			deviceSubTypes=getDeviceSubTypes(type);
			for(Iterator it1=deviceSubTypes.iterator();it1.hasNext();)
			{
				String subType=(String)it1.next();
				if (!(subType.equals("Sensor"))){
					Vector v=getDeviceListByType(subType); 
					devices.addAll(v);
				}
			
			}
		}
		//System.out.println(devices.toString());
		return devices;
	}
	
	public Vector getDeviceTypes(){
		Vector deviceType=new Vector();
		deviceType=model.getDirectSubclasses("Device",lowerNS); 
		return deviceType;
		
	}
	
	public Vector getDeviceSubTypes(String type){
		Vector deviceSubType=new Vector();
		deviceSubType=model.getDirectSubclasses(type,lowerNS); 
		return deviceSubType;
	}
	
	
	public Vector getAllowableStatus(){
		Vector v= new Vector();
		v=model.getAllowableValues("deviceStatus",lowerNS);
		return v;
	}
	
	public Vector getAllowableLocations(){
		Vector v=model.getIndividuals("IndoorSpace",upperNS);
		return v;
	}
	
	public String getDeviceTypeById(String deviceId) {
		Individual ind=model.getIndividualFromURI(deviceId,lowerNS);
		String type="";
		for (Iterator i = ind.listRDFTypes( true ); i.hasNext(); ) {
			  Resource cls = (Resource) i.next();
			  
			  for (Iterator ii=ind.listOntClasses(true); ii.hasNext(); ) {
					OntClass cl=(OntClass)ii.next();
					Iterator ii2=cl.listSuperClasses(true);
					//System.out.println(ii2.next());
					type=((OntClass)ii2.next()).getLocalName();
			  }
			  
		}
		
		return type;
	}
	
	public String getDeviceSubTypeById(String deviceId) {
		Individual ind=model.getIndividualFromURI(deviceId,lowerNS);
		String type="";
		for (Iterator i = ind.listRDFTypes( true ); i.hasNext(); ) {
			  Resource cls = (Resource) i.next();
					type=cls.getLocalName();
		}
		return type;
	}
	
	
	public void setDeviceStatus(String deviceId ,String status){
		model.setPropertyValue(deviceId, "deviceStatus",status,true,lowerNS);
	} 
	
}
