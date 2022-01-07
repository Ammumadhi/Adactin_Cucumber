package com.testngannotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(enabled = false)
	
	private void SearchMobile() {
		System.out.println("Mobiles");

	}
	
	@Ignore
	@Test
	
	private void SearchLaptops() {
		System.out.println("Laptops");
		
	}
	
	@Test
	
	private void SearchWatches() {
System.out.println("Watches");
	}
	
	@Test
	
	private void Airpods() {
		System.out.println("Airpods");
	}

}
