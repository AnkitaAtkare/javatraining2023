package com.javanew.multithread;

public class ThreadEx6{
	
	public static void main(String[] args) throws InterruptedException {
		ThreadEx3 h =new ThreadEx3();
		h.start();
		
		for(int i=0; i<=5;i++) {
			System.out.println(" thread");
			Thread.sleep(2000);
		}
	}
	

}
