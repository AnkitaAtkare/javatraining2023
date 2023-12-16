package com.javanew.java8;

public class LamdaEx {
public static void main(String[] args) {
	HelloEx a =()->{
		return "Hello World";
	};
	System.out.println(a.great());
}
}
