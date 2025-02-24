package com.example.template;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Home extends Building{
    private int maxBunnies;
    private int totalBunnies = 0;
    private long spawnTimer;
    public Home(int x, int y){
        super(x,y,"00ff00",true);
        maxBunnies = (int)(Math.random()*5)+1;
        spawnTimer = System.nanoTime();
    }

    public void setSpawnTimer() {
        this.spawnTimer = System.nanoTime();

    }

    public long getSpawnTimer() {
        return spawnTimer;
    }

    public void expandBuilding(){
        //add more loctions
    }

    public void spawnBunnies(ArrayList<Animal> animals){
        //need to spawn bunny where you want it to start
        if(totalBunnies< maxBunnies){
            animals.add(new Bunny(getLocations().getFirst().getX() +1,getLocations().getFirst().getY(), this));
            System.out.println("spawn bunny");
            totalBunnies++;
        }

    }

}
