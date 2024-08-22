package com.example.a5min;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField q1;
    @FXML
    private TextField q2;
    @FXML
    private TextField q3;
    @FXML
    private Label qAnwser;
    @FXML
    private Button qMain;

    @FXML
    protected void mainOnClick() {
        int dis = discriminant(Integer.parseInt(q1.getText()), Integer.parseInt(q2.getText()), Integer.parseInt(q3.getText());
        if(dis < 0){
            qAnwser.setText("No Real Solutions");
        }else if(dis == 0){

        }else if(dis > 0){

        }
    }

    private int quadratic(int a, int b){
        return -b/2*a;
    }

    private int quadratic(int a, int b, int dis, boolean positive){
        if(positive){
            return (int)-b+Math.sqrt(dis)/2*a;
        }else {
            return -b/2*a;
        }

    }

    private int discriminant(int a, int b, int c){
        return (int)(Math.pow(b, 2))-4*a*c;
    }
}