package com.javatraining.exception;

public class ExceptionPr1 {

public static void main(String[] args) throws UserDefinedException2 {
	try{
		int a=4/0;
		System.out.println(a);
	}catch(ArithmeticException e) {
		System.out.println("invalid input "+e);
		
	}
	
}
}
