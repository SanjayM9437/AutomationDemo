package com.HowardHughesBP.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HowardHughesBP.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		
//		driver.get(baseURL);
		logger.info("URL Entered");
		
		LoginPage lp = new LoginPage(driver);

	lp.clickOk();
		
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		String text = driver.getTitle();
		System.out.println(text);
		
		if(driver.getTitle().equals("BuilderPortal"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{

			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
//		lp.clickHhomes();
//		Thread.sleep(3000);
//		
//		lp.clickLogout();
//		
		
	}
	
	

}
