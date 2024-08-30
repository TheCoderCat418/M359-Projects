package com.example.a5min;

public class Person {
    private String name;
    private String petName;
    private int petAge;
    private boolean active;
    private String vetResults;


    public Person(String name, String petName, int petAge){
        this.name = name;
        this.petAge = petAge;
        this.petName = petName;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public boolean isActive(){
        return active;
    }

    public String getName() {
        return name;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setVetResults(String vetResults) {
        this.vetResults = vetResults;
    }

    public String getVetResults() {
        return vetResults;
    }
}
