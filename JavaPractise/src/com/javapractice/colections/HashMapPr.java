package com.javapractice.colections;

import java.util.HashMap;

public class HashMapPr {

	public static void main(String[] args) {
		HashMap<String, Integer> colour = new HashMap<>();
		colour.put("Red", 5);
		colour.put("Blue", 6);
		colour.put("Pink", 7);
		colour.put("White", 8);
		colour.put("Black", 9);
		colour.put("Purple", 10);
		colour.put("Orange", 11);
		colour.put("Indigo", 12);
		colour.put("Brown", 5);

		System.out.println(colour);

		colour.remove("Red", 5);
		System.out.println(colour);
		colour.put("Pink", 5);
		System.out.println(colour);
		colour.remove("Purple");
		System.out.println(colour);

		boolean containblack = colour.containsKey("Brown");
		System.out.println(containblack);

		boolean containyellow = colour.containsKey("Red");
		System.out.println(containyellow);

	}

}
