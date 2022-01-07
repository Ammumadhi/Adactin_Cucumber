package com.org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Frames {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(single);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java Selenium");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.switchTo().defaultContent();
		 
		 WebElement iframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		 iframe.click();
		 
		 WebElement outframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		 driver.switchTo().frame(outframe);
		 
		 System.out.println("===Out Frame===");
		 
		 WebElement inframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		 driver.switchTo().frame(inframe);
		 
		 System.out.println("===in frame===");
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		 driver.switchTo().parentFrame();
		 System.out.println("Hello");
		 
		 
		 
		 
		
		
		
	}

}