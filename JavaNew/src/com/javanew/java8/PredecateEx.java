package com.javanew.java8;

import java.util.function.Predicate;

public class PredecateEx {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        
        System.out.println(isEven.test(4));  // Output: true
        System.out.println(isEven.test(7));  // Output: false
    }
}
