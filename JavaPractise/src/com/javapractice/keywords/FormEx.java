package com.javapractice.keywords;

import java.util.Scanner;

public class FormEx {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String Name= sc.next();
		System.out.println("Enter your age");
		
		int Age= sc.nextInt();
		System.out.println("Full Details "+ Name +" and "+Age);
		
	}

}
