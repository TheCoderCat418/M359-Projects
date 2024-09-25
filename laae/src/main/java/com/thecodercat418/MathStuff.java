package com.thecodercat418;


public class MathStuff {

    public boolean isDivisible(int a, int b){
        return a%b==0;
    }   

    public int gcf(int a, int b){
        int num = 2;
        while (!(a%num==0 && b%num==0)) {
            
            num++;
        }
        return num;
    }
}
