package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM));
    }
}
