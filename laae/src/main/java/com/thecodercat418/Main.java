package com.thecodercat418;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // PrimeNumbers pn = new PrimeNumbers();
        int[] x = {1,2,8,2,5,2,65,244,3,4,5,6,7,8,9,10,11,12,13};
        // int[] newArr = pn.deletePrimes(x);
        // for(int i = 0; i<newArr.length;i++){
        //     System.out.println(newArr[i]);
        // }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<10;i++){
            al.add(i+1);
        }
        // for(Integer i : al){
        //     if(i.intValue() == 5){
        //         System.out.println("We found the 5!");
        //     }
        // }
        MathStuff ms = new MathStuff();
        System.out.println(ms.sortArrayList(al, false, false));
    }
}