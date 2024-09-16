package com.example.codingassessmentafterproject1;

import java.util.Objects;

public class Temperature {

    /*
    This function determines if it is cold enough to need a coat. It is based on temperature outside and the favorite season of the person.
    If the temperature is less than 40 and the person's favorite season is fall or winter -> they need a coat
    If the temperature is less than 55 and the person's favorite season is spring or summer -> they need a cost
    Otherwise they do not need a coat
     */
    public boolean needCoat(int temp, String season) {
        if(temp < 40 && (season.toLowerCase().equals("winter") || season.toLowerCase().equals("fall"))){
            return true;
        }else if(temp < 55 && (season.toLowerCase().equals("spring") || season.toLowerCase().equals("summer"))){
            return true;
        }else{
            return false;
        }
    }

}
