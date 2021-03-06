package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.BaseClass;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features="src//test//java//com//adactin//feature//Adactin.feature", glue="com//adactin//Stepdefinition")

public class TestRunner {

	public static WebDriver driver;
	
	
	@BeforeClass
	 
	public static void Set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getinstance().getInstanceCR().getbrowser();
		
	driver = BaseClass.getbrowser(browser);

	}
	
	
}
