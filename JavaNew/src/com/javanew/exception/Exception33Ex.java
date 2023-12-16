package com.javanew.exception;

public class Exception33Ex {

	public static void main(String[] args) {

		try {
		int num[] = new int[6];
//			num[2]=50/0;

			System.out.println(num[8]);

		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println("array limit is 3" + b);

		} catch (ArithmeticException c) {
			System.out.println("cannot divisible by 0" + c);
		}
	}

}
