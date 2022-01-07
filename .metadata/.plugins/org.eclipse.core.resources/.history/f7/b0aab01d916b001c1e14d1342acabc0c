
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername ) {


		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver_win32\\chromedriver.exe"));
				
			  driver = new ChromeDriver();
			  
			 }else if (browsername.equalsIgnoreCase("FireFox")) {
				 
				 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver_win32\\chromedriver.exe"));
				 
				 }else {
					System.out.println("invalid Browser");
				}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void Sendkeys(WebElement element, String value) {
		
		element.sendKeys(value);
		

	}
	
	
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauch2 {
	
	
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauch3 {
	
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


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauch4 {
	
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


import org.openqa.selenium.By;
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
import org.openqa.selenium.By;

public class Demo extends BaseClass{
	
	public static void main(String[] args) {
		getbrowser("Chrome");
		
		getUrl("https://www.facebook.com/");
		
		Sendkeys(driver.findElement(By.id("email")), "akkannan610@gmail.com");
		
	}

	
}


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

public class Pojo_Class {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

public class Pojo {

	public static void main(String[] args) {
		
		Pojo_Class pc = new Pojo_Class();
		//System.out.println(pc.getI());
	
	pc.setI(20);
	System.out.println(pc.getI());
	}
}
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
		
		Rob r = new Robot_Concept();
		
		r.KeyPress
		
		
		
	}

}

public class ScreenShot {

}
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	
	

	public static void main(String[] args) throws Throwable {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKannan\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		
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

public class WebTable {

	 public static void main(String[] args) {
		
		 
		}
	 

}