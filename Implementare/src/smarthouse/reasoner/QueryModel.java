package smarthouse.reasoner;
//import com.hp.hpl.jena.sparql.util.IndentedWriter;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
//import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
/*Query Model example*/
public class QueryModel
{
   
    public static void main(String[] args)
    {
    	/*create a memory model*/
        OntModel base = ModelFactory.createOntologyModel( OntModelSpec.OWL_DL_MEM, null );
    	OntModelSpec spec = new OntModelSpec( OntModelSpec.OWL_DL_MEM );
    	OntModel m = ModelFactory.createOntologyModel( spec, base );
    	/*read the model from a file*/
    	m.read("file:src/ontology/SmartHouse.owl");

    	String queryString = 
        	"PREFIX sensorGui: <http://www.owl-ontologies.com/Ontology1207603095.owl#> "+
        	"SELECT ?sensorValue  "+
        	"WHERE {"+
        	"sensorGui:HumiditySensor1 sensorGui:sensorValue ?sensorValue "+
        	"}";
        
       /* String queryString2 = 
        	"PREFIX sensorGui: <http://www.owl-ontologies.com/Ontology1207603095.owl#> "+
        	"SELECT ?subject ?sensorValue  "+
        	"WHERE {"+
        	"?subject sensorGui:sensorValue ?sensorValue "+
        	"}";*/

      /*  *//*create Query*//*
        Query query = QueryFactory.create(queryString) ;
        query.serialize(new IndentedWriter(System.out,true)) ;
        System.out.println() ;
        
        *//*execute query*//*
        QueryExecution qexec = QueryExecutionFactory.create(query, m) ;
        
        ResultSet results = qexec.execSelect();
        //result formatting in a table output
        ResultSetFormatter.out( System.out, results, query );*/


    }
   
}

