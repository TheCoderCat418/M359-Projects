package com.example.template;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class HelloController {
    Button[][] btn =new Button[20][20];
    private int[][] board = new int[20][20];
    private ArrayList<RedBug> redBugs = new ArrayList<>();
    private ArrayList<BlueBug> blueBugs = new ArrayList<>();
    @FXML
    private GridPane playBoard;
    public void handleSetup(ActionEvent actionEvent) {
        playBoard.setGridLinesVisible(true);
        playBoard.setVisible(true);
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j] = new Button();
                btn[i][j].setPrefSize(50,50);
                playBoard.add(btn[i][j],j,i);
            }
        }
        EventHandler z = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //all button code goes here
                System.out.println(event.getSource());
                ((Button) event.getSource()).setText("klsdfjsdf");
                System.out.println(((Button) event.getSource()).getText());
                int row = GridPane.getRowIndex(((Button) event.getSource()));
                System.out.println(row);
            }
        };

        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j].setOnAction(z);
            }
        }
    }
    public void updateScreen(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==0){
                    btn[i][j].setStyle("-fx-background-color: #ffffff; ");
                }
                else if(board[i][j]==1){
                    btn[i][j].setStyle("-fx-background-color: #ff0000; ");
                }else if(board[i][j]==2){
                    btn[i][j].setStyle("-fx-background-color: #00ff00; ");
                
                }else if(board[i][j]==3){
                btn[i][j].setStyle("-fx-background-color: #0000ff; ");
                }
            }
        }
    }
    public void handleStartTimer(ActionEvent actionEvent) {
        new AnimationTimer(){

            @Override
            public void handle(long now) {
                for(RedBug rb : redBugs){
                //if(now-redBugs.get(0).getStartTime()>10000000000.0){
                    rb.changeLocation(board);
                    rb.setStartTime();
                //}
            }
            for(BlueBug rb : blueBugs){
                //if(now-redBugs.get(0).getStartTime()>10000000000.0){
                    rb.changeLocation(board);
                    rb.setStartTime();
                //}
            }
                updateScreen();

            }
        }.start();
    }

    public void handleAddRedBug(ActionEvent actionEvent) {
        redBugs.add(new RedBug(5,5,board));
        blueBugs.add(new BlueBug(10, 10, board));
        board[5][9]=2;
    }
}
