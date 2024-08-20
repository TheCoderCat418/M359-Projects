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

    private int score = 0;
    private int question = 1;

    @FXML
    protected void mainOnClick() {
        String a1 = "APCSA";
        String a2 = "CONANT";
        String a3 = "08/20/2024";

        String ui = txtInput.getText();

        if (question == 1) {
            if (checkAnswer(ui, a1)) {score++;}
        }else if (question == 2) {
            if (checkAnswer(ui, a2)) {score++;}
        }else if (question == 3) {
            if (checkAnswer(ui, a3)) {score++;}
        }
        question++;
        if (question < 4) {
            showQuestion(question);
        }else{
            txtInput.clear();
            title.setText("You got "+score+" out of 3 questions! That's "+(score/3.0)*100+"%!");}
    }
    private void showQuestion(int q) {
        String q1 = "What is this class called?";
        String q2 = "What is the schools name";
        String q3 = "What is todays date (MM/DD/YYYY)";

        if (q == 1){
          title.setText(q1);
        }else if (q == 2){
            title.setText(q2);
        }else if (q == 3){
            title.setText(q3);
        }
    }
    private boolean checkAnswer(String userInput, String answer) {
        return userInput.equals(answer);
    }


}