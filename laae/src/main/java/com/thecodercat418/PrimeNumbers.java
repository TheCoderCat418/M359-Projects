package com.thecodercat418;

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


    public ArrayList<Integer> getPrimeNumbersFrom(int start, int end){
        primes = new ArrayList<>();
        int num = start+1;
        while(num < end){
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
            if (testNum % listTestPrimes.get(i) == 0) {
                if (isPrime(testNum / listTestPrimes.get(i))) {
                    System.out.println(i + " , " + testNum);
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * PostCondntion: generate a number that is the product of 2 prime numbers
     * PreCondition: Paramaters are prime numbers
     */

    public long product2Primes(int a, int b){
        return a * b;
    }

    public long p(int l){
        ArrayList<Integer> al = getPrimeNumbersFrom((int)(Math.pow(10, l-1)), (int)(Math.pow(10, l)-1));
        int randomIndex = (int)(Math.random()*al.size());
        return al.get(randomIndex);
    }

    public int[] deletePrimes(int[] startArray){
        int numPrimes = 0;
        for (int i = 0; i<startArray.length;i++){
            if(!isPrime(startArray[i])){
                numPrimes++;
            }
        }
        int[] newArr = new int[numPrimes];
        int newIndex = 0;
        for (int i = 0; i<startArray.length;i++){
            if(!isPrime(startArray[i])){
                newArr[newIndex] = startArray[i];
                newIndex++;
            }
        }
        return newArr;
    }

    
}