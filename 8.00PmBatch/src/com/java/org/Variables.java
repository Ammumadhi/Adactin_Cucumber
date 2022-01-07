package com.java.org;


public class Variables {

	int i=10;//Class Variable
	
	public void emp() {
		 
		int i=5;//Local Variable
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		
		Variables v=new Variables();
	    v.emp();
	    System.out.println(v.i);
	}
	
}
