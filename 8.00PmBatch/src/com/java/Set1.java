package com.java;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	
	public static void main(String[] args) {
		
		//Random order 
		
		//not allow duplicate
		
		//allow null 
		
		Set<Object> s = new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(50);
		s.add(null);
		
		System.out.println(s);
	}

}
