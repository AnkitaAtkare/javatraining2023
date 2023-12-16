package com.javanew.java8;

public class LamdaEx3 {
	public static void main(String[] args) {
		YardEx d = (int a) -> {
			return (a * a);
		};
		System.out.println(d.area(20));
	}
}
