package com.kriyari.selenium.data;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.ADMIN_URL;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.ADMIN_URL;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.BUTTON_CLICK_LOGIN;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_ENTERPRISE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_ADMIN_LOGIN_NAME;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_ADMIN_PASSWORD;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.WAIT_FOR_PAGE_TO_LOAD;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;

import static org.testng.Assert.*;


import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.TheSeleniumManager;

public class AdminLoginPage {
	
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public AdminLoginPage(WebDriver selenium) {
	
		this.selenium=selenium;
	
	}
	public void loadPropertiesFile(){
//		System.out.println("Properties file is" +PROPERTIES_FILE);
//		file=new File(PROPERTIES_FILE);
//		propClass=new PropertiesClass();
//		propClass.loadProperties(file);	
		File file =new File(ADMIN_LOGIN_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);
		
	}
	public void openLoginPage(){
		/*selenium.windowMaximize();
		selenium.setSpeed("300");
		selenium.open(ADMIN_URL);
		assertTrue(selenium.isTextPresent("Login"));*/
		
	}
	public void typeAdminLoginName() {
		//selenium.type(TEXT_ADMIN_LOGIN_NAME,propClass.getAdminLoginName());
	}
	
	public void typeAdminPassword() {
		//selenium.type(TEXT_ADMIN_PASSWORD,propClass.getAdminPassword());
	}
	public void clickLoginButton() {
	//	selenium.click(BUTTON_CLICK_LOGIN);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);	
	}
	public void clickEnterpriseLink(){
		//selenium.click(locator)
		//selenium.click(LINK_ENTERPRISE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
//	public void openPublicationCreatePage(){
//		selenium.click(LINK_NEW_PUBLICATION);	
//		selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);		
//	}
	
		

}
