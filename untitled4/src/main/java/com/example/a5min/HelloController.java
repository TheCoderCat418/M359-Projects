package com.example.a5min;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Button btnVisit;
    @FXML
    private Label title;
    @FXML
    private TextField txtInput;
    @FXML
    private Button main;

    private Person p1;
    private Person p2;
    private VetVisit visit;
    private Person tempPerson;

    @FXML
    protected void handleStart() {
        p1 = new Person("bob", "patches", 7);
        p2 = new Person("Anish", "fluffy", 1);
        tempPerson=p1;
        btnVisit.setText(tempPerson.getName()+ ", it is your visit");
        tempPerson.setActive(true);

    }
    @FXML
    public void handleSwitch(ActionEvent actionEvent) {
        if(p1.isActive()){
            p1.setActive(false);
            p2.setActive(true);
            tempPerson=p2;
        }else{
            p1.setActive(true);
            p2.setActive(false);
            tempPerson=p1;
        }
        btnVisit.setText(tempPerson.getName()+ ", it is your visit");
    }
    @FXML
    public void handleVisit(ActionEvent actionEvent) {
        visit = new VetVisit(tempPerson.getPetAge());
        tempPerson.setVetResults(visit.doVisit());
    }
    @FXML
    public void handlep1result(ActionEvent actionEvent) {
        title.setText(p1.getVetResults());
    }
    @FXML
    public void handlep2result(ActionEvent actionEvent) {
        title.setText(p2.getVetResults());
    }
}