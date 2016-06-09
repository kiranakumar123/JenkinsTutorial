package com.kriyari.selenium.suite;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.BASE_URL_OF_ADMIN;

import java.io.IOException;
/*
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;*/

import com.kriyari.selenium.data.PublicationCreationPage;
import com.kriyari.selenium.helper.SeleniumManager;
import com.kriyari.selenium.test.AdminLoginPageTest;
import com.kriyari.selenium.test.PublicationCreationPageTest;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


//@RunWith(Suite.class)
//@SuiteClasses({AdminLoginPageTest.class,PublicationCreationPageTest.class})*/
public class PublicationCreationSuite {
	private static WebDriver selenium;
	private static SeleniumManager seleniumManager;
	private static PublicationCreationPage publication;
	

	@BeforeClass
	public static void initiateSeleniumServer() throws IOException{
	
		seleniumManager=new SeleniumManager();
		seleniumManager.start(BASE_URL_OF_ADMIN);
		selenium=seleniumManager.getSelenium();		
		publication=new PublicationCreationPage(selenium);
		publication.loadPropertiesFile();
		
	}
	
	@AfterClass
	public static void stopSeleniumServer()throws IOException{

		seleniumManager.stop();
	}
}
