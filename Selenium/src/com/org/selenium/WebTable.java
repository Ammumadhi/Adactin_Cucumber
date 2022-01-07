package com.org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	
		 public static void main(String[] args) throws Throwable {
			 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver =  new ChromeDriver();
				
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				
				driver.manage().window().maximize();
				
				List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		 
				for (WebElement datas : Alldata) {
					
					System.out.println(datas.getText());
				}	 
					
					System.out.println("===Particular Row===");
					
					List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td"));
					
					for (WebElement row : rows) {
						
						System.out.println(row.getText());
					}	
					
					System.out.println("===Particular Column===");
					
					List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
					
                     for (WebElement column : columns) {
						
						System.out.println(column.getText());
					}	
                     
                     System.out.println("===Particular Data===");
                     
                     WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
                     
                     System.out.println(Data.getText());
                     
                     System.out.println("==Column Size==");
                     
                     List<WebElement> Column_Size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
                     
                     System.out.println(Column_Size.size());
                     
                     for (WebElement Size : Column_Size) {
                    	 
                    	 System.out.println(Size.getText());
						
					}
                     
                     
                    
 						
 					}	
					
					}
					
