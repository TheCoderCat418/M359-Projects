module com.example.loopsandarrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loopsandarrays to javafx.fxml;
    exports com.example.loopsandarrays;
}