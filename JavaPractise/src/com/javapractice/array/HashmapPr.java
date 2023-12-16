package com.javapractice.array;

import java.util.HashMap;

public class HashmapPr {

	public static void main(String[] args) {
		HashMap<String,Integer> car=new HashMap<>();
		car.put("Benz", 10);
		car.put("Toyata", 11);
		car.put("kia", 12);
		car.put("baleno", 10);
		car.put("desire", 13);
		System.out.println(car);
		boolean containbenz= car.containsKey("Benz");
		System.out.println(containbenz);
		
		
		int ToyotaInt= car.get("kia");
		System.out.println(ToyotaInt);
		
		
		
		
	
		
		

	}

}
