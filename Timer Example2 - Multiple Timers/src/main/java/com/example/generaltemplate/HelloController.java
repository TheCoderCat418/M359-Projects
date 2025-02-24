package com.example.generaltemplate;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public Label lblDisplay;

    @FXML
    public TextField txtInput;
    private long timex;
    @FXML
    public void handleClick(ActionEvent actionEvent) {
        timex = System.nanoTime();
//        animateFunction();
        secondTimer();

    }
    public void animateFunction(){
        new AnimationTimer(){
            @Override
            public void handle(long now){
                System.out.println("hello");
            }
        }.start();
    }
    public void secondTimer(){
        new AnimationTimer(){
            @Override
            public void handle(long now){
                if(now - timex >2000000000){
                    System.out.println("2 seconds");
//                    timex = System.nanoTime();
                    stop();
                    animateFunction();
                }
            }
        }.start();
    }

    public void handleWhatever(ActionEvent actionEvent) {
        lblDisplay.setText("lksdfjsdfsdf");
        for (double i = 0; i < 1000000000; i++) {
            System.out.println(i);
        }
        lblDisplay.setText("done");
    }
}