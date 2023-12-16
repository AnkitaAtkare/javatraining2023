package com.javapractice.java;

public class LamdaEx1 {
public static void main(String[] args) {
	CalculatorEx c=(int a, int b)->{
		return(a+b);
	};
	System.out.println(c.add(20, 30));
}
}
