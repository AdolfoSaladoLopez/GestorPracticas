module com.example.gestorpracticas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens models;

    opens com.example.gestorpracticas to javafx.fxml;
    exports com.example.gestorpracticas;
}