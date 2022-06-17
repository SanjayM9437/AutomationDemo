package com.HowardHughesBP.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CancelSale {
	
WebDriver ldriver;
	
	public CancelSale(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	

}
	@FindBy(how = How.XPATH, using="/html/body/app-root/div/div/app-community-list-main/div[2]/div/app-estates/div/div[2]/div/div[1]")
	WebElement lnkUnionPark;
	
	@FindBy(how = How.XPATH, using="/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-masterplan-view/div[1]/div/div[3]/a[2]/i")
	WebElement lnkList;
	
	@FindBy(how = How.XPATH, using="/html/body/app-root/div/div/app-community/div[2]/app-lot-list-main/app-lot-list-view/div[1]/div/div[2]/p[4]/span")
	WebElement lnkSold;
	
	
	public void clickUnionPark()
	{
		lnkUnionPark.click();
		
		
	}
	
	public void clickListView()
	{
		lnkList.click();
		
		
	}
	
	public void clickSoldList()
	{
		lnkSold.click();
		
		
	}
	
}