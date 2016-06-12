package com.kriyari.selenium.helper;

import static com.kriyari.selenium.helper.SeleniumConstants.SELENIUM_BROWSER_FIREFOX;
import static com.kriyari.selenium.helper.SeleniumConstants.SELENIUM_SERVER_HOST;
import static com.kriyari.selenium.helper.SeleniumConstants.SELENIUM_SERVER_PORT;
import static com.kriyari.selenium.helper.SeleniumConstants.SELENIUM_SERVER_SHUTDOWN_COMMAND;
import static com.kriyari.selenium.helper.SeleniumConstants.IE_DRIVER_LOCATION;
import static com.kriyari.selenium.helper.SeleniumConstants.CHROME_DRIVER_LOCATION;
import static com.kriyari.selenium.helper.SeleniumConstants.CHROME_BROWSER;
import static com.kriyari.selenium.helper.SeleniumConstants.INTERNET_EXPLORER_BROWSER;
import static com.kriyari.selenium.helper.SeleniumConstants.FIREFOX_BROWSER;
import static com.kriyari.selenium.helper.SeleniumConstants.HTML_UNIT_DRIVER;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

//import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.thoughtworks.selenium.DefaultSelenium;
//import com.thoughtworks.selenium.Selenium;

public class SeleniumManager
{

	// SeleniumServer seleniumServer=null;
	WebDriver driver = null;
	private String browser = "";
	private static Map<String, WebDriver> drivers= new HashMap<String, WebDriver>();
	public void start(String baseURL) throws IOException
	{

		/*
		 * String stopSeleniumCommand =
		 * String.format(SELENIUM_SERVER_SHUTDOWN_COMMAND,SELENIUM_SERVER_HOST,
		 * SELENIUM_SERVER_PORT); System.out.println(stopSeleniumCommand);
		 * 
		 * try { seleniumServer = new SeleniumServer(); seleniumServer.start();
		 * } catch (java.net.BindException bE){
		 * 
		 * System.out.println("could not bind - carrying on");
		 * 
		 * if( runHTTPCommand(stopSeleniumCommand)){ try { seleniumServer = new
		 * SeleniumServer(); seleniumServer.start(); } catch (Exception e) {
		 * throw new IllegalStateException(
		 * "Could not stop existing server on blocked port " +
		 * SELENIUM_SERVER_PORT, e); } } } catch (Exception e) {
		 * 
		 * throw new IllegalStateException("Can't start selenium server", e); }
		 * 
		 * selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, new
		 * Integer(SELENIUM_SERVER_PORT), SELENIUM_BROWSER_FIREFOX, baseURL);
		 * selenium.start();
		 */
		driver.get(baseURL);

	}

	private boolean runHTTPCommand(String theCommand) throws IOException
	{
		URL url = new URL(theCommand);

		URLConnection seleniumConnection = url.openConnection();
		seleniumConnection.connect();

		InputStream inputStream = seleniumConnection.getInputStream();
		ByteArrayOutputStream outputSteam = new ByteArrayOutputStream();
		byte[] buffer = new byte[2048];
		int streamLength;
		while ((streamLength = inputStream.read(buffer)) != -1)
		{
			outputSteam.write(buffer, 0, streamLength);
		}
		inputStream.close();

		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		String stringifiedOutput = outputSteam.toString();

		if (stringifiedOutput.startsWith("OK"))
			return true;

		return false;
	}

	public WebDriver getSelenium()
	{
		return driver;
	}

