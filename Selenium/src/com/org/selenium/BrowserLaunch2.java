package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 {
	
	
		public static void main(String[] args)  {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("akkannan610gg@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("akkannan");
		
        driver.findElement(By.name("login")).click();		
		
		
		
		
		
		
	}
		
		
		
	
	
}