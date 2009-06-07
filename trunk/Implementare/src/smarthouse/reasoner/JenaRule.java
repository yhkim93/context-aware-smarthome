package smarthouse.reasoner;


import smarthouse.knowledge.base.CreateModel;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.reasoner.Reasoner;
import com.hp.hpl.jena.reasoner.rulesys.GenericRuleReasonerFactory;
import com.hp.hpl.jena.util.PrintUtil;
import com.hp.hpl.jena.vocabulary.ReasonerVocabulary;

public class JenaRule {
	private CreateModel model;
	private Reasoner reasoner;
	private InfModel infmodel;
	private String uri;

	JenaRule(CreateModel model,String uriString, String prefix){
		this.model=model;
		uri=uriString;
		PrintUtil.registerPrefix(prefix, uri);
		Resource configuration =  model.getModel().createResource();
		configuration.addProperty(ReasonerVocabulary.PROPruleMode, "hybrid");
		configuration.addProperty(ReasonerVocabulary.PROPruleSet,  "contextModel/test.rules");
	    reasoner = GenericRuleReasonerFactory.theInstance().create(configuration);
	    reasoner.setDerivationLogging(true);
		reasoner.bindSchema(model.getModel());
		infmodel = ModelFactory.createInfModel(reasoner, model.getModel());
		
		
	}
	
	public OntModel getModel(){
		return model.getModel();
	}
	
	public Reasoner getReasoner(){
		return reasoner;
	}
	public void runReasoner(){
		DeducedStatements d=new DeducedStatements(model,infmodel,uri); 
		d.deduceAuthorization();
		d.deduceLocation();
		
		 //infmodel.getDeductionsModel().write(System.out, "N3");
		/*PrintWriter out = new PrintWriter(System.out);
		    for (StmtIterator i = infmodel.listStatements(null, null, (RDFNode)null); i.hasNext(); ) {
		        Statement s = i.nextStatement(); 
		        System.out.println("Statement is " + s);
		        for (Iterator id = infmodel.getDerivation(s); id.hasNext(); ) {
		            Derivation deriv = (Derivation) id.next();
		            deriv.printTrace(out, true);
		        }
				  
		    }
		*/
		
	}
	
	public static void main(String[] args) {
		String ONT = "http://www.owl-ontologies.com/Ontology1207603095.owl#";
		CreateModel jenaModel=new CreateModel(ONT,"file:src/ontology/SmartHouse.owl");
	
		JenaRule e=new JenaRule(jenaModel,"http://www.owl-ontologies.com/Ontology1207603095.owl#","pre");
	 	e.runReasoner();
		
		
}
}