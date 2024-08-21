package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtInput;

    //get the number from the textbox and put it into an int variable
    //display true if even. call the isEven method and pass the number into it
    public void handleClick(ActionEvent actionEvent) {
        int num = Integer.parseInt(txtInput.getText());
        lblDisplay.setText(isEven(num)+"");
    }

    //use a conditional to see if the number is even.
    //if it is even return true else return false.
    //hint: use the remainder to see if it is even.
    public boolean isEven(int num){
        return num%2 == 0;
    }


}