package com.javatraning.collections;

import java.util.HashSet;

public class FruitsHashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        boolean containsBanana = fruits.contains("Banana");
        boolean containsMango = fruits.contains("Mango");

        System.out.println(containsBanana);  // Output: true
        System.out.println(containsMango);   // Output: false
	}

}
