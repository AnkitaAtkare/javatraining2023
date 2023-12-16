package com.javanew.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ByconsumerEx {
	public static void main(String[] args) {

		// ex1
		BiConsumer<String, String> j = (String s, String r) -> {
			System.out.println(s + "," + r);
		};
		j.accept("hello World", "hi");

		// ex2
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> h = (String s, Integer r) -> {
			map.put(s, r);

		};
		h.accept("one", 20);
		h.accept("two", 30);
		h.accept("three", 40);
		h.accept("four", 50);
		h.accept("five", 60);
		System.out.println(map);
	}
}
