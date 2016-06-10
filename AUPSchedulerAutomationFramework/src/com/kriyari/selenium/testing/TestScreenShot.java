package com.kriyari.selenium.testing;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.TheSeleniumManager;

public class TestScreenShot
{

	private WebDriver driver;
	private SeleniumLogger logger;
	@BeforeSuite
	public void beforeSuite()
	{
		driver=TheSeleniumManager.getSeleniumManager().getDriver("firefox");
		logger=TheSeleniumManager.getSeleniumLogger("testSeleniumLogger");
		
	}
	
	@Test
	public void test()
	{
		
		//logger.debug("getting http://www.google.com");
		driver.get("http://www.google.com");
		//logger.debug("asserting");
		Reporter.log("logging from testScreenShot.Should appear in index.html of testng-xslt reports");
		logger.error("Error from testScreenShot");
		Assert.assertEquals(driver.getTitle(), "testing");
	}
}
