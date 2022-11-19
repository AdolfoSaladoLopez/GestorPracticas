module com.example.gestorpracticas {
    requires javafx.controls;
    requires javafx.fxml;

    opens models;

    opens com.example.gestorpracticas to javafx.fxml;
    exports com.example.gestorpracticas;
}