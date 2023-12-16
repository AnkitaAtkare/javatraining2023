package com.javatraning.collections;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.add("benz");
	    cars.add("Mazda");
	    System.out.println(cars);
	    cars.remove("benz");
	    System.out.println(cars);
	}

}
