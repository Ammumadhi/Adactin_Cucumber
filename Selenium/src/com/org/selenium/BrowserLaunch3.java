package com.org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.instagram.com/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    
	    WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	    username.sendKeys("akkannan610gg@gmail.com");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akkannan");
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[text()='Log In']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	    
	    
	    
	}
	
}