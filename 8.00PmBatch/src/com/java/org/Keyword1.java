package com.java.org;

public final class Keyword1 {//final class 
	
	static {
		
		System.out.println("Hello Everyone");
	}
	  
	static int i=10;
	
	//final method 
	public final static void emp() {
	
		final int i=20; //final variable
		i++;
		System.out.println("Hii");

	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		System.out.println(i);
		emp();
	}
	

}
