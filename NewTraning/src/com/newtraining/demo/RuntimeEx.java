package com.newtraining.demo;


	class Bike{  
		  void run(){System.out.println("running");}  
		}  
		class Splendor extends Bike{  
		  void run(){System.out.println("running safely with 60km");}  
		  public class RuntimeEx{
			    
		  public static void main(String args[]){  
		    Bike b = new Splendor(); 
		    b.run(); 
		    b.run();
		  }  
		}  
		}
 
