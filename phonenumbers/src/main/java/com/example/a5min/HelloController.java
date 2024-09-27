package com.example.a5min;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    public ListView ls1;
    @FXML
    private Label title;
    @FXML
    private TextField txtInput;
    @FXML
    private Button main;
    private String[] phoneBook = {"hello", "boo", "mom", "matter"};
    @FXML
    protected void updateList() {
        ls1.getItems().clear();
        ObservableList<String> ol = FXCollections.observableArrayList();
        for(String name : phoneBook){
            if(name.contains(txtInput.getText())){
                ol.add(name);
            }
        }
        ls1.setItems(ol);
    }
}