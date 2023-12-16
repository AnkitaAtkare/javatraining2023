package com.javanew.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {

		// ex1
		Consumer<String> j = (String s) -> {
			System.out.println(s);
		};
		j.accept("hello World");

		// ex2

		List<String> n = Arrays.asList("john", "sam", "ankita");
		Consumer<String> c = (String s) -> {
			System.out.println(s);

		};
		n.forEach(c);
	}
}
