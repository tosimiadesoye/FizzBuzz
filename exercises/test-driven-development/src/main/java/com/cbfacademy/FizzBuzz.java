package com.cbfacademy;

public class FizzBuzz {
        // Create a list that contains a nums from 1-15
        // if it a multiple of 3 return Fizz
        // if it a multiple of 5 return Buzz
        // if it a multiple of 15 return FizzBuzz
        public static String of(int num) {
                if(num % 3 == 0){
                        return "Fizz";
                } else if (num % 5 == 0){
                        return "Buzz";
                }
                return String.valueOf(num);
        }
}