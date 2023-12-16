package com.javanew.exception;

public class Exception2Ex {
	public static void main(String[] args) {
		int num[]= {11,12,13,14,15};
	try {
			
			System.out.println(num[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("limit is 4");
		}
	System.out.println(num[1] +" "+ num[2]);
	System.out.println(num[2]+ " "+num[3]+" "+num[6]);
	
}
}

