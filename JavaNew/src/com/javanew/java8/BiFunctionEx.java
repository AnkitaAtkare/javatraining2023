package com.javanew.java8;

import java.util.function.BiFunction;

public class BiFunctionEx {
	  public static void main(String[] args) {
	        BiFunction<Integer, Integer, String> sum = (a, b) ->"Sum is = "+ (a + b);
	        
	        String result = sum.apply(2, 3);
	        System.out.println(result);  // Output: 5
	    }
}
