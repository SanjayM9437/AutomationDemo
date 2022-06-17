package com.HowardHughesBP.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.HowardHughesBP.pageObjects.CancelSale;
import com.HowardHughesBP.pageObjects.LoginPage;

public class TC_CancelSale_002 extends BaseClass{

	@Test
	public void cancelSale() throws InterruptedException {
		
		
		LoginPage lp = new LoginPage(driver);
		
		//lp.clickOk();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		CancelSale cs = new CancelSale(driver);
		
		cs.clickUnionPark();
		cs.clickListView();
	
		Thread.sleep(5000);
		
		cs.clickSoldList();
		
		 
	}
	
	
	
	
	
	
	
	
	
	
}
