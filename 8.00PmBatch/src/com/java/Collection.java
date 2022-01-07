package com.java;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<>();
		
		li.add(10);
		li.add("java");
		li.add('A');
		li.add(true);
		li.add(10);
		li.add(40.56);
		
		System.out.println(li);
		
		boolean contains = li.contains(10);
		System.out.println(contains);
		
		Object object = li.get(5);
		System.out.println(object);
		
		int indexOf = li.indexOf(4);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(object);
		System.out.println(lastIndexOf);
		
		li.set(4, "Love");
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		li.remove(3);
		System.out.println(li);
		
		li.clear();
		System.out.println(li);
		
		
		
		
	}

}
