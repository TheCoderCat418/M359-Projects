package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtInput;
    public TextField txt00,txt01,txt02,txt03,txt04,txt05,txt06,txt07,
            txt08,txt09,txt10,txt11,txt12,txt13,txt14,txt15,
            txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,
            txt24,txt25,txt26,txt27,txt28,txt29,txt30,txt31,
            txt32,txt33,txt34,txt35,txt36,txt37,txt38,txt39,
            txt40,txt41,txt42,txt43,txt44,txt45,txt46,txt47;

    private ArrayList<TextField> row1 = new ArrayList<>();
    private ArrayList<Character> userAnswer = new ArrayList<>();
    private int rowCheck=1;
    public void handleClick(ActionEvent actionEvent) {
       row1.add(txt00);row1.add(txt01);row1.add(txt02);row1.add(txt03);row1.add(txt04);row1.add(txt05);row1.add(txt06);row1.add(txt07);
       row1.add(txt08);row1.add(txt09);row1.add(txt10);row1.add(txt11);row1.add(txt12);row1.add(txt13);row1.add(txt14);row1.add(txt15);
       row1.add(txt16);row1.add(txt17);row1.add(txt18);row1.add(txt19);row1.add(txt20);row1.add(txt21);row1.add(txt22);row1.add(txt23);
       row1.add(txt24);row1.add(txt25);row1.add(txt26);row1.add(txt27);row1.add(txt28);row1.add(txt29);row1.add(txt30);row1.add(txt31);
       row1.add(txt32);row1.add(txt33);row1.add(txt34);row1.add(txt35);row1.add(txt36);row1.add(txt37);row1.add(txt38);row1.add(txt39);
       row1.add(txt40);row1.add(txt41);row1.add(txt42);row1.add(txt43);row1.add(txt44);row1.add(txt45);row1.add(txt46);row1.add(txt47);

    }


    public void handleCheckAnswer(ActionEvent actionEvent) {
//        System.out.println(row1.get(0).getText());
        userAnswer.clear();
        for (int i = rowCheck*8-8; i < rowCheck*8; i++) {
            String temp = row1.get(i).getText();
            userAnswer.add(temp.charAt(0));

        }
        System.out.println(userAnswer);
        rowCheck++;

    }

    public void handleColorChangeExample(ActionEvent actionEvent) {
        txt00.setStyle("-fx-control-inner-background: red;");
    }
}