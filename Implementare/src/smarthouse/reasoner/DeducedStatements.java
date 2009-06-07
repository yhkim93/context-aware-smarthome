package smarthouse.reasoner;


import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;


import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class DeducedStatements {
	private CreateModel model;
	private InfModel infmodel;
	private String uri;
	private Resource jane;
	private Resource john ;
	private Resource mary ;
	private Resource littlejohn ;
	private Vector<Resource> humans;

	public DeducedStatements(CreateModel model, InfModel infModel, String uri){
		this.model=model;
		this.infmodel=infModel;
		this.uri=uri;
		jane = model.getModel().getResource(uri + "Jane");
		john = model.getModel().getResource(uri + "John");
		mary = model.getModel().getResource(uri + "Mary");
		littlejohn = model.getModel().getResource(uri + "LittleJohn");
		humans=new Vector<Resource>();
		humans.addElement(jane);
		humans.addElement(john);
		humans.addElement(mary);
		humans.addElement(littlejohn);
	}

	public void deduceAuthorization(){
		
		Property auth = model.getModel().getProperty(uri, "isAuthenticatedBy");

		for(Resource human : humans)
		{
			
			Resource r = null;
			
			StmtIterator ii = model.getModel().listStatements(human, auth, (RDFNode)null);
			if (ii.hasNext()){
				Statement ss1=(Statement)ii.next();
				System.out.println("initial statements:"+ss1.getSubject().getLocalName()+" "+ss1.getPredicate().getLocalName()+" "+ss1.getResource().getLocalName());


				StmtIterator iii = infmodel.getDeductionsModel().listStatements(human,auth, (RDFNode)null);
				if (iii.hasNext()){
					Statement ss2=(Statement)iii.next();
					System.out.println("inferred: "+ss2.getSubject().getLocalName()+" "+ss2.getPredicate().getLocalName()+" "+ss2.getResource().getLocalName());
					r=ss2.getResource();
				}

				if (r!=null)
					ss1.changeObject(r);

				StmtIterator fi = model.getModel().listStatements(human, auth, (RDFNode)null);
				while (fi.hasNext()) {
					Statement ss=(Statement)fi.next();
					System.out.println("After updating the ontology \n"+ss.getSubject().getLocalName()+" "+ss.getPredicate().getLocalName()+" "+ss.getResource().getLocalName());
				}


			}	
		}
	}

	public void deduceLocation(){
		Property loc = model.getModel().getProperty(uri, "hasLocation");
		
		for(Resource human : humans)
		{
		
			Statement ss1=null;
			String s="";
			Resource r=null;
			
			StmtIterator locii = model.getModel().listStatements(human, loc, (RDFNode)null);
			if (locii.hasNext()){
				ss1=(Statement)locii.next();
				System.out.println("initial statements:"+ss1.getSubject().getLocalName()+" "+ss1.getPredicate().getLocalName()+" "+ss1.getResource().getLocalName());
			}

			StmtIterator loci = infmodel.getDeductionsModel().listStatements(human, loc, (RDFNode)null);
			if (loci.hasNext()){
				Statement ssl=(Statement)loci.next();
				RDFNode obj = (RDFNode)ssl.getObject();
				if (obj instanceof Resource) {
					r=(Resource) obj;
					s=r.getLocalName();
				}
				else {
					System.out.print("!!! Literal");
				}
				System.out.println("Inferred: user: "+ssl.getSubject().getLocalName()+" changed location to room "+s);
			}
			

			if (r!=null)
			ss1.changeObject(r);
			
			StmtIterator fi = model.getModel().listStatements(human, loc, (RDFNode)null);
			while (fi.hasNext()) {
				Statement ss=(Statement)fi.next();
				System.out.println("After updating the ontology \n"+ss.getSubject().getLocalName()+" "+ss.getPredicate().getLocalName()+" "+ss.getResource().getLocalName());
			}
		
		}

	}


}