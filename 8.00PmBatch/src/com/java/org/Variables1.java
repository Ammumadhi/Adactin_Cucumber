package com.java.org;

public class Variables1 {
	
	int a=10;
	
	public void emp() {
		
		int i=20;
		System.out.println(i);
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Variables1 v = new Variables1();
		v.emp();
		System.out.println(v.a);
	}
}
