package com.javapractice.array;

import java.util.ArrayList;

public class ArrayListPr {
	
	public static void main(String[] args) {
		ArrayList<String> car= new ArrayList<>();
		car.add("benz");
		car.add("desire");
		car.add("vagnor");
		car.add("audi");
		car.add(2, "marcedese");
	System.out.println(car);
	car.set(3, "balno");
	System.out.println("updated list "+car );
	
	car.remove(3);
	System.out.println(car);
	}

}
