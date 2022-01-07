package com.java.org;

public class Keyword2 extends Keyword3{
	
	int a = 10;
	public void emp() {
		
		int i=15;
		System.out.println("Local Variable:"+i);
		System.out.println("Current class:"+this.a);
		System.out.println("Parent class:"+super.b);
	}
	
public static void main(String[] args) {
	   
	Keyword2 k = new Keyword2();
	k.emp();
}
}
