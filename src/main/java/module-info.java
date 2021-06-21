module TestJena {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    requires org.apache.jena.core;
    requires org.apache.jena.base;
    requires org.apache.jena.iri;
    requires org.apache.jena.ext.com.google;

    opens org.example to javafx.fxml;
    exports org.example;
}
