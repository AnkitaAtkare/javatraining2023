package com.javapractice.java8;

import java.util.function.Function;

public class FunctionPr {
public static void main(String[] args) {
	Function<Integer, String> sumOfEvenNum= number->"the number is "+ number;
	String s = sumOfEvenNum.apply(45);
	System.out.println(s);
	

	}
}
