package com.javapractice.array;

import java.util.HashSet;

public class HashsetPr {
public static void main(String[] args) {
	HashSet<String> car= new HashSet<>();
	car.add("benz");
	car.add("baleno");
	car.add("toyata");
	car.add("desire");
	car.add("kia");
	car.add("benz");
	System.out.println(car);
	car.remove("benz");
	System.out.println(car);
	
}
}
