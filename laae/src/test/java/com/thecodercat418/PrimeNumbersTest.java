package com.thecodercat418;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumbersTest {
    @Test
    void testDeletePrimes() {
        PrimeNumbers pn = new PrimeNumbers();
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] y = {1,4,6,8,9,10,12};
        int[] newArr = pn.deletePrimes(x);
        assertEquals(y, newArr);
    }

    @Test
    void testDoesItFactorIntoTwoPrimes() {

    }

    @Test
    void testGetPrimeNumbers() {

    }

    @Test
    void testGetPrimeNumbersFrom() {

    }

    @Test
    void testIsPrime() {

    }

    @Test
    void testP() {

    }

    @Test
    void testProduct2Primes() {

    }
}
