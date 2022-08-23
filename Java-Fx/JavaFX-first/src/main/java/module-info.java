module com.example.javafxfirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxfirst to javafx.fxml;
    exports com.example.javafxfirst;
}