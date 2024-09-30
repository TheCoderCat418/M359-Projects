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
    public ListView<String> ls1;
    public TextField shift;
    public TextField text;
    public Label out;
    @FXML
    private TextField txtInput;
    private String[] phoneBook = {"Mr. Cortez", "Ms. Toman", "Martin Sunhan Choi", "David Gotter", "Elliott Herman", "Bryce Hirschfeld", "Teerudt Kittivat (Peyton)", "Rachith Varun Kolla", "Vikram Krishnamoorthi", "Aidan Molberger", "Aishanur Moldosanova (Amina)", "Joshua Park", "Aashna Patel", "Reyna Patel", "Tanish Patel", "Kostiantyn Pleshakov", "Ahsan Rida", "Kamran Singri", "Anya Thakker", "Jayden Tu", "Arjun Wadhwa"};
    @FXML
    protected void updateList() {
        ls1.getItems().clear();
        ObservableList<String> ol = FXCollections.observableArrayList();
        for(String name : phoneBook){
            if(name.toUpperCase().contains(txtInput.getText().toUpperCase())){
                ol.add(name);
            }
        }
        ls1.setItems(ol);
    }
    @FXML
    protected void initialize(){
        updateList();
    }
    @FXML
    protected void ceaserChipher(){
        String finals = "";
        for(int i =0 ; i<text.getText().length();i++){
            int start = text.getText().toUpperCase().charAt(i);
            if(start == 32){
                finals += " ";
                continue;
            }
            int finish = start+Integer.parseInt(shift.getText());
            while(finish<65 || finish>90){
                if(finish>90){
                    finish-=26;
                }
                if(finish<65){
                    finish+=26;
                }
            }
            finals += Character.toString(Character.toChars(finish)[0]);
        }
        out.setText(finals);
    }
}