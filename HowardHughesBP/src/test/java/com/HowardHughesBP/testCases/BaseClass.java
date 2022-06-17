package com.HowardHughesBP.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.HowardHughesBP.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
    public static WebDriver driver;
    
    public static Logger logger;
    
    @Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		
//		WebDriverManager.chromedriver().setup();
	
    	logger = Logger.getLogger("Hillwood BuilderPortal");
		 PropertyConfigurator.configure("Log4j.properties");
		 
		 if(br.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				driver=new ChromeDriver();
			}
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();
			}
			
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		
		
	}
	@AfterTest
	public void tearDown() {
		
		//driver.quit();
		
		
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
public String randomString() {
		
		String generatedstring = RandomStringUtils.randomAlphabetic(10);
		return(generatedstring);
		//String email = randomstring()+"gmail.com"; 
	}
	
public String randomNum() {
		
		String generatedstring2 = RandomStringUtils.randomNumeric(4);
		return(generatedstring2);
		//String email = randomstring()+"gmail.com"; 
	}

}
