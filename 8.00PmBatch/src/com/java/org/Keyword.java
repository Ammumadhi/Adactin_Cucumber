package com.java.org;

public class Keyword {
	
	static {//static block
		
		System.out.println("Hello Everyone");
	}

	
	static int i=10;//static variable
	
	public static void emp() {//static method 

        System.out.println("Welcome");

	}
	
	public static void main(String[] args) {
		
		System.out.println("Hii");
		System.out.println(i);
		emp();
	}
}
