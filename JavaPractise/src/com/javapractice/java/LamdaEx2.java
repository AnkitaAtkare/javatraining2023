package com.javapractice.java;

public class LamdaEx2 {
public static void main(String[] args) {
	HelloWorld h =()->{
		return "Hello World";
	};
	System.out.println(h.fun());
}
}
