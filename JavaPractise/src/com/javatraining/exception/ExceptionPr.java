package com.javatraining.exception;

public class ExceptionPr {

	public static void main(String[] args) throws UserDefinedExceptionPr  {
		
		try {
			int a= 25/0;
			System.out.println(a);
		}catch(ArithmeticException b) {
			System.out.println("divisible by 0 "+b.getMessage());
			System.exit(0);
		}
		finally {
			System.out.println("this is finally block");
		}
		
		
	}
}


	
	
	
	


