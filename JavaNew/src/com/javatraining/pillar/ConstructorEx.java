package com.javatraining.pillar;

public class ConstructorEx {
	public ConstructorEx() { // default constructor
		System.out.println("default");
	} 

	public ConstructorEx(int a) { // single param constructor
		this();
		System.out.println("single param constructor");

	}

	public ConstructorEx(int a, int b) { // two param constructor
		this(5);
		System.out.println("double param constructor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx b = new ConstructorEx(5, 6);
		

	}
// this () we are using for call current invoking constructor inside constructor  
//calling constructor inside constructor called construtor chaining using this() key word
}

