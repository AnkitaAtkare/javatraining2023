package com.javanew.java8;

import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
        Supplier<String> messageSupplier = () -> "Supplier java code";
        
        String message = messageSupplier.get();
        System.out.println(message);  
    }
}
