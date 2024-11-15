package com.example.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
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
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Stocks> stock = new ArrayList<>();


    public void handleLstPeople() {
        String personName  = lstPeople.getSelectionModel().getSelectedItem().toString().split(",")[0].strip();
        for (Person p : people) {
            if(p.getPersonName().equals(personName)){
                lstStocksOwned.getItems().clear();
                for(IndividualStockOwned iso : p.getIsos()){
                    lstStocksOwned.getItems().add(iso.toString());
                }
            }
        }

    }

    public void handleLstStocksAvailable(MouseEvent mouseEvent) {
        String stockName  = lstStocksAvailable.getSelectionModel().getSelectedItem().toString();

    }

    public void handlelstStocksOwned(MouseEvent mouseEvent) {
    }

    public void handleAddStock(ActionEvent actionEvent) {
        if(!txtSName.getText().equals("") ){
            boolean exists = false;
            for (Stocks s: stock){
                if(s.getStockName().equals(txtSName.getText())){
                    exists = true;
                }
            }
            if(!exists)
                stock.add(new Stocks(txtSName.getText()));
            else{
                JOptionPane.showMessageDialog(null,"this stock already exists");
            }
        }else
            JOptionPane.showMessageDialog(null,"add a stock");

        updateScreen();
        
    }

    public void handleAddPerson(ActionEvent actionEvent) {
        people.add(new Person(txtPName.getText(),Math.round(Math.random()*1000)));
        updateScreen();
    }
    public void updateScreen(){
        lstPeople.getItems().clear();
        for(Person p: people){
            lstPeople.getItems().add(p.getPersonName() + ", Cash Balance: " + p.getCash());
        }
        lstStocksAvailable.getItems().clear();
        for(Stocks s: stock){
            lstStocksAvailable.getItems().add(s.getStockName() + ", Current Price: " + s.getCurrentPrice() );
        }

    }
    @FXML
    public void handleBuy() {
        int stockAmount = Integer.parseInt(txtAmount.getText());

        String personName  = lstPeople.getSelectionModel().getSelectedItem().toString().split(",")[0].strip();
        String stockName  = lstStocksAvailable.getSelectionModel().getSelectedItem().toString().split(",")[0].strip();
        Stocks stocks = null;
        Person person = null;
        for(Stocks s : stock){
            if(s.getStockName().equals(stockName)){
                stocks = s;
            }
        }
        for (Person p : people) {
            if(p.getPersonName().equals(personName)){
                person = p;
            }
        }
        if(stocks == null || person == null){
            return;
        }
        boolean isNew = true;
        for(IndividualStockOwned iso : person.getIsos()){
            if(iso.currentStock.equals(stocks)){
                iso.addStock(stockAmount);
                isNew = false;
            }
        }
        if(isNew){
            person.buyStock(stocks, stockAmount);
        }
        handleLstPeople();
    }
    @FXML
    public void handleSell() {
        int stockAmount = Integer.parseInt(txtAmount.getText());

        String personName  = lstPeople.getSelectionModel().getSelectedItem().toString();
        String stockName  = lstStocksAvailable.getSelectionModel().getSelectedItem().toString();
        Stocks stocks = null;
        Person person = null;
        for(Stocks s : stock){
            if(s.getStockName().equals(stockName)){
                stocks = s;
            }
        }
        for (Person p : people) {
            if(p.getPersonName().equals(personName)){
                person = p;
            }
        }

    }
    @FXML
    public void handleDay() {

    }
}

