module com.example.template {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.base;
    requires transitive javafx.graphics;

    opens com.example.template to javafx.fxml;
    exports com.example.template;
}