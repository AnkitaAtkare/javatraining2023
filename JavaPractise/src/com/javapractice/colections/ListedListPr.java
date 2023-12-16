package com.javapractice.colections;

import java.util.LinkedList;

public class ListedListPr {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.add(8);
		System.out.println(ll);
		
		
		ll.remove(3);
		ll.remove(0);
		System.out.println(ll);

	}

}
