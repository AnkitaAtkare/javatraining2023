package com.javatraining.multithreading;

public class ThreadEx5 {
	public static void main(String[] args) throws InterruptedException {
		
	
	ThreadEx3 b= new ThreadEx3();
	b.run();
	
	for(int i=0;i<=5;i++) {
		System.out.println("Thread");
		Thread.sleep(1000);
	}
	
}
}