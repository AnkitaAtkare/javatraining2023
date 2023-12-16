package com.javatraining.multithreading;

public class ThreadEx3 {
public void run() throws InterruptedException {
	for(int i=0;i<=5;i++) {
		System.out.println("SuperThread");
		Thread.sleep(1000);
	}
}
}
