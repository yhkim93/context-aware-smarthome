package reasoner;

import KBLayer.CreateModel;

public class RuleReasoner {
	private JenaRule engine;

	public RuleReasoner(CreateModel m) {
		engine=new JenaRule(m,"http://www.owl-ontologies.com/Ontology1207603095.owl#","pre");
		System.out.println("Getting inferred model");
		engine.runReasoner();

	}

}
