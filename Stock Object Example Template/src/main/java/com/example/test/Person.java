package com.example.test;

import java.util.ArrayList;

public class Person {
    private String personName;
    private double cash;
    private ArrayList<IndividualStockOwned> isos = new ArrayList<>();

    public Person(String personName, double cash) {
        this.personName = personName;
        this.cash = cash;
    }

    public String buyStock(Stocks stockBought,int numBought) {
        isos.add(new IndividualStockOwned(stockBought, numBought));
        //DO
        //Add to stock owned
        return "nonsense";


    }
    public String sellStock(Stocks stockSold,int numSold){



            return "nonsense";

    }


    public String getPersonName() {
        return personName;
    }

    public double getCash() {
        return cash;
    }
}

