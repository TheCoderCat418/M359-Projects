package com.example.template;

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

}
//Move in radius
