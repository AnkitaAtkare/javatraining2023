package com.javatraning.collections;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String args[]) 
    { 
        ArrayList<String> al = new ArrayList<>(); 
        al.add("Geeks"); 
        al.add("Geeks"); 
  
        al.add(1, "Geeks"); 
        System.out.println("Initial ArrayList " + al);
        al.set(0, "crazy"); 
        System.out.println("Updated ArrayList " + al);
        al.set(2, "none");
        System.out.println("new ArrayList " +al);
        al.add(3, "gone");
        System.out.println("new1 ArrayList "+al);
        al.remove(1);
      System.out.println("removed ArrayList "+al);
      al.remove("gone");
      System.out.println(al);
      }

}

