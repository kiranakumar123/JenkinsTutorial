package com.kriyari.selenium.testing;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kriyari.selenium.helper.TheSeleniumManager;



public class TestTheSeleniumManager {
	@BeforeClass
	public static void beforeClass(){
		TheSeleniumManager.getSeleniumManager();
	}

	@Test
	public void testGetScreenShotFolder(){
		SimpleDateFormat sdfmth = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String screenShotsFolder = sdfmth.format(cal.getTime());
		String expected="D:\\app\\phoenix\\Selenium\\screenshots\\" +screenShotsFolder+"\\";
		String actual=TheSeleniumManager.getScreenShotFolder();
		//assertEquals(expected, actual);
		
		
	}
}
