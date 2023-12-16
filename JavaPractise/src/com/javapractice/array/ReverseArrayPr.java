package com.javapractice.array;

import java.util.Scanner;

public class ReverseArrayPr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int arr[] = new int[length];

		System.out.println("Enter the " + length + " element array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Before reverse");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		for (int i = 0; i < arr.length / 2; i++) {
			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			t = arr.length - 1 - i;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

	}
}
