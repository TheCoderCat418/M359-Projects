package com.example.template;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class Deer extends Animal{

    public Deer(int x, int y){
        super(x,y,"993300");
    }
    public void moveAnimal(String type, Button[][] btns){
        if (type.equals("random")){
            super.moveAnimal(btns[0].length,btns.length);
        }else{
            // move another way
        }
    }

    public Location findClosestBerryPatch(ArrayList<Building> buildings){
        return null;
    }


}
