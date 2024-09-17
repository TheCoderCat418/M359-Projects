module com.example.loopsoffical {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loopsoffical to javafx.fxml;
    exports com.example.loopsoffical;
}