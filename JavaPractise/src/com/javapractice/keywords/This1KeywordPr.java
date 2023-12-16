package com.javapractice.keywords;

public class This1KeywordPr {
	int a;
	int b;
	
	public This1KeywordPr(int c,int d) {
		this.a=c;
		this.b=d;
		}
	public void number() {
		System.out.println("num1= "+a +" num2=" +b   );
		
	}
	public static void main(String[] args) {
		This1KeywordPr b=new This1KeywordPr(5,2);
		b.number();
	}

}
