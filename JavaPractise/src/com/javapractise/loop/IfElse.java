package com.javapractise.loop;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		/*
		 * int i = 10; if(i%2==0) { System.out.println("Even number "+i);
		 * 
		 * }else { System.out.println("odd number "+i); }
		 */
//		Scanner sc;
//		sc = new Scanner(System.in);
//		System.out.println("Enter any value");
//		int a = sc.nextInt();
//		if (a % 2 == 0) {
//			System.out.println("Even number " + a);
//		} else {
//			System.out.println("odd number " + a);
//		}

//		public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("Item name = ");

		String s = new String("Anita");
		String s1 = new String("Anita");
		System.out.println(s == s1);

		String s2 = se.next();
		if (s.equals("ice")) {
			System.out.println("cold");
		} else if (s.equals("beer")) {
			System.out.println("beer");
		} else if (s == "juice") {
			System.out.println("cold");
		} else if (s == "milk") {
			System.out.println("hot");
		} else {
			System.out.println("invalid input");
		}
	}

//	}

}
//}
