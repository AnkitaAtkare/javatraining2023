package com.javapractice.array;

import java.util.Collections;
import java.util.LinkedList;

public class LInnkedListPr {

	public static void main(String[] args) {
	LinkedList<String> car= new LinkedList<>();
	car.add("benz");
	car.add("desire");
	car.add("baleno");
	car.add(2, "toyota");
	car.add(4, "kia");
	
	System.out.println(car);
	boolean containbaleno= car.contains("baleno");
	System.out.println(containbaleno);
	Collections.sort(car);
	System.out.println(car);
	Collections.reverse(car);
	System.out.println(car);

	}

}
