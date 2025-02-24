package com.example.template;

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
    private long timestart =0;
    //mutator
    public void handleClick(ActionEvent actionEvent) {
        new AnimationTimer(){

            @Override
            public void handle(long now) {
//                System.out.println(now);
//                System.out.println(timestart - System.currentTimeMillis());
//                lblDisplay.setText(System.currentTimeMillis() - timestart +"");
                lblDisplay.setText(now - timestart +"");

            }
        }.start();
    }

    public void handleClick1(ActionEvent actionEvent) {
        lblDisplay.setText("hello");
//        timestart = System.currentTimeMillis();
        timestart = System.nanoTime();
    }
}