module com.example.gestorpracticas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;

    opens models;

    opens com.example.gestorpracticas to javafx.fxml;
    exports com.example.gestorpracticas;
}