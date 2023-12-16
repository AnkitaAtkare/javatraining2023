package com.javanew.exception;

public class ExceptionEx {
	public static void main(String[] args) throws UserDefinedException  {
		try {
		int a = 50 / 0;
		System.out.println(a );
		}catch(ArithmeticException e) {
			System.out.println("you cannot divisible by 0="+e);
		}
		double b = 25 / 3;
		
		System.out.println(b);

	}

}
