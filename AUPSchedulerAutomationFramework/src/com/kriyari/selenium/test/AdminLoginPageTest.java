


package com.kriyari.selenium.test;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.BASE_URL_OF_ADMIN;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
*/
import com.kriyari.selenium.categories.CompletePublicationCreationPage;
import com.kriyari.selenium.categories.SeleniumPublicationCreationPage;
import com.kriyari.selenium.data.AdminLoginPage;
import com.kriyari.selenium.helper.DataBaseConnection;
//import com.kriyari.selenium.helper.ErrorCollectorKiran;
import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.SeleniumManager;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.kriyari.selenium.helper.TheTestWatchMan;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;


public class AdminLoginPageTest {
	private static String LOG_PREFIX;
	private static final String MODULE_NAME = "AdminLoginPageTest";
	private static SeleniumLogger logger ;
	private static WebDriver selenium;
	private static SeleniumManager seleniumManager;
//	private static PublicationCreationPage publication;
	private static DataBaseConnection conn;
	//private PropertiesClass propClass;
	private List arrayList;
	private static AdminLoginPage adminLoginPage;
	/*@Rule
	public ErrorCollectorKiran errorCollector=new ErrorCollectorKiran();
	@Rule
	public MethodRule watchman= new TestWatchman() {

		@Override
		public void failed(Throwable e, FrameworkMethod method) {
			TheTestWatchMan.failed(e, method);
//			System.out.println("The Error is "+e.toString());
//			
//			if(e.toString().equals("org.junit.internal.runners.model.MultipleFailureException")){
//				String errorMessage="Method: "+method.getName()+" has thrown following error :";
//				logger.fatal(errorMessage +e );
//				logger.debug("Following are the errors :");
//				arrayList=errorCollector.listAllErrors();
//				logger.debug(arrayList.toString());		
//			}
//			else{
//				String errorMessage="Method: "+method.getName()+" has thrown following error :";
//				logger.fatal(errorMessage +e );				
//				//String screenShotFile="D:/app/phoenix/Selenium/error"+method.getName()+".png";
//				String screenShotFile=TheSeleniumManager.getScreenShotFolder()+method.getName()+".png";
//				logger.debug("Hence adding the screen shot at "+screenShotFile + "Please check it");
//				selenium.captureEntirePageScreenshot(screenShotFile,"");
//				if(e.toString().startsWith("com.thoughtworks.selenium.SeleniumException")){
//					//System.out.println("Caught selenium exception hence skiping the rest of the tests by stopping the selenium server");
//					System.out.println("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server");
//					logger.fatal("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server" );
//					logger.debug("Exception was caught hence deleteing the till now inserted data from database");
//					conn=TheSeleniumManager.getDataBaseConnection();
//					conn.truncateAll();
//					seleniumManager.stop();
//					System.exit(1);
//					
//				}
//			}			
		}	
	};


	*/
	@BeforeClass
	public static void initiateSeleniumServer() throws IOException{
		logger=TheSeleniumManager.getSeleniumLogger();
		LOG_PREFIX = MODULE_NAME + " ; main ; ";
		System.out.println("Inside before class os adminLoginPageTest");
		logger.debug(LOG_PREFIX + "Starting Selenium Server");
		//seleniumManager=new SeleniumManager();
		seleniumManager=TheSeleniumManager.getSeleniumManager();
		seleniumManager.start(BASE_URL_OF_ADMIN);
		selenium=seleniumManager.getSelenium();		
		adminLoginPage=new AdminLoginPage(selenium);
		adminLoginPage.loadPropertiesFile();
		
	}
//	
//	@AfterClass
//	public static void stopSeleniumServer()throws IOException{
//		logger.debug(LOG_PREFIX + "Stoping Selenium Server");
//		seleniumManager.stop();
//	}
	
	
//	@Before
//	public void before(){
//		adminLoginPage=new AdminLoginPage();
//	}
	
	//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})
	@Test
	public void loginToMainAdmin(){
		logger.debug(LOG_PREFIX + "Starting  loginToMainAdmin test");
		adminLoginPage.openLoginPage();
		adminLoginPage.typeAdminLoginName();
		adminLoginPage.typeAdminPassword();
		adminLoginPage.clickLoginButton();

		logger.debug(LOG_PREFIX + "Stoping loginToMainAdmin test");
	}
	
	//@Ignore
	//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})	
	@Test	
	public void loginToEnterpriseAdmin(){
		logger.debug(LOG_PREFIX + "Starting loginToEnterpriseAdmin test");
		//selenium.click("link=Enterprise Admin");
		//selenium.waitForPageToLoad("30000");
		adminLoginPage.clickEnterpriseLink();
		logger.debug(LOG_PREFIX + "Stoping loginToEnterpriseAdmin test");
	
	}
	
	//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})	
	@Test	
	public void loginToNewzstandAdmin(){
		logger.debug(LOG_PREFIX + "Starting loginToNewzstandAdmin test");
		//selenium.click("link=Newzstand Admin");
		//selenium.waitForPageToLoad("30000");
		logger.debug(LOG_PREFIX + "Stoping loginToNewzstandAdmin test");
	
	}

	//@Ignore
	@Test	
	public void loginToWidgetAdmin(){
		logger.debug(LOG_PREFIX + "Starting loginToWidgetAdmin test");
		//selenium.click("link=Wizard Admin");
		//selenium.waitForPageToLoad("30000");
		logger.debug(LOG_PREFIX + "Stoping loginToWidgetAdmin test");
	
	}
	

	

}
