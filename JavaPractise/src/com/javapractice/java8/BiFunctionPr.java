package com.javapractice.java8;

import java.util.function.BiFunction;

public class BiFunctionPr {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> sumOfNum = (a,b)->(a+b);
		int s = sumOfNum.apply(2, 3);
	System.out.println(s);
}

}
