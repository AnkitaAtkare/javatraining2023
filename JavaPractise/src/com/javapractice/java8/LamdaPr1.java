package com.javapractice.java8;

public class LamdaPr1 {
public static void main(String[] args) {
	CalculatorPr c=(int a, int b)->{
		return(a-b);
	};
	System.out.println(c.sub(20, 10));
}
}
  