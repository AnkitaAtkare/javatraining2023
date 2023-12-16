package com.javatraining.pillar;

public class AbstractionImEx extends AbstractionEx {

	@Override
	public void data() {

		// TODO Auto-generated method stub
		System.out.println("new data");
	}

	@Override
	public void feature(int a) {
		// TODO Auto-generated method stub
		System.out.println("number= "+a);
		
	}
	
public static void main(String[] args) {
	AbstractionImEx i=new AbstractionImEx();
	i.data();
	i.feature(10);
}
}
