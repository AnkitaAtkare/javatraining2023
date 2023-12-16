package com.javapractice.starpattern;

import java.util.Scanner;

public class EquiTri {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n= sc.nextInt();
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n-i; j++) {
				 System.out.print("1");
			 }
			 
			 for(int k=0;k<=i;k++) {
				 System.out.print("*");
			 }
			
			 System.out.println("2");
		 }
		 
	}

}
