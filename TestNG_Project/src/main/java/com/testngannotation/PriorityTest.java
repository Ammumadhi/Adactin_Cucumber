package com.testngannotation;

import org.testng.annotations.Test;

public class PriorityTest {
	

	@Test(priority = -3)
	
	private void SearchMobile() {
		System.out.println("Mobiles");

	}
	

	@Test(priority = -4)
	
	private void SearchLaptops() {
		System.out.println("Laptops");
		
	}
	
	@Test
	
	private void SearchWatches() {
System.out.println("Watches");
	}
	
	@Test(priority = 2)
	
	private void Airpods() {
		System.out.println("Airpods");
	}
	
	@Test(priority = 1)
	
	private void SearchFruits() {
		System.out.println("Fruits");

	}

}
