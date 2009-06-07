package smarthouse.contextmap;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComboBox;

import smarthouse.knowledge.base.CreateModel;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.rdf.model.Resource;

public class HumanWrapper {
	private static CreateModel model;
	private static String lowerNS="http://www.owl-ontologies.com/Ontology1207603095.owl#";
	private static String upperNS="file:D:/WSAmalia/workspace/SmartHouse/src/ontology/smarthouse_upper.owl#";
	
	HumanWrapper(CreateModel model){
		this.model=model;
		
	}
	
	public Vector getHumanList() {
		Vector  humans=new Vector();
	
		humans=model.getIndividuals("Human",upperNS);
		//System.out.println(humans.toString());
		return humans;
	}
	
	public Vector getAllowableStates(){
		Vector v=model.getIndividuals("State",upperNS);
		return v;
	}
	
	public Vector getAllowableLocations(){
		Vector v=model.getIndividuals("IndoorSpace",upperNS);
		return v;
	}
	
	public Vector getAllowableActivities(){
		Vector v=model.getIndividuals("Activity",upperNS);
		return v;
	}

	public String getHumanState(String humanId){
		String v=model.getIndividualPropertyValue(humanId,"hasState",lowerNS);
		return v;
	}

	public String getHumanActivity(String humanId){
		String v=model.getIndividualPropertyValue(humanId,"hasActivity",lowerNS);
		//System.out.println(humanId+v);
		return v;
	}

	public String getHumanLocation(String humanId){
		String v=model.getIndividualPropertyValue(humanId,"hasLocation",lowerNS);
		return v;
	}
	
	public void setHumanState(String humanId ,String state){
		model.setPropertyValue(humanId, "hasState",state,false,lowerNS);
	} 

	public void setHumanLocation(String humanId ,String location){
		model.setPropertyValue(humanId,"hasLocation",location,false,lowerNS);
	} 

	public void setHumanActivity(String humanId ,String activity){
		model.setPropertyValue(humanId,"hasActivity",activity,false,lowerNS);
	} 
	
	   
	
	
	
}
