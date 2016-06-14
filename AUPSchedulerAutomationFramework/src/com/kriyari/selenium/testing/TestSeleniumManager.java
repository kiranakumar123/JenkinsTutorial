package com.kriyari.selenium.testing;
import java.io.IOException;

//import org.junit.*;
import com.kriyari.selenium.helper.SeleniumManager;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestSeleniumManager {
	static SeleniumManager selMan;//=new SeleniumManager();
	static WebDriver selenium;
	
	@BeforeClass
	public static void testSeleniumStart() throws IOException{
		
		selMan=new SeleniumManager();
		selMan.start("http://localhost/");
		selenium = selMan.getSelenium();
	}
	
	@Test
	public void openAdmin(){
		//selenium.open("/admin/login");
		selenium.get("http://www.google.com");
	}
	@AfterClass
	public static void testSeleniumStop() throws IOException{
		selMan.stop();
		
		
	}
}
