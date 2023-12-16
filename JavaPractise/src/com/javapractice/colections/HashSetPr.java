package com.javapractice.colections;

import java.util.HashSet;

public class HashSetPr {

	public static void main(String[] args) {
	HashSet<String> colour= new HashSet<>();
	colour.add("Red");
	colour.add("Blue");
	colour.add("Yellow");
	colour.add("Orange");
	colour.add("Blue");
	colour.add("Indigo");
	colour.add("Orange");
	colour.add("White");
	
	System.out.println(colour);
	
	colour.remove("Red");
	System.out.println(colour);
	boolean containindigo = colour.contains("Indigo");
	System.out.println(containindigo);
	boolean containpurple = colour.contains("purple");
	System.out.println(containpurple);
	
	if(colour.contains("black")) {
		System.out.println("yes");
	}else {
		System.out.println("invalid input");
	}
	
	
	}

}
