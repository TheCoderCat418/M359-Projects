package com.example.test;

import java.util.ArrayList;

public class Stocks {
    private String stockName;
    private ArrayList<Double> stockPrice = new ArrayList<>();

    public Stocks(String stockName){
        this.stockName = stockName;
        stockPrice.add((double)(Math.round(Math.random()*100)));
    }

    public ArrayList<Double> getStockPrice() {
        return stockPrice;
    }
    public double getCurrentPrice(){
        return stockPrice.get(stockPrice.size()-1);
    }
    public String getStockName() {
        return stockName;
    }

    public void changeCurrentPrice(){

    }

}
