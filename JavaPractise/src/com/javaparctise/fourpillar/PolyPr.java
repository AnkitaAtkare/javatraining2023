package com.javaparctise.fourpillar;

public class PolyPr {
	public void sleep() {
		System.out.println("enter any name");
	}
	public void sleep(String s){
		System.out.println("enter your name is "+s);
	}
	
	

	public static void main(String[] args) {
		
		PolyPr a=new PolyPr();
		a.sleep();
		a.sleep("ankita");
	

	}

}
