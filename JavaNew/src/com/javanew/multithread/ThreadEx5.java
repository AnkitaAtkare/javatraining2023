package com.javanew.multithread;

public class ThreadEx5 extends Thread {
public void run() {
	
	for(int i=0; i<=5;i++) {
		System.out.println("super thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}