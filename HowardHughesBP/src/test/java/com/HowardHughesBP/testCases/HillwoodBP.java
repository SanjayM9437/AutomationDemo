  package com.HowardHughesBP.testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class HillwoodBP extends BaseClass {

//	@Test(priority=1)
//	public void listView() throws InterruptedException, IOException {
//
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\Public\\BuilderPortals\\configs\\Configuration.properties");
//		prop.load(ip);
//
//		driver.get(prop.getProperty("HRUrl"));
//		
//		
//
//		WebDriverWait wt = new WebDriverWait(driver,10);
//		WebElement okConfirm = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'OK')]")));
//		okConfirm.click();
//
//		WebElement username = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//		WebElement password = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
//		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
//
//		username.sendKeys(prop.getProperty("HRun"));
//		password.sendKeys(prop.getProperty("HRpwd"));
//		login.click();
//		Thread.sleep(10000);
//
//		WebDriverWait waitEst = new WebDriverWait(driver, 30);
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Union Park')]")));
//
//		WebElement selectCommunity = driver.findElement(By.xpath("//div[contains(text(),'Union Park')]"));
//		selectCommunity.click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.partialLinkText("List")).click();
//		Thread.sleep(5000);
//
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]")));
//
//		try {
//			driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
//			System.out.println("Available Lot is Verified Successfully");
//		} catch (Exception e) {
//			System.out.println("Available lot is not present");
//		}
//
//		
//	}


