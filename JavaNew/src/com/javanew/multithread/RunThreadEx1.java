package com.javanew.multithread;

public class RunThreadEx1 {
public static void main(String[] args) {
	RunThreadEx d =new RunThreadEx();
	Thread h =new Thread(d);
	h.start();
	for(int i=0; i<=5;i++) {
		System.out.println(" thread");
	}
}
}
