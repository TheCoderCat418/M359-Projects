package com.example.loopsandarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    ArrayList<String> booksInStock;

    public Library() {
        booksInStock = new ArrayList<>(Arrays.asList(
                "To Kill a Mockingbird",
                "1984",
                "The Great Gatsby",
                "Dune",
                "The Kite Runner",
                "Hunger Games"
        ));


    }

    public ArrayList<String> getBooksInStock() {
        return booksInStock;
    }


    /*
    Based on a bookName, see if the library had that book in stock.
    If they have the book in stock, remove that book from the list and return -> "Book has been checked out"
    If the book is not in stock, return -> "Book not found
    Remember that you should not remove from an array while looping through that, anyone who does will not receive credit
     */
    public String checkOut(String bookName){
        int indexOfCheckedBook = -1;
        for (int i = 0; i < booksInStock.size(); i++) {
            if(bookName.equals(booksInStock.get(i))){
                indexOfCheckedBook = i;
            }
        }
        if(indexOfCheckedBook != -1){
            booksInStock.remove(indexOfCheckedBook);
            return "Book has been checked out";
        }
        return "Book not found";
    }
}
