package smarthouse.contextmap;

import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.ontology.beanynizer.Human;
import com.hp.hpl.jena.ontology.Individual;

public class HumanContextMap {
	
	private HashMap<String, Human> m = new HashMap<String, Human>();
	private HumanWrapper w;
	
	
	public HashMap<String, Human> getHumanMap(CreateModel model){
		buildHumanMap(model);
		return m;
		
		
	}
	public void buildHumanMap(CreateModel model){
		w=new HumanWrapper(model);
        
	}
	
	public Vector getHumanList() {
		return w.getHumanList();
	}
	
	public String getHumanState(String humanId){
		return w.getHumanState(humanId);
	}

	public String getHumanActivity(String humanId){
		return w.getHumanActivity(humanId);
	}

	public String getHumanLocation(String humanId){
		return w.getHumanLocation(humanId);
	}
	
	
	public void setHumanState(String humanId ,String state){
		w.setHumanState(humanId, state);
	} 
	
	public void setHumanLocation(String humanId ,String location){
		w.setHumanLocation(humanId, location);
	} 

	public void setHumanActivity(String humanId ,String activity){
		w.setHumanActivity(humanId, activity);
	} 
	
	
	public Vector getAllowableStates(){
		return w.getAllowableStates();
	}
	
	public Vector getAllowableLocations(){
		return w.getAllowableLocations();
	}
		
	public Vector getAllowableActivities(){
		return w.getAllowableActivities();
	}
}

