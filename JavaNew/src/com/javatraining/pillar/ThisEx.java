package com.javatraining.pillar;

public class ThisEx {// this keyword we are using for call current invoking object or variable and we
						// are using this with 2 diff type: this and this()
	String name;
	int age;

	public ThisEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("person name " + name + " and age " + age);

	}

	public static void main(String[] args) {
		ThisEx h = new ThisEx("Ankita", 27);
		h.display();
	}
}
