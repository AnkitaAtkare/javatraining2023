package com.javatraining.pillar;

public class Child extends Parent {
public void car() {
	System.out.println("audi");
}
public static void main(String[] args) {
	Child a = new Child();
	a.car();
	a.money();
	a.house();
	a.land();
}
}
