package com.java.org;

public class TyeCasting {
	
	public static void main(String[] args) {
		byte a=25;
		short b=a;
		
		System.out.println("widening:"+b);
		
		byte c = (byte)a;
		
		System.out.println("Narrowing:"+c);
		
		
	}

}
