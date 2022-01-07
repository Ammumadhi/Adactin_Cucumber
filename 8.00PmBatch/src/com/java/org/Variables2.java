package com.java.org;

public class Variables2 {
	
	 public static int a=20;
	public void emp() {
		//static is a keyword // it is possible only in class variable not in local variable 
	
		
		//without create object 
		
		
		int i=10;
		
		System.out.println(i);
		System.out.println(a);
		 
	}
	public static void main(String[] args) {
	   
		Variables2 v = new Variables2();
		v.emp();
		System.out.println(v.a);
		System.out.println(a);
	}

}
