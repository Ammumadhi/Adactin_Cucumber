package com.testngannotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"username","Password"})
	private void Login(@Optional("Ammupapa")String username , String Password) {
		System.out.println("Enter the login details");
		System.out.println("USERNAME:" +username);
		System.out.println("Password:" +Password);
		
		
	}

}
