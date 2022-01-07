package com.java.org;

public class JumpingStatement1 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			
			if (i==7) {
				
				//Except insertion number 
				
				continue;
				
			}
			System.out.println(i);
		}
	}

}
