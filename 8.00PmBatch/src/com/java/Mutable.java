package com.java;

public class Mutable {
	
	//If we assign a duplicate value it will create a new memory--after append it will share the memory
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Colours");
		StringBuffer s1 = new StringBuffer("Colours");
		StringBuffer s2 = new StringBuffer("beautiful");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("---After append---");
		
		StringBuffer s3 = s.append(s1);
		
		System.out.println(s3);
		
		System.out.println(System.identityHashCode(s3));
		
		
	}

}
