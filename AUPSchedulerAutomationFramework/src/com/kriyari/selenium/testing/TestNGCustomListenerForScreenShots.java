package com.kriyari.selenium.testing;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.TheSeleniumManager;

public class TestNGCustomListenerForScreenShots extends TestListenerAdapter
{

	@Override
	public void onTestFailure(ITestResult tr)
	{
		WebDriver driver = TheSeleniumManager.getSeleniumManager().getSelenium();
		//SeleniumLogger logger = TheSeleniumManager.getSeleniumLogger();
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
		//String destDir = "D:\\Webdriver\\failure.png";
		// FileUtils.copyFile(file, new File("D:\\Webdriver\\failure.png"));
		String destDir = "D:\\apache-tomcat-9.0.0.M1\\webapps\\reports\\screenshots";
		new File(destDir).mkdirs();
		String destFile = dateFormat.format(new Date()) + ".png";

		try
		{
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		Reporter.setEscapeHtml(false);
		Reporter.log("Saved <a href=../../reports/screenshots/" + destFile + ">Screenshot</a>");
		Reporter.log("test log");
		
	}
}