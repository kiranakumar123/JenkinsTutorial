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
                 System.out.println("Before selenium manager");
		WebDriver driver = TheSeleniumManager.getSeleniumManager().getSelenium();
                System.out.println("After selenium manager");
		//SeleniumLogger logger = TheSeleniumManager.getSeleniumLogger();
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
		//String destDir = "D:\\Webdriver\\failure.png";
		// FileUtils.copyFile(file, new File("D:\\Webdriver\\failure.png"));
		//String destDir = "D:\\apache-tomcat-9.0.0.M1\\webapps\\reports\\screenshots";
		String destDir = "/var/www/html/results/screenshots";
		System.out.println("Inside TestNGCustomListenerForScreenShots");
		new File(destDir).mkdirs();
		String destFile = dateFormat.format(new Date()) + ".png";

		try
		{

			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			System.out.println("after copyFile");
		} catch (IOException e)
		{
			e.printStackTrace();
                        System.out.println("stack trace:");
		}
		Reporter.setEscapeHtml(false);
		Reporter.log("Saved <a href=../../reports/screenshots/" + destFile + ">Screenshot</a>");
		Reporter.log("test log");
		
	}
}
