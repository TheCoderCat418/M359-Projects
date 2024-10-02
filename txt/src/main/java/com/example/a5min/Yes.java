package com.example.a5min;

import java.io.*;
import java.util.Scanner;

public class Yes {
    public static void main(String[] args){
        String outPutFile = "src/main/resources/stuff.txt";
        try {
            PrintWriter pw = new PrintWriter(outPutFile);
            pw.println("hey");
            pw.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        try{
            FileInputStream fis = new FileInputStream(outPutFile);
            fis.

        }catch (FileNotFoundException fileNotFoundException){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
