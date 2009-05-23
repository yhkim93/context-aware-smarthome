package contextMap;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.JComboBox;

import ontology.lowerOntology.Location;
import ontology.lowerOntology.Sensor;

import KBLayer.CreateModel;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.rdf.model.Resource;

public class SensorWrapper {
	private static CreateModel model;
	private static String lowerNS="http://www.owl-ontologies.com/Ontology1207603095.owl#";
	private static String upperNS="http://amalia.eu-greenvalley.com/robots/smarthouse_upper.owl#";
	
	SensorWrapper(CreateModel model){
		this.model=model;
		
	}
	public void createSensor(String individualClass,String sensorValue, String timestamp, String deviceStatus,String instanceName,String location) {
		Individual x=model.createIndividual(instanceName,individualClass,lowerNS);
		model.setPropertyValue(instanceName, "sensorValue", sensorValue,true,lowerNS);
		model.setPropertyValue(instanceName, "timestamp",timestamp,true,lowerNS);
		model.setPropertyValue(instanceName, "instanceName", instanceName,true,lowerNS);
		model.setPropertyValue(instanceName, "deviceStatus", deviceStatus,true,lowerNS);
		model.setPropertyValue(instanceName,"hasLocation",location,false,lowerNS);
   }
	
	public Vector getSensorListByType(String sensorType) {
		Vector  sensors=new Vector();
		Vector sensorInd=new Vector();
		sensorInd=model.getIndividuals(sensorType,lowerNS);
		for (int i=0;i<sensorInd.size(); i++) {
			String crt=(String)sensorInd.elementAt(i);
			Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation",lowerNS));
			Sensor s=new Sensor(model.getIndividualPropertyValue(crt,"deviceStatus",lowerNS),
									loc,
									model.getIndividualPropertyValue(crt,"instanceName",lowerNS),
									model.getIndividualPropertyValue(crt,"sensorValue",lowerNS),
									model.getIndividualPropertyValue(crt,"timestamp",lowerNS)
									);
			sensors.addElement(s);
		}
		return sensors;
	}
	
	public Vector getSensorList() {
		Vector  sensors=new Vector();
		Vector sensorInd=new Vector();
		Vector sensorTypes=getSensorTypes();
		
		for(Iterator it=sensorTypes.iterator();it.hasNext();)
		{
		sensorInd=model.getIndividuals((String)it.next(),lowerNS);
		for (int i=0;i<sensorInd.size(); i++) {
			String crt=(String)sensorInd.elementAt(i);
			Location loc=new Location(model.getIndividualPropertyValue(crt,"hasLocation",lowerNS));
			Sensor s=new Sensor(model.getIndividualPropertyValue(crt,"deviceStatus",lowerNS),
									loc,
									model.getIndividualPropertyValue(crt,"instanceName",lowerNS),
									model.getIndividualPropertyValue(crt,"sensorValue",lowerNS),
									model.getIndividualPropertyValue(crt,"timestamp",lowerNS)
									);
			sensors.addElement(s);
		}
		}
		return sensors;
	}
	
	public Vector getSensorTypes(){
		Vector sensorType=new Vector();
		sensorType=model.getSubclasses("Sensor",lowerNS); 
		return sensorType;
		
	}
	
	public Vector getAllowableValue(){
		Vector  v= new Vector() ;
		v=model.getAllowableValues("sensorValue",lowerNS);
		return v;
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
	
	public String getSensorTypeById(String sensorId) {
		Individual ind=model.getIndividualFromURI(sensorId,lowerNS);
		String type="";
		for (Iterator i = ind.listRDFTypes( true ); i.hasNext(); ) {
			  Resource cls = (Resource) i.next();
			  type=cls.getLocalName();
		}
		return type;
	}
	
	
	public void setSensorStatus(String sensorId ,String status){
		model.setPropertyValue(sensorId, "deviceStatus",status,true,lowerNS);
	} 
	
	public void setSensorValue(String sensorId, String s) {
		model.setPropertyValue(sensorId, "sensorValue",s,true,lowerNS);
		model.setPropertyValue(sensorId, "timestamp",new Long(System.currentTimeMillis()).toString(),true,lowerNS);
		
	}
	
	

}
