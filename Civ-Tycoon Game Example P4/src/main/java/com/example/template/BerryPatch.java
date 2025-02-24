package com.example.template;

public class BerryPatch extends Building{
    private int amountOfFood;

    public BerryPatch(int x, int y,boolean visible){
        super(x,y,"ff000d",visible);
        amountOfFood = 5;

    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }
}
