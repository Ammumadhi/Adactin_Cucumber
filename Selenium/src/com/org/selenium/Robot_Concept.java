package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Concept {
	
	

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=Google&rlz=1C1GCEU_enIN902IN902&oq=goog&aqs=chrome.0.69i59j69i57j69i60l3j69i65l2j69i60.2393j0j7&sourceid=chrome&ie=UTF-8"); 
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).perform();
		
		
		
	}

}