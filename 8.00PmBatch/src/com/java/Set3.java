package com.java;

import java.util.Set;
import java.util.TreeSet;

public class Set3 {
	
	//ascending order
	
	//not allow duplicate 
	
	//not allow null
	
	public static void main(String[] args) {
		
		Set<Object> s = new TreeSet<>();
		
		s.add(10);
		s.add(30);
		s.add(80);
		s.add(50);
		s.add(25); 
		s.add(25);
		
		//s.add(null);
		
		
		System.out.println(s);
	}

}
