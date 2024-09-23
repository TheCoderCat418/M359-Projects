package com.example.highlowassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField numInput;
    public Label foundOutput;
    public TextField attemptsInput;

    @FXML


    public void playBtn(ActionEvent actionEvent) {

        HighLowGame game = new HighLowGame();
        foundOutput.setText(String.valueOf(game.computerGuess(Integer.parseInt(numInput.getText()),10)));

    }
}