package com.example.formativeassesment2mathstring;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField interest;
    public Label displayInterest;

    /*
    The format the user inputs the values will always be the same, but the values of those number will change.
    For example, your code needs to be able to properly solve for the interest of P=1234,R=.06,T=4 and P=123456,R=.009,T=12
     */
    public void amount(ActionEvent actionEvent) {
        displayInterest.setText(Double.toString(interestEarned(interest.getText())));
    }

    /*
    interest formula is P x R x T divided by 100
     */
    public double interestEarned(String interestValues){
        double P = Double.parseDouble(interestValues.substring(interestValues.indexOf("=")+1, interestValues.indexOf("R")-1));
        double R = Double.parseDouble(interestValues.substring(interestValues.indexOf("=", interestValues.indexOf("R"))+1, interestValues.indexOf("T")-1));
        double T = Double.parseDouble(interestValues.substring(interestValues.indexOf("=", interestValues.indexOf("T"))+1));
        return (P * R * T) / 100.0;
    }


}