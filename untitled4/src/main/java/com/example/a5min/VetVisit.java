package com.example.a5min;

public class VetVisit {
    private int dogAge;
    public VetVisit(int dogAge){
        this.dogAge = dogAge;
    }

    public String doVisit(){
        if(dogAge<3){
            return "dog is young";
        }else{
            return "dog is old";
        }
    }
}
