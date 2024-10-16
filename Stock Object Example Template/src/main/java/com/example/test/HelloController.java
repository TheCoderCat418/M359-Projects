package com.example.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class HelloController {
    @FXML
    LineChart priceChart;
    @FXML
    Label lstInfo;
    @FXML
    private TextField txtPName, txtSName, txtAmount;
    @FXML
    private ListView lstPeople, lstStocksAvailable, lstStocksOwned;



    public void handleLstPeople(MouseEvent mouseEvent) {
        System.out.println("test");
        String personName  = lstPeople.getSelectionModel().getSelectedItem().toString();
        System.out.println(personName);

    }

    public void handleLstStocksAvailable(MouseEvent mouseEvent) {
        String stockName  = lstStocksAvailable.getSelectionModel().getSelectedItem().toString();

    }

    public void handlelstStocksOwned(MouseEvent mouseEvent) {
    }

    public void handleAddStock(ActionEvent actionEvent) {

        
    }

    public void handleAddPerson(ActionEvent actionEvent) {

    }
    @FXML
    public void handleBuy() {

    }
    @FXML
    public void handleSell() {

    }
    @FXML
    public void handleDay() {

    }
}

