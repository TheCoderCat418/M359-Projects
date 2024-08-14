package com.example.template;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField testInput;

    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText(testInput.getText());
    }
}