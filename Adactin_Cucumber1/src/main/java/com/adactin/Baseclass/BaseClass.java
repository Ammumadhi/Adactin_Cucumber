package com.adactin.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername ) {


		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("\\driver\\chromedriver_win32 (1)\\chromedriver.exe"));
				
			  driver = new ChromeDriver();
			  
			 }else if (browsername.equalsIgnoreCase("FireFox")) {
				 
				 System.setProperty("webdriver.gecko.driver", System.getProperty("\\driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe"));
				 
				 }else {
					System.out.println("invalid Browser");
				}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void Sendkeys(WebElement element, String value) {
		
		element.sendKeys(value);
		

	}
	
	
}
