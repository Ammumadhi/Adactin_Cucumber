package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectManager {
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}

	public LoginPage getLp() {
		
		lp = new LoginPage(driver);
		return lp;
	}

	public void setLp(LoginPage lp) {
		this.lp = lp;
	}

	public static WebDriver driver;
	
	private LoginPage lp;
	

}
