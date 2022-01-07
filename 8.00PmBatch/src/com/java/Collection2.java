package com.java;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	
	public static void main(String[] args) {
		
        List<Object> li = new ArrayList<>();
		
		li.add(10);
		li.add("java");
		li.add('A');
		li.add(true);
		li.add(10);
		li.add(40.56);
		
		System.out.println(li);
		
		List<Object> li1 = new ArrayList<>();
		
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		
		System.out.println(li1);
		
		li.addAll(li1);
		System.out.println(li);
		
		li.retainAll(li1);
		System.out.println(li);
		
		li.removeAll(li1);
		System.out.println(li);
		

	}	

}
