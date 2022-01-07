package com.testngannotation;

import org.testng.annotations.Test;

public class GroupTest {

	
	@Test(groups = "Selenium")
	
	private void Selenium1() {
		System.out.println("Login Test");
	

	}
	
	@Test(groups = "git")
	
	private void git1 () {
		System.out.println("Git Test 1");
		
	}
	
	@Test(groups = "api")
	private void api1() {
		System.out.println("Post Test");

	}
	
	@Test(groups = "Selenium")
	private void Selenium2() 
	{

		System.out.println("Logout Test");
		
	}
	
	@Test(groups = "api")
	private void api2() {
		System.out.println("Put Test");
	}
	
	@Test(groups = "git")
	private void git2() {
		System.out.println("Git Test 2");
	}
}

