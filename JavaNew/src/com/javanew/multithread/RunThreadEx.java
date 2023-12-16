package com.javanew.multithread;

public class RunThreadEx implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=5;i++) {
			System.out.println("sub thread");
		}
	}

}
