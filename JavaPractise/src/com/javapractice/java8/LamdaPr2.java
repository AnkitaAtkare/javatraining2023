package com.javapractice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaPr2 {
public static void main(String[] args) {
	Consumer<String> h =(String s)->{
		System.out.println(s);
	};
	h.accept("Welcome");
	
	
	List<String> f= Arrays.asList("Ankita","Sam","Lisa","Mathew");
	Consumer<String> k= (String l)->{
	   System.out.println(l);
	
};
f.forEach(k);


   
}


}
