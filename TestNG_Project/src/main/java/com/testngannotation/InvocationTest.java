package com.testngannotation;

import org.testng.annotations.Test;

public class InvocationTest {
	
@Test(invocationCount = 3)
	
	private void SearchMobile() {
		System.out.println("Mobiles");

	}
	

	@Test(invocationCount = 2,priority = 2)
	
	private void SearchLaptops() {
		System.out.println("Laptops");
		
	}
	
	@Test
	
	private void SearchWatches() {
System.out.println("Watches");
	}
	
	@Test(invocationCount = 4,priority  = 2)
	
	private void Airpods() {
		System.out.println("Airpods");
	}
	
	@Test(invocationCount  = 1)
	
	private void SearchFruits() {
		System.out.println("Fruits");

	}

}
