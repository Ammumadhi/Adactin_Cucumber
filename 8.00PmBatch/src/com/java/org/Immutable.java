package com.java.org;

public class Immutable {
	
	//If we assign a duplicate value it will share a memory -- after Concat it create a new memory 
	
	public static void main(String[] args) {
		
		String s = "Colours";
		String s1 = "Colours";
		String s2 = "beautiful";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("---After Concat---");
		
		String s3 = s.concat(s1);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
	}

}
