package com.javatraning.collections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 95);
		scores.put("Bob", 80);
		scores.put("Charlie", 70);

		System.out.println(scores);
		int aliceScore = scores.get("Alice");
		System.out.println("Alice's score: " + aliceScore);
		scores.put("Bob", 99);
		System.out.println("Bob's modified score: " + scores);

		scores.remove("Charlie"); // Remove Charlie's entry from the map
		System.out.println(scores);

		boolean containsAlice = scores.containsKey("Alice");
		boolean containsCharlie = scores.containsKey("Charlie");
		System.out.println(containsAlice);
		System.out.println(containsCharlie);

	}

}
