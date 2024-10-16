package com.example.test;

import java.util.ArrayList;

public class Person {
    private String personName;
    private double cash;


    public Person(String personName, double cash) {
        this.personName = personName;
        this.cash = cash;
    }

    public String buyStock(Stocks stockBought,int numBought) {
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

