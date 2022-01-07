package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.flipkart.com/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    
	    WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    username.sendKeys("akkannan610gg@gmail.com");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("flipkart@123");
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("((//input[@type='text'])[2]")).click();
	   
	}
	
}