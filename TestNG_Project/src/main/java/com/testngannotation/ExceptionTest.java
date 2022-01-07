package com.testngannotation;

import org.testng.annotations.Test;

public class ExceptionTest { 
	
	@Test(expectedExceptions = Exception.class)
	
	private void test() {

      int a=20/0;
      

	}

}
