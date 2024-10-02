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
    private ArrayList<Person> people = new ArrayList<>();
    @FXML
    protected void mainOnClick() {
        title.setText(txtInput.getText());
        System.out.println(txtInput.getText());
    }
}