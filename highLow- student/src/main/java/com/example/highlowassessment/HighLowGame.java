package com.example.highlowassessment;

public class HighLowGame {

    /*
    This is the only place you should code. You can use controller to check your code, but that is not mandatory.
    The goal is for a computer to try to guess a mystery number. The user chooses a number between 1-10 and the number of attempts the computer has.
    The computer will randomly guess a number between 1 - 10. If they guess the mystery number -> true. If they do not -> false.
     */

    public boolean computerGuess(int numToGuess, int attempt){
        for (int i = 0; i<attempt; i++){
            int num = (int)(Math.random()*11);
            if(num == numToGuess){
                return true;
            }
        }
        return false;
    }

}
