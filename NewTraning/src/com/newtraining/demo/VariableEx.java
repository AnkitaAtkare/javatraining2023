package com.newtraining.demo;

public class VariableEx {
	 static int i = 10;
	 public void run(int k) {
		System.out.println(i+k);
		
		}
public static void main(String[] args) {
	VariableEx l= new VariableEx();
	l.run(50);
	int j =20;
	
	
	System.out.println(i+j);
	
}

}
