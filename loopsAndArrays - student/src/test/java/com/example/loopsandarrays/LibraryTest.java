package com.example.loopsandarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testGetBooksInStock() {
        // Expected initial list of books
        ArrayList<String> expectedBooks = new ArrayList<>(Arrays.asList(
                "To Kill a Mockingbird",
                "1984",
                "The Great Gatsby",
                "Dune",
                "The Kite Runner",
                "Hunger Games"
        ));

        assertEquals(expectedBooks, library.getBooksInStock());
    }

    @Test
    void testCheckOutBookSuccessfully() {
        String result = library.checkOut("1984");
        assertEquals("Book has been checked out", result);
        assertFalse(library.getBooksInStock().contains("1984"));
    }

    @Test
    void testCheckOutBookNotFound() {
        String result = library.checkOut("The Catcher in the Rye");
        assertEquals("Book not found", result);
        // Ensure the book list remains unchanged
        assertEquals(6, library.getBooksInStock().size());
    }

    @Test
    void testCheckOutMultipleBooks() {
        // Checkout one book
        library.checkOut("Dune");
        assertFalse(library.getBooksInStock().contains("Dune"));

        // Checkout another book
        String result = library.checkOut("Hunger Games");
        assertEquals("Book has been checked out", result);
        assertFalse(library.getBooksInStock().contains("Hunger Games"));

        // Check remaining books
        ArrayList<String> expectedBooks = new ArrayList<>(Arrays.asList(
                "To Kill a Mockingbird",
                "1984",
                "The Great Gatsby",
                "The Kite Runner"
        ));
        assertEquals(expectedBooks, library.getBooksInStock());
    }

    @Test
    void testCheckOutSameBookTwice() {
        library.checkOut("The Great Gatsby");
        assertFalse(library.getBooksInStock().contains("The Great Gatsby"));

        String result = library.checkOut("The Great Gatsby");
        assertEquals("Book not found", result);
    }






}