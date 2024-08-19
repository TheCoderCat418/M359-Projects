package com.example.a5min;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField txtInput2;
    @FXML
    public Label label2;
    public TextField txt1;
    public TextField txt2;
    public Label l;




    protected void handleCheckAnswer(ActionEvent actionEvent) {
        try {
            int num1 = Integer.parseInt(txt1.getText());
            int num2 = Integer.parseInt(txt2.getText());
            l.setText(Double.toString(modnum(num1, num2)));
        }catch (NumberFormatException nfe){
            System.out.println(nfe.toString());
        }


    }

    public double modnum(int a, int b){
        return a%b;
    }
}