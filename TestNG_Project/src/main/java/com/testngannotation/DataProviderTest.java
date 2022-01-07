package com.testngannotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//(2D array object)DataproviderTest

public class DataProviderTest   {
	
	@Test(dataProvider = "LoginData")
	@Parameters({"username","Password"})
	private void Login(String username , String Password) {
		System.out.println("Enter the login details");
		System.out.println("USERNAME:" +username);
		System.out.println("Password:" +Password);
		
		
	}
	
	
	@DataProvider
	
	private Object[][] LoginData() {
		return new Object[][] {
			{"AAA","1111"},
			{"BBB","2222"},
			{"CCC","3333"},
			{"DDD","4444"}
			
		};
	}
	
	

}
