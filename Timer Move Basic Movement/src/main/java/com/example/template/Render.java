package com.example.template;

import java.util.HashMap;
import java.util.Map;

public class Render {
    //private static HashMap<Location, Tile> a = new HashMap<>();
    private static Tile[][] map = new Tile[20][20];
    private static boolean renderStatus = false;
    public static void startRendering(){
        if(renderStatus){
            return;
        }







        
        renderStatus = true;
    }

    public Position findPositionFromTile(Tile tile){
        for(int i = 0; i<map.length; i++){
            for(int j = 0; j<map[i].length; j++){
                if(map[i][j] == tile){
                    return new Position(i, j);
                }
            }
        }
        return null;
    }
}
