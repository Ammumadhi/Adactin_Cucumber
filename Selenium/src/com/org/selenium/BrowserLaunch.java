package com.org.selenium;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserLaunch {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.whatsapp.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.navigate().to("https://www.google.com/search?q=Google&rlz=1C1GCEU_enIN902IN902&oq=Google&aqs=chrome..69i65j69i57j35i39j0i67i131i433j69i60l3j69i65.4656j1j7&sourceid=chrome&ie=UTF-8");
			
			Thread.sleep(5000);
			driver.navigate().to("https://myhr.teleperformancedibs.com/");
			
			
			Thread.sleep(3000);
			driver.navigate().back();
			
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			driver.navigate().forward();
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

			String title = driver.getTitle();
			System.out.println(title);
			
			driver.close();
			
			driver.quit();
			
			
			
		}
			
}
