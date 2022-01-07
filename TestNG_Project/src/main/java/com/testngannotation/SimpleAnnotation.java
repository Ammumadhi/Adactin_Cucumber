package com.testngannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeSuite
	
	private void SetUp() {
	System.out.println("SetUp");

	}
	
	@BeforeTest
	
	private void BrowserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	
	private void Url() {
		System.out.println("Launch URL");
		}
	
	@BeforeMethod
	
	private void Login() {
System.out.println("Login");

	}
	
	@Test
	
	private void SearchMobiles() {
	System.out.println("Mobiles");
	

	}
	
	@Test
	
	private void SearchLaptops() {
		System.out.println("Laptops");

	}
	
	@Test
	
	private void SearchAirpods() {
		System.out.println("Airpods");
	}
	
	@AfterMethod
	
	private void VerifyHomePage() {
		System.out.println("Homepage");
	}
	
	
	@AfterClass
	
	private void Logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	
	private void CloseBrowser() {
		System.out.println("CloseBrowser");
	}
	
	@AfterSuite
	
	private void DeleteCookies() {
		System.out.println("DeleteCookies");
	}
}