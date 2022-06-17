package com.HowardHughesBP.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="/html/body/app-root/div/app-footer/app-action/div/div[2]/div/div/div[2]/a")
	WebElement btnOK;
	
	@FindBy(name="userName")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/app-root/div/div/app-community-list-main/div[1]/app-header/div[1]/div[2]/div/div[1]/a")
	
	WebElement lnkHhomes;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	
	WebElement lnkLogout;
	
	
	public void clickOk()
	{
		btnOK.click();
		
		
	}
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
		
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
		
	}
	public void clickSubmit()
	{
		btnLogin.click();
		
		
	}
	public void clickHhomes()
	{
		lnkHhomes.click();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
}
