package com.javapractice.colections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPr {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
   
	al.add(25);
	al.add(0, 52);
	al.add(54);
	al.add(56);
	System.out.println(al);
    al.addAll(al);
	System.out.println("new array "+al);
	al.addAll(6, al);
	System.out.println("new1 array "+al);
	Collections.sort(al);
	System.out.println("new 2 array "+al);
	al.set(5,100);
	System.out.println(al);
	for(int i: al) {
		System.out.println(i);
	}
	
	
}
}
 