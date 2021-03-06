package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drag.html");
		
		driver.manage().window().maximize();
		
		
	   WebElement drag = driver.findElement(By.id("draggable"));
	   WebElement drop = driver.findElement(By.id("mydiv"));
	   
	   Actions ac = new Actions(driver);
	   ac.dragAndDrop(drag, drop).perform();
	   
	   
				
	}

}