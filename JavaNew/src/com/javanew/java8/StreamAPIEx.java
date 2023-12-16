package com.javanew.java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPIEx {
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        // Example 1: Filter and print even numbers
	        numbers.stream()
	            .filter(n -> n % 2 == 0)
	            .forEach(System.out::println);
	        
	        // Example 2: Map and print square of each number
	        numbers.stream()
	            .map(n -> n * n)
	.forEach(System.out::println);
	        
	        // Example 3: Reduce and print the sum of all numbers
	        int sum = numbers.stream()
	            .reduce(0, (a, b) -> a + b);
	        System.out.println(sum);
	    }
	}

