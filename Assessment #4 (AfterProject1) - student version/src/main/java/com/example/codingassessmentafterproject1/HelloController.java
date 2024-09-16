package com.example.codingassessmentafterproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField tempInput;
    public TextField nameInput;
    public TextField seasonInput;
    public Label needCoatOutput;
    @FXML
    private Label welcomeText;

    @FXML


    public void needACoatBtn(ActionEvent actionEvent) {

       /*
       Using the Person and Temperature class determine if the person needs to wear a coat. All of FXML is complete.
       All you need to change is the Controller and the Temperature Class.
       When inputting the season please only use lower case otherwise the test cases will not work.
        */
        Person p = new Person(nameInput.getText(), seasonInput.getText());
        Temperature t = new Temperature();
        needCoatOutput.setText(Boolean.toString(t.needCoat(Integer.parseInt(tempInput.getText()), p.getName())));

    }
}