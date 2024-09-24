package com.thecodercat418;

public class Main {
    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] newArr = pn.deletePrimes(x);
        for(int i = 0; i<newArr.length;i++){
            System.out.println(newArr[i]);
        }

    }
}