//	@Test(priority=2)
//	public void registerSaleTest() throws InterruptedException, IOException {
//
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\Public\\BuilderPortals\\configs\\Configuration.properties");
//		prop.load(ip);
//
//		driver.get(prop.getProperty("HRUrl"));
//		
//		
//		
//		WebDriverWait wt1 = new WebDriverWait(driver,10);
//	    WebElement okConfirm1 = wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'OK')]")));
//	    okConfirm1.click();
//
//		WebElement username = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//		WebElement password = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
//		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
//
//		username.sendKeys(prop.getProperty("HRun"));
//		password.sendKeys(prop.getProperty("HRpwd"));
//		login.click();
//		Thread.sleep(10000);
//
//		WebDriverWait waitEst = new WebDriverWait(driver, 30);
//		waitEst.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Union Park')]")));
//
//		WebElement selectCommunity = driver.findElement(By.xpath("//div[contains(text(),'Union Park')]"));
//		selectCommunity.click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.partialLinkText("List")).click();
//		
//		Thread.sleep(10000);
//		
//		//Click on available
//		
//		WebDriverWait wt = new WebDriverWait(driver, 20);
//		WebElement ele = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-lot-list-main[1]/app-lot-list-view[1]/div[1]/div[1]/div[2]/p[2]")));
//	     ele.click();
//	
//        Thread.sleep(5000);
//
//		
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]")));
//
//		
//    try {
//    	    String status = driver.findElement(By.xpath("//tbody/tr[1]/td[9]")).getText();
//			System.out.println("status is : "+ status);
//			String Expected = "Available";
//			if(Expected.equalsIgnoreCase(status))	{
//				
//				System.out.println("Selected lot is available");
//			}
//				
//							
//			WebElement Status1 = driver.findElement(By.xpath("//tbody/tr[1]/td[9]"));
//			Status1.click();
//	} catch (Exception e) {
//			System.out.println("Available lot is not present");
//		}
//        //Click on register sale
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/app-actions-menu/div/ul/li[3]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[contains(text(),'Begin')]")).click();
//		Thread.sleep(10000);
//		// select a Home
//		try {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-homes-selector[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]"))
//					.click();
//		System.out.println("Home Design Selected for Register a sale");
//		} catch (Exception e) {
//		System.out.println("Home Design is not present");
//	}
//		Thread.sleep(5000);
//
//	driver.findElement(By.xpath("//a[contains(text(),'Select')]")).click();
//		Thread.sleep(5000);
//	
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
//		
//		// select the Plan
//		try {
//			
//			waitEst.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-facade-selector[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]")));
//			
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-facade-selector[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]"))
//					.click();
//		System.out.println("Home Plan Selected for Register a sale");
//		} catch (Exception e) {
//			System.out.println("Home Plan is not present");
//		}
//		
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Select')]")));
//      
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Select')]")).click();
//		Thread.sleep(5000);
//
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-package-reviewer[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]/i[1]")));
//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-package-reviewer[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]/i[1]"))
//				.click();
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//p[contains(text(),'Blue')]")).click();
//		
//		Thread.sleep(5000);
//
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-package-reviewer[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[2]/i[1]")));
//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-package-reviewer[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[2]/i[1]"))
//				.click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//p[contains(text(),'Aleutian/SW 6241')]")).click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//a[contains(text(),'PROCEED WITH SALE')]")).click();
//		Thread.sleep(5000);
//
//		WebElement salePrice = driver.findElement(By.xpath("//input[@id='salePrice']"));
//		salePrice.sendKeys("234567");
//
//		Thread.sleep(5000);
//		WebElement homeArea = driver.findElement(By.xpath("//input[@id='homeArea']"));
//		homeArea.sendKeys("1100");
//
//
//		Select homeType = new Select(driver.findElement(By.xpath("//tbody/tr[6]/td[2]/div[1]/select[1]")));
//		homeType.selectByIndex(0);
//		Thread.sleep(5000);
//
//		WebElement estCloseDate = driver.findElement(By.xpath("//input[@id='estimatedClosingDatePicker']"));
//	estCloseDate.sendKeys("12/21/2022");
//		estCloseDate.sendKeys(Keys.TAB);
//		
//		
//		Thread.sleep(5000);
//		WebElement GroupNo = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
//		GroupNo.sendKeys(Keys.TAB);
//		
//		Thread.sleep(5000);
//		WebElement firstNameB1 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
//		//firstNameB1.click();
//		firstNameB1.sendKeys("Test");
//
//		WebElement lastNameB1 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
//		lastNameB1.sendKeys("Sanjay");
//
//		Thread.sleep(5000);
//		WebElement emailB1 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
//		emailB1.sendKeys("Test.Sanjay." + System.currentTimeMillis() + "@runwayproptech.com");
//		
//		Thread.sleep(5000);
//		Select empStatus1 =  new Select (driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/select[1]")));
//		empStatus1.selectByVisibleText("Don't Work");
//		
//		Thread.sleep(5000);
//		WebElement firstNameB2 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
//		firstNameB2.sendKeys("Test");
//
//		Thread.sleep(5000);
//		WebElement lastNameB2 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
//		lastNameB2.sendKeys("BuyerTwo");
//
//		Thread.sleep(5000);
//		WebElement emailB2 = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
//		emailB2.sendKeys("Test.sanjay2.45678@runwayproptech.com");
//		
//		Thread.sleep(5000);
//		Select empStatus2 =  new Select (driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/select[1]")));
//		empStatus2.selectByVisibleText("Don't Work");
//		
//		Thread.sleep(5000);
//		Select marriageStatus = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/select[1]")));
//		marriageStatus.selectByIndex(0); 
//		Thread.sleep(5000);
//
//		Select age = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/select[1]")));
//		age.selectByIndex(0); 
//		Thread.sleep(5000);
//
//		Select child = new Select(driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/select[1]")));
//		child.selectByVisibleText("0"); 
//		Thread.sleep(5000);
//
//		WebElement prevZip = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/div[1]/input[1]"));
//		prevZip.sendKeys("1100");
//		
//		Thread.sleep(5000);
//		Select moveFrom = new Select(driver.findElement(By.xpath("//tbody/tr[7]/td[4]/div[1]/select[1]")));
//		moveFrom.selectByIndex(0);
//		
//		Thread.sleep(5000);
//		Select rentOwn = new Select(driver.findElement(By.xpath("//tbody/tr[8]/td[2]/div[1]/select[1]")));
//		rentOwn.selectByIndex(0);
//		
//		Thread.sleep(5000);
//		Select whyMoving = new Select(driver.findElement(By.xpath("//tbody/tr[8]/td[4]/div[1]/select[1]")));
//		whyMoving.selectByIndex(0);
//		
//
//		Select firstHome = new Select(driver.findElement(By.xpath("//tbody/tr[9]/td[2]/div[1]/select[1]")));
//		firstHome.selectByIndex(0); 
//		Thread.sleep(5000);
//
//		Select veteran = new Select(driver.findElement(By.xpath("//tbody/tr[9]/td[4]/div[1]/select[1]")));
//		veteran.selectByIndex(0); 
//		Thread.sleep(5000);
//
//		Select emptyNester = new Select(driver.findElement(By.xpath("//tbody/tr[10]/td[2]/div[1]/select[1]")));
//		emptyNester.selectByIndex(0); 
//		Thread.sleep(5000);
//
//		
//		
//		WebElement marketingArea = driver.findElement(By.xpath("//tbody/tr[10]/td[4]/div[1]/label[1]/input[1]"));
//		marketingArea.click();
//		
//		
//		Select whyChoose = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[2]/div[1]/select[1]")));
//		whyChoose.selectByIndex(0); 
//		 Thread.sleep(5000);
//		
//		Select isReferred = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[4]/div[1]/select[1]")));
//		isReferred.selectByIndex(0);
//		Thread.sleep(5000);
//		
//		
//		Select realtor = new Select(driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-sale-register[1]/div[1]/form[1]/div[1]/app-purchaser-details[1]/div[4]/div[1]/div[1]/div[1]/div[1]/select[1]")));
//		realtor.selectByIndex(1); 
//		 Thread.sleep(5000);
//		
//		
//
//		driver.findElement(By.xpath("//button[contains(text(),'REGISTER SALE')]")).click();
//		Thread.sleep(10000);
//		
//		System.out.println("Register Sale Process completed");
//		
//		//First fetch the lot details
//		String details = driver.findElement(By.xpath("//*[@id=\"masonry-boxes\"]/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
////		System.out.println(details.length());
//		
//		System.out.println(details);
//		Thread.sleep(3000);
//		
//		//Click on Go to list and check
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-package-detail/div[1]/div/div[2]/div[2]/button/span[2]")).click();
//		Thread.sleep(3000);
//	
//		//Quick search
//		WebElement quick = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[1]/app-header/div[1]/div[1]/div[2]/div/p/input"));
//		quick.sendKeys(details.substring(3));
//		
//		Thread.sleep(3000);
//		
//		quick.sendKeys(Keys.ENTER);
//			
//		//Compare
//		String lot1 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/table/tbody/tr/td[1]")).getText();
//        System.out.println(lot1);
//        
//		if(details.contains(lot1.substring(3))) {
//			
//			Reporter.log("Register sale is success", true);
//			
//		}else {
//			
//			
//			Reporter.log("Register sale is failed", true);
//		}
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/table/tbody/tr/td[9]")).click();
//		 
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/app-actions-menu/div/ul/li[1]")).click();	
//
//		String Text = "Sold";
//		String AfterSaleStatus = driver.findElement(By.xpath("//div[contains(text(),'Sold')]")).getText();
//		System.out.println("After sale status is : " + AfterSaleStatus );
//		
//		if(Text.equalsIgnoreCase(AfterSaleStatus)) {
//			
//			Reporter.log("Registrer Sale Process is Successfull", true );
//		}
//		else {
//			Reporter.log("Register Sale Process is Failed", true);
//			
//			String Purchaserdetails = driver.findElement(By.xpath("//*[@id=\"masonry-boxes\"]/div/div[7]/div/div[2]/div")).getText();
//			System.out.println(Purchaserdetails);
//		}
//	}
	
	@Test(priority=3)
	public void cancelSaleTest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Public\\HowardHughesBP\\Configuration\\config.properties");
		prop.load(ip);

		
		driver.get(prop.getProperty("baseURL"));
	
        Thread.sleep(4000);
//		WebElement okConfirm = driver.findElement(By.xpath("//a[contains(text(),'OK')]"));
//		okConfirm.click();

		WebElement username = driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		WebElement password = driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));

		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		Thread.sleep(5000);

		WebDriverWait waitEst = new WebDriverWait(driver, 30);
		waitEst.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Union Park')]")));
		
		WebElement selectCommunity = driver.findElement(By.xpath("//div[contains(text(),'Union Park')]"));
		selectCommunity.click();
		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("List")).click();
		Thread.sleep(10000);

		Select statusFilter = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-lot-list-main[1]/app-lot-list-view[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")));
		statusFilter.selectByVisibleText("Sold");
		Thread.sleep(5000);
		WebElement firstLot = null;
		try {
			firstLot = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));

		} catch (Exception e) {
			System.out.println("Sold lot is not present in this project");
		}

		String lotName1 = firstLot.getText();
		firstLot.click();
		System.out.println(lotName1);
		System.out.println("Sold Lot Selected for Cancel a sale functionality");

		driver.findElement(By.partialLinkText("Cancel Sa")).click();
		Thread.sleep(5000);
		
		  Select cancelCondition = new
		  Select(driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/select[1]")));
		  cancelCondition.selectByIndex(0); 
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[contains(text(),'CANCEL SALE')]")).
		  click(); 
		  Thread.sleep(5000);
		  try {
			boolean listview = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-masterplan-view/div[1]/div/div[3]/a[2]/i")).isDisplayed();
			Thread.sleep(3000);
		  }catch(Exception e) {
			  
		  }finally {
			  driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-masterplan-view/div[1]/div/div[3]/a[2]/i")).click();
		  }
		  
	         //Click on available list
		  driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[1]/div/div[2]/p[2]/span")).click();
		  
		 Thread.sleep(3000);
	
		  //Quick search
			WebElement quick = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[1]/app-header/div[1]/div[1]/div[2]/div/p/input"));
			quick.sendKeys(lotName1);
			
			Thread.sleep(3000);
			
			quick.sendKeys(Keys.ENTER);
				
			//Compare
			String lot1 = driver.findElement(By.xpath("//tbody/tr/td[1]")).getText();
	        System.out.println(lot1);
	        
			driver.findElement(By.xpath("//tbody/tr/td[9]")).click();
			 
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/app-actions-menu/div/ul/li[1]")).click();	
	
			String Text = "Available";
			String AfterCancelStatus = driver.findElement(By.xpath("//div[contains(text(),'Available')]")).getText();
			System.out.println("After sale status is : " + AfterCancelStatus );
			
			if(Text.equalsIgnoreCase(AfterCancelStatus)) {
				
				Reporter.log("Cancel Sale Process is Successfull", true );
			}
			else {
				Reporter.log("Cancel Sale Process is Failed", true);
				

			}
		 	
	}

