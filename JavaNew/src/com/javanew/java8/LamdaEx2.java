package com.javanew.java8;

public class LamdaEx2 {
public static void main(String[] args) {
	Calculator c=(int a, int b)->{
		return (a+b);
	};
	
	System.out.println(c.sum(2, 3));
}
}
