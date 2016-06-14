package com.kriyari.selenium.helper;

import java.io.File;

public class SeleniumConstants {

	
    public static final String SELENIUM_SERVER_HOST="localhost";
    public static final String SELENIUM_SERVER_PORT="4444";
    public static final String SELENIUM_BROWSER_STARTCOMMAND="/admin/login";
    public static final String SELENIUM_BROWSER_URL="http://localhost";
    public static final String SELENIUM_BROWSER_FIREFOX="*firefox D:/Mozilla Firefox/firefox.exe";
    public static final String SELENIUM_SERVER_SHUTDOWN_COMMAND="http://%s:%s/selenium-server/driver/?cmd=shutDownSeleniumServer";
    
	public static final String FIREFOX_BROWSER = "FIREFOX";
	public static final String INTERNET_EXPLORER_BROWSER = "INTERNET_EXPLORER";
	public static final String CHROME_BROWSER = "CHROME";
	public static final String HTML_UNIT_DRIVER = "HTML_UNIT_DRIVER";
    
   // public static final String IE_DRIVER_LOCATION = "D:\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe";
   // public static final String CHROME_DRIVER_LOCATION ="D:\\chromedriver_win32\\chromedriver.exe";
    public static final String IE_DRIVER_LOCATION=System.getenv("SELENIUM_HOME")+File.separator+"drivers"+File.separator+"IEDriverServer.exe";
    public static final String CHROME_DRIVER_LOCATION=System.getenv("SELENIUM_HOME")+File.separator+"drivers"+File.separator+"chromedriver.exe";
 //public static final String SELENIUM_HOME_VALUE="D:/app/phoenix/Selenium";
    
    
    
    
}

