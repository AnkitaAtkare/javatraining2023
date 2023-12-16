package com.javapractise.loop;

import java.util.Scanner;

public class IfElseStringpr {
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("Enter day");
		String s= sc.next();
		
				if(s.equals("monday")) {
					System.out.println("valid input");
				}
				else if(s.equals("tuesday")) {
						System.out.println("valid input");	
					}
				else if(s.equals("wednesday")) {
							System.out.println("valid input");	
						}
				else	if(s.equals("thursday")) {
								System.out.println("valid input");
							}
				else if(s.equals("friday")) {
									System.out.println("valid input");	
								}
				else if(s.equals("saturday")) {
										System.out.println("valid input");
									}
						
				else	if(s.equals("sunday")) {
											System.out.println("valid input");	
										}
								
					
				else {
					System.out.println("Invalid Input");
				}
	}

}
