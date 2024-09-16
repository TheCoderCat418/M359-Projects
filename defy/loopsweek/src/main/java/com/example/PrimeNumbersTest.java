package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class PrimeNumbersTest {
    @Test
    void testGetPrimeNumbers() {
        PrimeNumbers pn = new PrimeNumbers();
        assertTrue(pn.isPrime(2));
    }

    @Test
    void testGetPrimeNumbersFrom() {

    }

    @Test
    void testIsPrime() {

    }
}
