package com.example.a5min;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label title;
    @FXML
    private TextField txtInput;
    @FXML
    private Button main;

    @FXML
    protected void mainOnClick() {
        int x = 5;
        while(x>0){
            x--;
            System.out.println(x);
        }
    }
}