	 public WebDriver getGridDriver(DesiredCapabilities caps)
     {
            try
			{
			
				driver = drivers.get("GRID_DRIVER");
				if(driver == null)
				{
					
					driver = new RemoteWebDriver(new URL("http://104.199.155.110:4444/wd/hub"), caps);
					drivers.put("GRID_DRIVER", driver);
				}
			} catch (MalformedURLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            return driver;
     }
	 
	public WebDriver getDriver(String browser)
	{	

		switch (browser) 
		{
			case(FIREFOX_BROWSER):
				driver = drivers.get(FIREFOX_BROWSER);
				if(driver == null)
				{
					driver = new FirefoxDriver();
					drivers.put(FIREFOX_BROWSER, driver);
				}
				break;
			case(CHROME_BROWSER):
				driver = drivers.get(CHROME_BROWSER);
				if(driver == null)
				{
					System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
					driver = new ChromeDriver();
					drivers.put(CHROME_BROWSER, driver);
				}
				break;
			case(INTERNET_EXPLORER_BROWSER):
				driver = drivers.get(INTERNET_EXPLORER_BROWSER);
				if(driver == null)
				{
					System.setProperty("webdriver.ie.driver", IE_DRIVER_LOCATION);
					driver = new InternetExplorerDriver();
					drivers.put(INTERNET_EXPLORER_BROWSER, driver);
				}
				break;
			case(HTML_UNIT_DRIVER):
				driver = drivers.get(HTML_UNIT_DRIVER);
				if(driver == null)
				{
					
					driver = new HtmlUnitDriver();
					drivers.put(HTML_UNIT_DRIVER, driver);
				}
				break;			
			//If browser doesn't matches then default to firefox driver
			default:
				driver = new FirefoxDriver();
				drivers.put(FIREFOX_BROWSER, driver);			
		
		}
		
		return driver;
		
		/*if (!this.browser.equalsIgnoreCase(browser))
		{

			if (driver != null)
			{
				driver.close();
			}

			// this.baseURL = baseURL;

			if (browser != "")
				this.browser = browser;
		}

		String firefoxBrowsers = "|firefox|firefoxproxy|pifirefox|firefoxchrome|";
		if (firefoxBrowsers.contains("|" + browser + "|"))
		{
			System.out.println("setting driver to firefox driver");
			driver = new FirefoxDriver();
		}

		String ieBrowsers = "|iexplore|iexploreproxy|piiexplore|iehta|ie|internetexplorer|";
		if (ieBrowsers.contains("|" + browser + "|"))
		{
			// driver = new InternetExplorerDriver();
			System.out.println("setting driver to ie driver");
			System.setProperty("webdriver.ie.driver", IE_DRIVER_LOCATION);
			driver = new InternetExplorerDriver();
		}

		String htmlUnitBrowsers = "|htmlunit|";
		if (htmlUnitBrowsers.contains("|" + browser + "|"))
		{
			System.out.println("setting driver to htmlunit");
			driver = new HtmlUnitDriver();
		}

		String chromeBrowsers = "|googlechrome|chrome|";
		if (chromeBrowsers.contains("|" + browser + "|"))
		{
			// driver = new ChromeDriver();
			System.out.println("setting driver to chrome");
			System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
			driver = new ChromeDriver();
		}
		
		//If browser doesn't matches then default to firefox driver
		if(driver==null)
		{
			System.out.println("defaulting to firefox driver");
			driver = new FirefoxDriver();
		}

		drivers.put(browser, driver);
		return driver;*/		

	}

	public void stop()
	{
		if (driver != null)
		{
			driver.close();
		}

	}
	
	private static void stop(String browser)
	{
		/*if (driver != null)
		{
			driver.close();
		}*/
		for(String key:drivers.keySet())
		{
			if(key.contains(browser))
			{
				drivers.get(key).close();
				drivers.get(key).quit();
			}
		}

	}
	
	public static void closeAllDrivers()
	{
		closeFirefoxDrivers();
		closeIEDrivers();
		closeChromeDrivers();
	}
	
	public static void closeFirefoxDrivers()
	{
		stop("firefox");
	}
	
	public static void closeIEDrivers()
	{
		stop("InternetExplorer");
	}
	
	public static void closeChromeDrivers()
	{
		stop("firefox");
	}
	public static void main(String args[])
	{
		SeleniumManager manager = new SeleniumManager();
		WebDriver driver = manager.getDriver("");
		driver.get("http://www.google.com");
		//driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
	}

}

