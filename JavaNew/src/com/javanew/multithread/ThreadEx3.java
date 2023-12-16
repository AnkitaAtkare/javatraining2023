package com.javanew.multithread;

public class ThreadEx3 extends Thread {
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println("sub thread");
		}
	}

}
