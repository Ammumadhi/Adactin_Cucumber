package com.java;

public class Split1 {

	public static void main(String[] args) {
		
		String s = "Spread love everywhere you go";
		
		String[] sp = s.split(" ", 3);
		
		for (String st : sp) {
			
			System.out.println(st);
		}
	}
}
