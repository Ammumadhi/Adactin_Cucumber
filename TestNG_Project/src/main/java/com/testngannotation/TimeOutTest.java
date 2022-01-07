package com.testngannotation;

import org.testng.annotations.Test;

public class TimeOutTest { 
	
@Test(timeOut = 2000)
	
	private void SearchMobile() {
		System.out.println("Mobiles");

	}
	

	@Test
	
	private void SearchLaptops() {
		System.out.println("Laptops");
		
	}
	
	@Test
	
	private void SearchWatches() {
System.out.println("Watches");
	}

}
