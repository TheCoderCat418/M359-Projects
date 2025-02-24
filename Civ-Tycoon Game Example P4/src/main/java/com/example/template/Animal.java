package com.example.template;

import java.util.ArrayList;

public class Animal {
    private ArrayList<Location> locations = new ArrayList<>();
    private long startTime;
    public Animal(){

    }
    public Animal(int x, int y,String color) {
        locations.add(new Location(x, y, color));
        startTime = System.nanoTime();
    }

    public void findWithinDistance(ArrayList<Building> buildings, int numSquares){

        for (int i = 0; i < buildings.size(); i++) {
            if (locations.getFirst().getX() - numSquares <= buildings.get(i).getLocations().getFirst().getX()
                    && locations.getFirst().getX() + numSquares >= buildings.get(i).getLocations().getFirst().getX()
                    && locations.getFirst().getY() - numSquares <= buildings.get(i).getLocations().getFirst().getY()
                    && locations.getFirst().getY() + numSquares >= buildings.get(i).getLocations().getFirst().getY()){
                System.out.println("found building");
                if( buildings.get(i)  instanceof BerryPatch){
                    buildings.get(i).setVisible(true);
                }
            }
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.nanoTime();
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }
    //move random
    public void moveAnimal(int numColumns, int numRows){
        //fix out of bounds
        int currentx=locations.getFirst().getX();
        int currenty=locations.get(0).getY();
        int ydirection = (int)(Math.random()*3);
        int xdirection = (int)(Math.random()*3);
        if (xdirection ==0){
            currentx = currentx+1;
        }else if(xdirection==1){
            currentx = currentx-1;
        }
        if (ydirection ==0){
            currenty = currenty+1;
        }else if(ydirection==1){
            currenty = currenty-1;
        }
        if(currentx < numColumns && currentx >-1 && currenty < numRows && currenty >-1){
            locations.getFirst().setX(currentx);
            locations.getFirst().setY(currenty);
        }
    }
}
