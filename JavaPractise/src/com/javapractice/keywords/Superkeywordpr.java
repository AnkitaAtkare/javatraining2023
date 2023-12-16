package com.javapractice.keywords;
class pet{
	void run() {

		System.out.println("barking");
	}
}
class dog extends pet{
	void run() {

	
		System.out.println("friendly");
	}
	void eat() {

		System.out.println("dog food");
	}
	void work() {

		run();
		eat();
	}
}

public class Superkeywordpr {
	public static void main(String[] args) {

		dog d= new dog();
		d.work();
	}
	

}
