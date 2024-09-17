package com.example.loopsoffical;

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

    public String getPrimeNumbers(int numPrimes){
        String primes = "";
        int num = 2;
        for(int i = 0; i<numPrimes;i++){
            while (!isPrime(num)) {
                num++;
            }
            primes+=num+", ";
            num++;
        }
        return primes;
    }


    public String getPrimeNumbersFrom(int a, int b){
        String primes = "";
        int num = a;
        while(num < b){
            if(isPrime(num)) {
                primes+=num+", ";
            }
            num++;
        }
        return primes;
    }

    public String div2Primes(int num){
        String primes = "";
        int div = 2;
        while(div < num){
            if(isPrime(num) && isPrime(div)) {
                return "div: "+ div + " | num: "+num;
            }
            num++;
        }
        return primes;
    }
}