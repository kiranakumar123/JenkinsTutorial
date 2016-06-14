
package com.kriyari.selenium.test;


import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.CONFIRMATORY_MESSAGE_FOR_PUBLICATION_DELETE;

import java.io.IOException;
import java.util.List;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
*/
import com.kriyari.selenium.categories.CompletePublicationCreationPage;
import com.kriyari.selenium.categories.SeleniumPublicationCreationPage;
import com.kriyari.selenium.data.DeletePage;
import com.kriyari.selenium.helper.DataBaseConnection;
//import com.kriyari.selenium.helper.ErrorCollectorKiran;
import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.SeleniumManager;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.kriyari.selenium.helper.TheTestWatchMan;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kriyari.selenium.data.PublicationsSelectionPage;


	public class PublicationsSelectionPageTest {
		private static String LOG_PREFIX;
		private static final String MODULE_NAME = "PublicationsSelectionTest";
		private static SeleniumLogger logger ;
		private static WebDriver selenium;
		private static SeleniumManager seleniumManager;
		//private static PublicationCreationPage publication;
		private static DataBaseConnection conn;
		//private PropertiesClass propClass;
		private List arrayList;
		//private static AdminLoginPage adminLoginPage;
		private static PublicationsSelectionPage publicationsSelectionPage;
		/*@Rule
		public ErrorCollectorKiran errorCollector=new ErrorCollectorKiran();
		@Rule
		public MethodRule watchman= new TestWatchman() {

			@Override
			public void failed(Throwable e, FrameworkMethod method) {

				TheTestWatchMan.failed(e, method);
	//			System.out.println("The Error is "+e.toString());
//
//				if(e.toString().equals("org.junit.internal.runners.model.MultipleFailureException")){
//					String errorMessage="Method: "+method.getName()+" has thrown following error :";
//					logger.fatal(errorMessage +e );
//					logger.debug("Following are the errors :");
//					arrayList=errorCollector.listAllErrors();
//					logger.debug(arrayList.toString());		
//				}
//				else{
//					String errorMessage="Method: "+method.getName()+" has thrown following error :";
//					logger.fatal(errorMessage +e );				
//					//String screenShotFile="D:/app/phoenix/Selenium/error"+method.getName()+".png";
//					String screenShotFile=TheSeleniumManager.getScreenShotFolder()+method.getName()+".png";
//					logger.debug("Hence adding the screen shot at "+screenShotFile + "Please check it");
//					selenium.captureEntirePageScreenshot(screenShotFile,"");
//					if(e.toString().startsWith("com.thoughtworks.selenium.SeleniumException")){
//						//System.out.println("Caught selenium exception hence skiping the rest of the tests by stopping the selenium server");
//						System.out.println("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server");
//						logger.fatal("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server" );
//						logger.debug("Exception was caught hence deleteing the till now inserted data from database");
//						conn=TheSeleniumManager.getDataBaseConnection();
//						conn.truncateAll();
//						seleniumManager.stop();
//						System.exit(1);
//
//					}
//				}			
			}	
		};
		
		*/
		@BeforeClass
		public static void initiateSeleniumServer() throws IOException{
			logger=TheSeleniumManager.getSeleniumLogger();
			LOG_PREFIX = MODULE_NAME + " ; main ; ";
			
			logger.debug(LOG_PREFIX + "Getting the previously created Selenium Server Session");
			//seleniumManager=new SeleniumManager();
			seleniumManager=TheSeleniumManager.getSeleniumManager();			
			selenium=seleniumManager.getSelenium();		
			publicationsSelectionPage=new PublicationsSelectionPage(selenium);
			publicationsSelectionPage.loadPropertiesFile();
			conn=TheSeleniumManager.getDataBaseConnection();
			
			
			
			
		}
		
		@AfterClass
		public static void stoppingSeleniumServer(){
			//logger.debug(LOG_PREFIX + "Stoping Selenium Server");
			//seleniumManager.stop();
		}
		

			
			
		
		
		//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})
		@Test
		public void openPublicationsSelectedPage() {
			logger.debug(LOG_PREFIX + "Starting openPublicationsSelectedPage test");
			publicationsSelectionPage.openPublicationsTab();
			publicationsSelectionPage.openPublicationsSelectedPage();
			logger.debug(LOG_PREFIX + "Stoping openPublicationsSelectedPage test");	
		}
		//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})
		@Test
		public void verifyPublicationInSelectedPage() {
			logger.debug(LOG_PREFIX + "Starting verifyPublicationInSelectedPage test");
			
			conn.setPublicationDetails();	
			publicationsSelectionPage.clickOnAlphabeticTab(conn.getChannelName());	
			publicationsSelectionPage.verifyWhetherPublicationIsDisplayedOnSelectedPage(conn.getChannelName());
			logger.debug(LOG_PREFIX + "Stoping verifyPublicationInSelectedPage test");		
		}
		

		

	}



