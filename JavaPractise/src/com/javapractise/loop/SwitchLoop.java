package com.javapractise.loop;

import java.util.Scanner;

public class SwitchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.println("Enter day");
		String day= sc.next();
		
		
		switch (day) {
		case "sunday":
			System.out.println("weekend");
			break;
		case "monday":
			System.out.println("weekday");
			break;
		case "tuesday":
			System.out.println("weekday");
			break;
		case "thursday":
			System.out.println("weekday");
			break;
		case "friday":
			System.out.println("weekday");
			break;
		case "saturday":
			System.out.println("weekend");
			break;

		}
	}

}
