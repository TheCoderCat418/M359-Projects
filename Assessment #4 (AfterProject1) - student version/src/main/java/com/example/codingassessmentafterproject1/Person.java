package com.example.codingassessmentafterproject1;

public class Person {

    String name;
    String favoriteSeason;
    Boolean coat;

    /*
    This class is complete. Nothing should be changed, but you will need to use the class to complete the task.
     */

    public Person(String name, String favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteSeason() {
        return favoriteSeason;
    }

    public Boolean getCoat() {
        return coat;
    }

    public void setCoat(Boolean coat) {
        this.coat = coat;
    }



}
