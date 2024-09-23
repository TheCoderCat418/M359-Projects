package com.example.a5min;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label title;
    @FXML
    private TextField txtInput;
    @FXML
    private Button main;

    @FXML
    protected void mainOnClick() {


        ArrayList<Integer> ma = new
    }
    public void rmrf(ArrayList<Integer> myArray){
        for(int i = 0; i<myArray.size();i++){
            myArray.remove(0);
        }
    }
}