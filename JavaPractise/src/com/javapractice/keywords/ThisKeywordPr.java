package com.javapractice.keywords;

public class ThisKeywordPr {

	public ThisKeywordPr() {

		System.out.println("default");
		
	}
	public ThisKeywordPr(int a) {

	
	this();
		System.out.println("one param " + a);
		
	}
	public ThisKeywordPr(int a, int b) {

	this(5);
		System.out.println("two param " + a +" " + b );
	
	}
	public static void main(String[] args) {

		ThisKeywordPr b = new ThisKeywordPr(2,4);
		
	}

}
