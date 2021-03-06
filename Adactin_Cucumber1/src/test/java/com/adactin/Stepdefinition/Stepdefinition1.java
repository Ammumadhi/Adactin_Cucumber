package com.adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.BaseClass;
import com.adactin.runner.TestRunner;
import com.pom.manager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefinition1 extends BaseClass{
	
	public static WebDriver driver = TestRunner.driver;
	 PageObjectManager pom = new PageObjectManager(driver);
	 
	
	//LoginPage lp = new LoginPage(driver);
	
	
	@Given("^User launch the application$")
	public void user_launch_the_application()    {
		getUrl("https://adactinhotelapp.com/");
	     
	      
	}

	@When("^User enters the valid username in the Username field$")
	public void user_enters_the_valid_username_in_the_Username_field()    {
	     
		
		Sendkeys(pom.getLp().getUsername(), "GeethaAshokan");
	      
	}

	@When("^User enters the valid password in the Password field$")
	public void user_enters_the_valid_password_in_the_Password_field()    {
		
		Sendkeys(pom.getLp().getPassword(), "ammupapa");
	      
	      
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button()    {
		
		      
	      
	}

	@Then("^User verify the homepage and navigates to search hotel$")
	public void user_verify_the_homepage_and_navigates_to_search_hotel()    {
  
	      
	}


	

}
