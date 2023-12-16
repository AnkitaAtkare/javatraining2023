package com.javapractice.inheritance;

public class ChildPr extends ParentPr {
	public void bike() {
		System.out.println("ninja");
	}
	

	public static void main(String[] args) {
		
		ChildPr a=new ChildPr();
		a.money();
		a.bike();
		a.car();
		a.gold();
		a.landproperty();
		

	}

}
