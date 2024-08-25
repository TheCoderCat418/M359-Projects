package com.example.a5min;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField q1;
    @FXML
    private TextField q2;
    @FXML
    private TextField q3;
    @FXML
    private Label qAnswer;

    @FXML
    private TextField s1;
    @FXML
    private TextField s2;
    @FXML
    private Label sAnswer;
    @FXML
    private Label rAnswer;
    @FXML
    private TextField rn1;
    @FXML
    private TextField r1;
    @FXML
    private Label rdAnswer1;
    @FXML
    protected void roundOnClick(){
        rdAnswer1.setText(Integer.toString((int)(Math.round(Double.parseDouble(r1.getText())))));
    }

    @FXML
    protected void quadraticOnClick() {
        double dis = discriminant(Integer.parseInt(q1.getText()), Integer.parseInt(q2.getText()), Integer.parseInt(q3.getText()));
        if(dis < 0){
            qAnswer.setText("No Real Solutions");
        }else if(dis == 0){
            qAnswer.setText(Integer.toString(quadratic(Integer.parseInt(q1.getText()), Integer.parseInt(q2.getText()))));
        }else if(dis > 0){
            String a1 = Double.toString(quadratic(Integer.parseInt(q1.getText()), Integer.parseInt(q2.getText()), dis, true));
            String a2 = Double.toString(quadratic(Integer.parseInt(q1.getText()), Integer.parseInt(q2.getText()), dis, false));

            qAnswer.setText(a1+" and "+a2);
        }
    }
    @FXML
    protected void slopeOnClick(){
        double x1,y1,x2,y2;
        x1 = Integer.parseInt(s1.getText().substring(s1.getText().indexOf("(")+1, s1.getText().indexOf(",")));
        y1 = Integer.parseInt(s1.getText().substring(s1.getText().indexOf(",")+1, s1.getText().indexOf(")")));
        x2 = Integer.parseInt(s2.getText().substring(s2.getText().indexOf("(")+1, s2.getText().indexOf(",")));
        y2 = Integer.parseInt(s2.getText().substring(s2.getText().indexOf(",")+1, s2.getText().indexOf(")")));
        x1=x1+0.0;
        y1=y1+0.0;

        sAnswer.setText("Slope: "+ Double.toString((y2-y1))+"/"+Double.toString((x2-x1))+"\n"+"Midpoint: ("+Double.toString((x1+x2)/2)+","+Double.toString((y1+y2)/2)+")");
    }
    @FXML
    protected void randomOnClick(){
        rAnswer.setText(generateRandomNumber(Integer.parseInt(rn1.getText())));
    }
    private String generateRandomNumber(int number){
        String ret = "";
        for(int i = 0; i<3; i++){
            int rnum = (int)Math.round(Math.random() * number+0.0);
            ret+=rnum;
            if(i!=2) {
                ret += ", ";
            }
        }
        return ret;
    }
    private int quadratic(int a, int b){
        return -b/2*a;
    }

    private double quadratic(int a, int b, double dis, boolean positive){
        if(positive){
            return (-b+Math.sqrt(dis))/(2*a);
        }else {
            return (-b-Math.sqrt(dis))/(2*a);
        }

    }

    private double discriminant(int a, int b, int c){
        return (Math.pow(b, 2))-4*a*c;
    }
}