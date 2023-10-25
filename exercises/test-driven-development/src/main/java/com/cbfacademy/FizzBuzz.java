package com.cbfacademy;

public class FizzBuzz {
    public static String of(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
}