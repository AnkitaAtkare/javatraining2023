package com.javanew.multithread;

public class ThreadEx4 {
public static void main(String[] args) {
	ThreadEx3 h =new ThreadEx3();
	h.start();
	
	for(int i=0; i<=5;i++) {
		System.out.println("super thread");
	}
}
}
