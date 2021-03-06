package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDownPixel {

	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=38222944810112342&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061925&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjwrJOMBhCZARIsAGEd4VF_sLh1Hchym3cbxMI7Dtu9c2jIbHU-BLXa9yTyHhsmiSpGxiQRBlUaAjqPEALw_wcB");
		
		driver.manage().window().maximize();
		
		
		WebElement scroll_Down = driver.findElement(By.xpath("//a[text()='United States']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll_Down);
		
		
		Thread.sleep(2000);
		WebElement scroll_Up = driver.findElement(By.xpath("//h2[text()='Upgrade your home | Amazon Brands & more']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll_Up);
		
		
		System.out.println("===Using Pixel===");
		Thread.sleep(2000);
		
		js.executeScript("Window.scrollBy(0,8000)");
		
		
		Thread.sleep(2000);
		
		js.executeScript("Window.scrollBy(0,-6000)");
	
	}
}