//	@Test(priority=4)
//	public void closeSaleTest() throws InterruptedException, IOException {
//		// TODO Auto-generated method stub
//
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\Public\\BuilderPortals\\configs\\Configuration.properties");
//		prop.load(ip);
//
//        driver.get(prop.getProperty("HRUrl"));
//        
//        Thread.sleep(4000);
//		
//		WebElement okConfirm = driver.findElement(By.xpath("//a[contains(text(),'OK')]"));
//		okConfirm.click();
//
//		WebElement username = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//		WebElement password = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
//		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
//
//		username.sendKeys(prop.getProperty("HRun"));
//		password.sendKeys(prop.getProperty("HRpwd"));
//		login.click();
//		Thread.sleep(5000);
//
//		WebDriverWait waitEst = new WebDriverWait(driver, 30);
//		waitEst.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Union Park')]")));
//		
//		WebElement selectCommunity = driver.findElement(By.xpath("//div[contains(text(),'Union Park')]"));
//		selectCommunity.click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.partialLinkText("List")).click();
//		Thread.sleep(10000);
//
//		Select statusFilter = new Select(driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-lot-list-main[1]/app-lot-list-view[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")));
//		statusFilter.selectByVisibleText("Sold");
//		Thread.sleep(5000);
//		WebElement firstLot = null;
//		try {
//			firstLot = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
//
//		} catch (Exception e) {
//			System.out.println("Sold lot is not present in this project");
//		}
//
//		String lotName1 = firstLot.getText();
//		firstLot.click();
//		System.out.println("Lot Name to close Sale : " + lotName1);
//		System.out.println("Sold Lot Selected for Close a sale functionality");
//
//		driver.findElement(By.partialLinkText("Close Sa")).click();
//		Thread.sleep(5000);
//		
//	
//		WebElement closeProce =driver.findElement(By.xpath("//input[@id='closingPrice']"));
//		closeProce.sendKeys("555555");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//button[contains(text(),'CLOSE SALE')]")).
//		click(); Thread.sleep(5000);
//		
//		
//		//First fetch the lot details
//		String details = driver.findElement(By.xpath("//*[@id=\"masonry-boxes\"]/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
//		System.out.println(details.length());
//		
//		System.out.println(details);
//		
//		
//		//Click on Go to list and check
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-package-detail/div[1]/div/div[2]/div[2]/button/span[2]")).click();
//		
//		//Quick search
//		WebElement quick = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[1]/app-header/div[1]/div[1]/div[2]/div/p/input"));
//		quick.sendKeys(details.substring(3));
//		
//		Thread.sleep(3000);
//		
//		quick.sendKeys(Keys.ENTER);
//		
//		//Compare
//		String lot1 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/table/tbody/tr/td[1]")).getText();
//        System.out.println(lot1);
//        
//		if(details.contains(lot1.substring(3))) {
//			
//			Reporter.log("Closed sale is success", true);
//			
//		}else {
//			
//			
//			Reporter.log("Closed sale is failed", true);
//		}
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/table/tbody/tr/td[9]")).click();
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/app-actions-menu/div/ul/li[1]")).click();	
//
//		String Text = "Closed";
//		String AfterSaleCloseStatus = driver.findElement(By.xpath("//div[contains(text(),'Closed')]")).getText();
//		System.out.println("After sale close status is : " + AfterSaleCloseStatus );
//		
//		if(Text.equalsIgnoreCase(AfterSaleCloseStatus)) {
//			
//			Reporter.log("Close Sale Process is Successfull", true );
//		}
//		else {
//			Reporter.log("Close Sale Process is Failed", true);
//		}
//		
//		
//		/*
//		 * driver.findElement(By.xpath("//button[contains(text(),'CANCEL SALE')]")).
//		 * click(); Thread.sleep(5000);
//		 * 
//		 * driver.findElement(By.partialLinkText("List")).click(); Thread.sleep(5000);
//		 * Select statusFilter1 = new Select(driver.findElement(By.xpath(
//		 * "//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-lot-list-main[1]/app-lot-list-view[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]"
//		 * ))); statusFilter1.selectByVisibleText("Sold"); WebElement secondLot = null ;
//		 * try { secondLot= driver.findElement(By.xpath("//tbody/tr[1]/td[1]")); String
//		 * lotName2= secondLot.getText();
//		 * System.out.println("Next Lot Name in Sold Status  : "+ lotName2 );
//		 * System.out.println( lotName1
//		 * +"has been removed from Sold state after Cancelling the Sale "); } catch
//		 * (Exception e) {
//		 * System.out.println("No More Sold lot is not present in this project"); }
//		 * 
//		 * Thread.sleep(5000);
//		 */
//
//		
//
//	}
	
