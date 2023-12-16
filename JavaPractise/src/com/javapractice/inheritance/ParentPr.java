package com.javapractice.inheritance;

public class ParentPr extends GrandParentPR{
public void money() {
	System.out.println("lots of money");
}
	public void gold() {
		System.out.println("lots of gold");
	}
	public void car() {
		System.out.println("desire");
	}
	
	

	public static void main(String[] args) {
		
		ParentPr b=new ParentPr();
		b.landproperty();
		b.gold();
		b.car();
		

	}

}
