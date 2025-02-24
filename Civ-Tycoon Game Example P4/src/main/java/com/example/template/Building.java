package com.example.template;

import java.util.ArrayList;

public class Building {
    private ArrayList<Location> locations = new ArrayList<>();
    private boolean visible;
    public Building(){

    }
    public Building(int x, int y, String color,boolean visible){
        locations.add(new Location(x,y,color));
        this.visible = visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }
}
