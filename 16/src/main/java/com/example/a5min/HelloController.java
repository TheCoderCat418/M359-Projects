package com.example.a5min;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    @FXML
    private Label title;
    @FXML
    private TextField txtInput;
    @FXML
    private Button main;

    public HelloController(){
        System.out.println("Hey");

    }

    public void initialize(){
        label2.setText("what is your teachers name");
    }

    @FXML
    protected void mainOnClick() {
        title.setText(txtInput.getText());
        System.out.println(txtInput.getText());
    }

    public void handleCheckAnswer(ActionEvent actionEvent) {
        try {
            int num1 = Integer.parseInt(txt1.getText());
            int num2 = Integer.parseInt(txt2.getText());
            l.setText(Integer.toString(add2num(num1, num2)));
        }catch (NumberFormatException nfe){
            System.out.println(nfe.toString());
        }


    }

    public double div2num(int a, int b){
        return a/(b+0.0);
    }
}