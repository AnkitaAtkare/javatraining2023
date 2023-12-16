package com.newtraining.demo;

public class PolyMethodOverloadingEx {
public void main() {
	System.out.println("He is running");
}
public void main(int a) {
	System.out.println("Value is "+ a);
}
public int main(int b, int c) {
	System.out.println("New Values are "+b+", "+c);
	return c;
}
public static void main(String[] args) {
	PolyMethodOverloadingEx d = new PolyMethodOverloadingEx();
	d.main();
	d.main(20);
	d.main(10, 20);
	
}
}
