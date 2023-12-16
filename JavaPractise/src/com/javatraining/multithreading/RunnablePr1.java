package com.javatraining.multithreading;

public class RunnablePr1 {
public static void main(String[] args) {
	RunnablePr h=new RunnablePr();
	Thread j =new Thread(h);
	j.start();
	for(int i=0;i<=5;i++) {
		System.out.println("super thread");
	}
}
}
