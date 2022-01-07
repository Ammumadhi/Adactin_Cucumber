package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	
	

	public static void main(String[] args) throws Throwable {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement scroll_Down = driver.findElement(By.xpath("//a[text()='United States']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll_Down);
		
		
		Thread.sleep(2000);
		WebElement scroll_Up = driver.findElement(By.xpath("//h2[text()='Upgrade your home | Amazon Brands & more']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll_Up);
		
	}

}