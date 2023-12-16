package com.javaparctise.fourpillar;

public class NewAbImEx extends NewAbEx {

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("School");
	}

	@Override
	public void play(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	public static void main(String[] args) {
		NewAbImEx a=new NewAbImEx();
		a.play("playgraound");
		a.study();
	}

}
