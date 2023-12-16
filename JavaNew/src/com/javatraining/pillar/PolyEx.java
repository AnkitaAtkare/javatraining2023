package com.javatraining.pillar;

public class PolyEx {
	public void run() {
		System.out.println("dog running");
	}

	public void run(String s) {
		System.out.println(s + " running");
	}

	public void run(String s, String t) {
		System.out.println(s + " " + t + " both running");
	}

	public static void main(String[] args) {
		PolyEx a= new PolyEx();
		a.run();
		a.run("cat");
		a.run("bat", "dog");
	
		
		
		

	}

}
