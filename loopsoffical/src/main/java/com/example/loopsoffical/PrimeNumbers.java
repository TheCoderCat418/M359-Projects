package com.example.loopsoffical;

import java.util.ArrayList;

public class PrimeNumbers {
    public PrimeNumbers(){

    }

    public boolean isPrime(int number){
        if(number<2){
            return false;
        }
        int divisionNumber = 2;

        while (divisionNumber<=Math.sqrt(number)){
            if(number%divisionNumber == 0){
                return false;
            }
            divisionNumber++;
        }
        return true;
    }
    private ArrayList<Integer> primes;
    public ArrayList<Integer> getPrimeNumbers(int numPrimes){
        primes = new ArrayList<>();
        int num = 2;
        for(int i = 0; i<numPrimes;i++){
            while (!isPrime(num)) {
                num++;
            }
            primes.add(num);
            num++;
        }
        return primes;
    }


    public ArrayList<Integer> getPrimeNumbersFrom(int a, int b){
        primes = new ArrayList<>();
        int num = a;
        while(num < b){
            if(isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public boolean doesItFactorIntoTwoPrimes(int testNum){
        ArrayList<Integer> listTestPrimes = getPrimeNumbersFrom(2,(int)(Math.sqrt(testNum)));
        for (int i = 0; i < listTestPrimes.size(); i++) {
            if (testNum % i == 0) {
                if (isPrime(testNum / i)) {
                    System.out.println(i + " , " + testNum);
                    return true;
                }
            }
        }
        return false;
    }
}