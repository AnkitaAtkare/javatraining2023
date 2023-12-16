package com.javapractice.array;

import java.util.Scanner;

public class InsertElementInArrayPr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the " + length + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			

		}
	for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "]----->" + arr[i]);
	}
	}

}