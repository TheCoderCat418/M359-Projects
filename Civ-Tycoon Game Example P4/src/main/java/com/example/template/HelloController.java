package com.example.template;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class HelloController {
    Button[][] btn =new Button[20][20];
//    private int [][] board = new int[20][20];
    private ArrayList<Building>  buildings = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();
    @FXML
    private GridPane playBoard;
    public void handleSetup(ActionEvent actionEvent) {
        playBoard.setGridLinesVisible(true);
        playBoard.setVisible(true);
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j] = new Button();
                btn[i][j].setPrefSize(25,25);
                playBoard.add(btn[i][j],i,j);
            }
        }
        EventHandler z = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //all button code goes here
                System.out.println(event.getSource());
//                ((Button) event.getSource()).setText("klsdfjsdf");
                System.out.println(((Button) event.getSource()).getText());
                int y = GridPane.getRowIndex(((Button) event.getSource()));
                int x = GridPane.getColumnIndex(((Button) event.getSource()));
                System.out.println("x:" + x);
                System.out.println("y:" + y);
//                Building myHome = new Home();
                if (placeHome){
                    buildings.add(new Home(x, y));
                    placeHome = false;
                }
                if(placeDeer){
                    animals.add(new Deer(x,y));
                    placeDeer = false;
                }


            }
        };

        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j].setOnAction(z);
            }
        }
        makeBerryPatches();
    }

    public void makeBerryPatches(){
        buildings.add(new BerryPatch(15,3,false));
        buildings.add(new BerryPatch(3,15,false));
    }
    public void updateScreen(){
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
//                if (board[i][j]==0){
                    btn[i][j].setStyle("-fx-background-color: #ffffff; ");
//                }
//                else if(board[i][j]==1){
//                    btn[i][j].setStyle("-fx-background-color: #00ff00; ");
//                }
            }
        }
        for (Building building: buildings){
            for(Location loc: building.getLocations()){
                String temp = "-fx-background-color: #" + loc.getColor() + "; ";
                if(building.isVisible()){
                    if(building instanceof BerryPatch){
                        temp+="-fx-text-fill: white ; ";
                        btn[loc.getX()][loc.getY()].setText(((BerryPatch) building).getAmountOfFood()+"");
//                    btn[loc.getX()][loc.getY()].setStyle("-fx-text-fill: white");
                    }
                    btn[loc.getX()][loc.getY()].setStyle(temp);
                }

            }


        }
        for (Animal animal: animals){
            for(Location loc: animal.getLocations()){
                String temp = "-fx-background-color: #" + loc.getColor() + "; ";
                btn[loc.getX()][loc.getY()].setStyle(temp);

            }


        }
    }
    //this variable can be in its own class or inside of Building or home
    //this variable cannot go inside the bunny because it is used to determine when they are
    //made and it doesn't exist until it is made.
    //might need to change it at some point, in this case inside of home makes more sense
private long bunnySpawnInterval = 2000000000;
    public void handleStartAnimation(ActionEvent actionEvent) {
        new AnimationTimer(){

            @Override
            public void handle(long now) {
            if (buildings.size()>0){
                for (int i = 0; i < buildings.size(); i++) {
                    if(buildings.get(i) instanceof Home){
                        if(now - ((Home) buildings.get(i)).getSpawnTimer() > bunnySpawnInterval){
                            ((Home) buildings.get(i)).spawnBunnies(animals);
                            ((Home) buildings.get(i)).setSpawnTimer();
                        }

                    }
                }
            }

            if(animals.size()>0){
                for (int i = 0; i < animals.size(); i++) {

                    if(animals.get(i) instanceof Bunny){
                        if(now - animals.get(i).getStartTime()>1000000000.0){
                            ((Bunny) animals.get(i)).moveAnimal("random",btn);
                            animals.get(i).setStartTime();
                        }
//                        if(now -animals.get(i).getSpawnTimer > animals.get(i).getSpawnInterval){
//                            ((Home) buildings.get(i)).spawnBunnies(animals);
//                        }
                    }
                    if(animals.get(i) instanceof Deer){
                        if(now - animals.get(i).getStartTime()>1000000000.0){
                            ((Deer) animals.get(i)).moveAnimal("random",btn);
                            animals.get(i).setStartTime();
                            animals.get(i).findWithinDistance(buildings,2);

                        }
//                        if(now -animals.get(i).getSpawnTimer > animals.get(i).getSpawnInterval){
//                            ((Home) buildings.get(i)).spawnBunnies(animals);
//                        }
                    }
                }
            }
//                if(redBugs.size()>0){
//                    for (int i = 0; i < redBugs.size(); i++) {
//                        if(now - redBugs.get(i).getStartTime()>500000000.0){
//                            redBugs.get(i).changeLocation(board);
//                            redBugs.get(i).setStartTime();
//
//                        }
//                    }
//
//                }



                updateScreen();
            }

        }.start();
    }
    private boolean placeHome = false;
    private boolean placeDeer = false;
    public void handlePlaceHome(ActionEvent actionEvent) {
        //what are the conditions for doing this
        placeHome = true;
    }

    public void handlePlaceDeer(ActionEvent actionEvent) {
        placeDeer = true;
    }

}
