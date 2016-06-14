//package com.testing.roadToAutomation;
package seleniumcookbook.examples.test;
//package com.kriyari.selenium.testing;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import com.kriyari.selenium.helper.SeleniumLogger;
//import com.kriyari.selenium.helper.TheSeleniumManager;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
public class FileUpload
{
	WebDriver driver = null;
	private StringBuffer verificationErrors = new StringBuffer();
        //private SeleniumLogger logger;
        @BeforeSuite
        public void beforeSuite()
        {
         //       driver=TheSeleniumManager.getSeleniumManager().getDriver("firefox");

 /*InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
String baseSeleniumDir = System.getenv("SELENIUM_HOME");
                System.out.println("inside se grid selenium_home:"+baseSeleniumDir);
String newbaseSeleniumDir = System.getenv("SELENIUM_REPORTS_HOME");
                System.out.println("inside se grid selenium_reports_home:"+newbaseSeleniumDir);
//                logger=TheSeleniumManager.getSeleniumLogger("testSeleniumLogger");
*/

        }
	//@Parameters({ "platform","browser","version", "url" })
	@Parameters({ "platform","browser", "url" })
	@BeforeTest(alwaysRun=true)
	public void setup(String platform, String browser, String url) throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		//Platforms
		if(platform.equalsIgnoreCase("Windows"))
			caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		if(platform.equalsIgnoreCase("MAC"))
			caps.setPlatform(org.openqa.selenium.Platform.MAC);
		//Browsers
		if(browser.equalsIgnoreCase("Internet Explorer"))
			caps = DesiredCapabilities.internetExplorer();
		if(browser.equalsIgnoreCase("Firefox"))
			caps = DesiredCapabilities.firefox();
		if(browser.equalsIgnoreCase("iPad"))
			caps = DesiredCapabilities.ipad();
		if(browser.equalsIgnoreCase("Android"))
			caps = DesiredCapabilities.android();
		//Version
		//caps.setVersion(version);
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);		// Open the BMI Calculator Application
driver = new RemoteWebDriver(new URL("http://104.199.155.110:4444/wd/hub"), caps);
System.out.println("Getting grid driver for :"+browser);
//driver=TheSeleniumManager.getSeleniumManager().getGridDriver(caps);
//driver = new RemoteWebDriver(new URL("http://104.155.226.10:5555/wd/hub"), caps);
		driver.get(url);
	}

	@Test(description="Test Bmi Calculator")
	public void testBmiCalculator() throws InterruptedException 
	{
		/*WebElement height = driver.findElement(By.
		name("heightCMS"));
		height.sendKeys("181");
		WebElement weight = driver.findElement(By.
		name("weightKg"));
		weight.sendKeys("80");
		WebElement calculateButton = driver.findElement(By.id("Calculate"));
		calculateButton.click();
		try
		{

			WebElement bmi = driver.findElement(By.name("bmi"));
			assertEquals(bmi.getAttribute("value"),"24.4");
			WebElement bmi_category = driver.findElement(By.name("bmi_category"));
			assertEquals(bmi_category.getAttribute("value"),"Normal");
			 Reporter.log("logging from testScreenShot.Should appear in index.html of testng-xslt reports");
//	                logger.error("Error from testScreenShot");
        	        //Assert.assertEquals(driver.getTitle(), "testing");
                //        assertEquals("test","Normal");
		}
		catch (Error e) 
		{
			verificationErrors.append(e.toString());
		}*/

		WebElement element = driver.findElement(By.xpath("//a[@class='slider-btn slider-btn-upload']"));
		element.click();
		 element = driver.findElement(By.xpath("//div[@class='uploadElement']"));
		
		 new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		 
		  element.click();
		 
	
		 
		 Screen screen = new Screen();
		 try {
			//screen.click("D:\\WebDriverSikuliHue.sikuli\\1455702447965.png");
			//screen.type("C:\\Users\\kappa.ORADEV\\Desktop\\test.txt");
			//screen.click("D:\\WebDriverSikuliHue.sikuli\\1455702530634.png");

        	screen.click("/home/kiran_akumar123/git_repo/JenkinsTutorial/AUPSchedulerAutomationFramework/config/sikuli/1455702447965.png");
                screen.type("/home/kiran_akumar123/git_repo/JenkinsTutorial/AUPSchedulerAutomationFramework/config/sikuli/test.txt");
                screen.click("/home/kiran_akumar123/git_repo/JenkinsTutorial/AUPSchedulerAutomationFramework/config/sikuli/1455702530634.png");
                        
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		 
		 element = driver.findElement(By.xpath("//button[@class='btn btn-green btn-lg']"));
		 
		  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
		    
			 element.click();
			 
			 try
		    	{
		    		Thread.sleep(5000);
		    	}
		    	catch(InterruptedException ex)
		    	{
		    		
		    	}

	}
	
	@AfterTest
	public void afterTest() 
	{

	//Close the browser
		driver.quit();
		String verificationErrorString =  verificationErrors.toString();
		if (!"".equals(verificationErrorString)) 
		{
			fail(verificationErrorString);
		}
	}
}
		

