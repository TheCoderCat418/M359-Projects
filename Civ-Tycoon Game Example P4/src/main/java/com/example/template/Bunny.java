package com.example.template;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class Bunny extends Animal{
    private Building connectBuilding;
    public Bunny(int x, int y, Building connected){
        super(x,y,"9F2B68");
        this.connectBuilding = connected;
    }

    public void moveAnimal(String type, Button[][] btns){
        if (type.equals("random")){
            super.moveAnimal(btns[0].length,btns.length);
        }else{
            // move another way
        }
    }

    
    public Location findClosestBerryPatch(ArrayList<Building> buildings){
        boolean found = false;
        while(!found){
            for (int i = 0; i < buildings.size(); i++) {
                if (super.getLocations().getFirst().getX() - numSquares <= buildings.get(i).getLocations().getFirst().getX()
                        && super.getLocations().getFirst().getX() + numSquares >= buildings.get(i).getLocations().getFirst().getX()
                        && super.getLocations().getFirst().getY() - numSquares <= buildings.get(i).getLocations().getFirst().getY()
                        && super.getLocations().getFirst().getY() + numSquares >= buildings.get(i).getLocations().getFirst().getY()){
                    System.out.println("found building");
                    if( buildings.get(i)  instanceof BerryPatch){
                        //buildings.get(i).setVisible(true);
                    }
                }
            }
        }
        return null;
    }

}
//Move in radius