//	@Test
//	public void specHome() throws InterruptedException, IOException {
//		
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\Public\\BuilderPortals\\configs\\Configuration.properties");
//		prop.load(ip);
//
//		driver.get(prop.getProperty("HRUrl"));
//		
//		
//		
//		WebDriverWait wt1 = new WebDriverWait(driver,10);
//	    WebElement okConfirm1 = wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'OK')]")));
//	    okConfirm1.click();
//
//		WebElement username = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//		WebElement password = driver.findElement(By.xpath(
//				"//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
//		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
//
//		username.sendKeys(prop.getProperty("HRun"));
//		password.sendKeys(prop.getProperty("HRpwd"));
//		login.click();
//		Thread.sleep(10000);
//
//		WebDriverWait waitEst = new WebDriverWait(driver, 30);
//		waitEst.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Union Park')]")));
//
//		WebElement selectCommunity = driver.findElement(By.xpath("//div[contains(text(),'Union Park')]"));
//		selectCommunity.click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.partialLinkText("List")).click();
//		
//		Thread.sleep(10000);
//		
//		//Click on available
//		
//		WebDriverWait wt = new WebDriverWait(driver, 20);
//		WebElement ele = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//body[1]/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-lot-list-main[1]/app-lot-list-view[1]/div[1]/div[1]/div[2]/p[2]")));
//	     ele.click();
//	
//        Thread.sleep(5000);
//
//		
//		waitEst.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]")));
//
//		
//    try {
//    	    String status = driver.findElement(By.xpath("//tbody/tr[1]/td[9]")).getText();
//			System.out.println("status is : "+ status);
//			String Expected = "Available";
//			if(Expected.equalsIgnoreCase(status))	{
//				
//				System.out.println("Selected lot is available");
//			}
//				
//							
//			WebElement Status1 = driver.findElement(By.xpath("//tbody/tr[1]/td[9]"));
//			Status1.click();
//	} catch (Exception e) {
//			System.out.println("Available lot is not present");
//		}
//        //Click on SpecHome 
//		driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[2]/div[2]/div/app-actions-menu/div/ul/li[2]/a/i")).click();
//		Thread.sleep(5000);
//		
//		// select a Home
//		try {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/div[1]/div[1]/app-community[1]/div[2]/app-create-package-journey[1]/app-homes-selector[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]"))
//					.click();
//		System.out.println("Home Design Selected for Spec home");
//		} catch (Exception e) {
//		System.out.println("Home Design is not present");
//	}
//		Thread.sleep(5000);
//
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-homes-selector/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div[1]/button")).click();
//	
//	//Select colors
//	driver.findElement(By.xpath("//*[@id=\"dropdown_menu_1\"]/div/div[2]")).click();
//	
//	//click on paint selections
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-homes-selector/div[2]/div[2]/div/div/div[3]/div[2]/div/div[2]/div[1]/button")).click();
//	
//	//Select paint
//	driver.findElement(By.xpath("//*[@id=\"dropdown_menu_2\"]/div/div[1]")).click();
//	
//	Thread.sleep(3000);
//	//Click on select
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-homes-selector/div[2]/div[2]/div/a[2]")).click();	
//	
//	//Select elevation
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-facade-selector/div/div/div[2]/div[1]/div/div/div[2]/div/figure")).click();	
//	
//	Thread.sleep(3000);
//	//Click on select
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-facade-selector/div/div/div[2]/div[2]/a")).click();
//	
//	Thread.sleep(3000);
//	WebElement Price = driver.findElement(By.id("price"));
//	Price.clear();
//	Price.sendKeys("234567");
//	
//	
//	driver.findElement(By.id("startDatePicker")).click();
// 	
// 	String flag = "False";
// 	
// 	while(flag=="False") {
// 		
// 		if(driver.findElements(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[22]")).size()>0) {
// 			
// 			driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[22]")).click();
// 			flag="True";
//               break;
// 		}
// 		else {
// 			Thread.sleep(3000);
// 			driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]")).click();
// 		}
// 		
// 		
// 	}
//	
//	driver.findElement(By.id("completionDatePicker")).click();
// 	
// 	String flag1 = "False";
// 	
// 	while(flag1=="False") {
// 		
// 		if(driver.findElements(By.xpath("//*[@id=\"datepickers-container\"]/div[2]/div/div/div[2]/div[28]")).size()>0) {
// 			
// 			driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[2]/div/div/div[2]/div[28]")).click();
// 			flag1="True";
//               break;
// 		}
// 		else {
// 			Thread.sleep(3000);
// 			driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[2]/nav/div[3]")).click();
// 		}
// 		
// 		
// 	}
// 	
// 	//Click on spec home
// 	driver.findElement(By.xpath("/html/body/app-root/div/div/app-community/div[2]/app-create-package-journey/app-package-creator/div/form/div/div/div[2]/button")).click();
// 	
// 	String Text = "Spec";
// 	String newStatus = driver.findElement(By.xpath("//*[@id=\"masonry-boxes\"]/div/div[1]/div/div[1]/div/div")).getText();
// 	System.out.println(newStatus);
// 	
// 	if(Text.equals(newStatus)) {
// 		
// 		Reporter.log("Spec home process is pass " + true);
// 	}else {
// 		Reporter.log("Spec home Process is fail "+ true);
// 	}
//	
//		
//	}

}
