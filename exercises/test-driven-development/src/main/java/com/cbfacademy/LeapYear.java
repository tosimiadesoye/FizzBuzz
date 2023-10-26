package com.cbfacademy;

public class LeapYear {
    public static boolean isALeapYear(int year) {
//        years divisible by 400 are leap years
//        years divisible by 100 but not by 400 are not leap years
//        years divisible by 4 but not by 100 are leap years
//        years not divisible by 4 are not leap years

        if (year % 400 == 0) {
            return true;
        } else if( year % 4 == 0 & year % 100 !=0) {
            return true;
        }
        return false;

    }
}
