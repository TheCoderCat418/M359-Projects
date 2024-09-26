package com.thecodercat418;

import java.util.ArrayList;

public class MathStuff {

    public boolean isDivisible(int a, int b){
        return a%b==0;
    }   

    public ArrayList<Integer> findFactors(int a, int b){
        ArrayList<Integer> al = new ArrayList<>();
        for(int num = 1; num<=a && num<=b; num++){
            if (isDivisible(a, num) && isDivisible(b, num)) {
                al.add(num);
            }
        }
        return al;
    }

    public ArrayList<Integer> sortArrayList(ArrayList<Integer> al, boolean ascending, boolean decending){
        for(int i = 0; i<al.size(); i++){
            int selectedNum = al.get(i);
            for(int z = i; z<al.size();z++){
                if(selectedNum<al.get(z)){
                    al.set(i, al.get(z));
                    al.set(z, selectedNum);
                    selectedNum = al.get(i);
                }
            }
        }
        return al;
    }
}
