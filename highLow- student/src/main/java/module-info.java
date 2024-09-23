module com.example.highlowassessment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.highlowassessment to javafx.fxml;
    exports com.example.highlowassessment;
}