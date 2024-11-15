package com.thecodercat418.TTTSimple;

import java.util.Scanner;

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

    private char[][] board = new char[3][3];
    private Scanner myObj = new Scanner(System.in);

    @FXML
    protected void mainOnClick() {
        title.setText(txtInput.getText());
        System.out.println(txtInput.getText());
    }

    public void initialize(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = '0';
            }
        }
        printBoard();
        playerTurn();
    }

    public void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println("---------");
        
    }

    public void playerTurn(){
        System.out.println("From the bottom left, please state where you would like to place an X");
        System.out.print("x,y > ");
        
        int loop = 1;
        while(loop == 1){
            try{
            String inString = myObj.nextLine();
            String[] broke = inString.split(",");
            int x = Integer.parseInt(broke[0].strip());
            int y = Integer.parseInt(broke[1].strip());
            if(y>3||x>3){
                continue;
            }
            board[2-y][x] = 'X';
            loop = 0;
            } catch (NumberFormatException nfe){
                System.out.println("Try again.");
            }
            }
            botTurn();
        }
        
    

    public void botTurn(){
        int num = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '0'){
                    num++;
                }
            }
        }
        int selNum = (int)(Math.random()*num+1);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '0'){
                    selNum--;
                }
                if(selNum == 0){
                    board[i][j] = 'O';
                    break;
                }
            }
            if(selNum == 0){
                break;
            }
        }
        printBoard();
        
        playerTurn();
    }

    public char checkWin(){
        for(int i = 0; i<3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return board[0][i];
            }
        }
        for(int i = 0; i<3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return board[0][i];
            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][0]){
            return board[0][1];
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return board[0][1];
        }
    }
}