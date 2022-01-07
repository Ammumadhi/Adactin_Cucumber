package com.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
	
	//insertion order 
	
	//it allows null
	
	//not allow duplicate
	
	public static void main(String[] args) {
		
		Set<Object> s = new LinkedHashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(null);
		
		System.out.println(s);
	}

}
