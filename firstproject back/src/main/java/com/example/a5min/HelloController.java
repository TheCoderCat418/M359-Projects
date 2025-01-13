package com.example.a5min;

import javafx.animation.AnimationTimer;
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
        new AnimationTimer() {

            @Override
            public void handle(long now) {
                System.out.println(now);
            }
            
        }.start();
    }
}