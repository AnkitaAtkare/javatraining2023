package com.javaparctise.fourpillar;

public class ReturnTypePr {
public void name() {
	System.out.println("Ankita");
}
public int age(int a) {
	System.out.println(a);
	return 0;
	
}
public String place() {
	System.out.println("bramhapuri");
	return "hello";
}
public static void main(String[] args) {
	ReturnTypePr h= new ReturnTypePr();
	h.age(21);
	h.name();
//	h.place();
	System.out.println(h.place());
	
}
}
