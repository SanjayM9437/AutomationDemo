package com.HowardHughesBP.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.HowardHughesBP.testCases.BaseClass;

public class TestUtilities extends BaseClass {
	
public void getScreenshot() throws IOException {
		
		Date current = new Date();
		String screenshotfilename = current.toString().replace(" ","-").replace(":","-");
		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotfile, new File("C:\\Users\\Public\\HowardHughesBP\\Screenshots\\" + screenshotfilename + ".png"));
		
		
	}


}


