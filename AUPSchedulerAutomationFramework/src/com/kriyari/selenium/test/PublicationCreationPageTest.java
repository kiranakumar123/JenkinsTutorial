package com.kriyari.selenium.test;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.CONFIRMATORY_MESSAGE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
*/
import com.kriyari.selenium.categories.CompletePublicationCreationPage;
import com.kriyari.selenium.categories.DataBaseVerification;
import com.kriyari.selenium.categories.SeleniumPublicationCreationPage;
import com.kriyari.selenium.data.PublicationCreationPage;
import com.kriyari.selenium.helper.DataBaseConnection;
//import com.kriyari.selenium.helper.ErrorCollectorKiran;
import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.SeleniumManager;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.kriyari.selenium.helper.TheTestWatchMan;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PublicationCreationPageTest {
	private static String LOG_PREFIX;
	private static final String MODULE_NAME = "PublicationCreationPageTest";
	private static  SeleniumLogger logger;
	private static WebDriver selenium;
	private static SeleniumManager seleniumManager;
	private static PublicationCreationPage publication;
	private static DataBaseConnection conn;
	private PropertiesClass propClass;	
	private List arrayList;
	
	/*Rule ErrorCollector used for collecting all the errors in Database Validation test
	 * and displaying them at once at the end of the test.
	 */
	//@Rule
	//public ErrorCollectorKiran errorCollector=new ErrorCollectorKiran();
	
	/*Rule TestWatchman used to capture screen shots when the error is thrown from test
	 * as well as to list all the errors captured in the DataBase Validation test
	 */
	/*@Rule
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
	

//		@Override
//		public void succeeded(FrameworkMethod method) {
//	
//		}
//		@Override
//		public void starting(FrameworkMethod method){
//	
//		}
//		@Override
//		public void finished(FrameworkMethod method) {
//		
//		}
//	};
*/
	@BeforeClass
	public static void initiateSeleniumServer() throws IOException{
		logger=TheSeleniumManager.getSeleniumLogger();
		LOG_PREFIX = MODULE_NAME + " ; main ; ";		
		logger.debug(LOG_PREFIX + "Starting Selenium Server");		
		seleniumManager=TheSeleniumManager.getSeleniumManager();
		selenium=seleniumManager.getSelenium();		
		publication=new PublicationCreationPage(selenium);
		publication.loadPropertiesFile();
		conn=TheSeleniumManager.getDataBaseConnection();
			
	}
	
	@AfterClass
	public static void stopSeleniumServer()throws IOException{
//		logger.debug(LOG_PREFIX + "Stoping Selenium Server");
//		seleniumManager.stop();
	}
	
	//@Ignore
	public void openEnterpriseAdmin(){
		/*selenium.open("/admin/login");
		selenium.type("adminLogin","admin");
		selenium.type("adminPwd","admin");		  
		selenium.click("//input[@value='Login']");
		selenium.waitForPageToLoad("300000");
		*/
	}
	//@Ignore
	//@Category({SeleniumPublicationCreationPage.class,CompletePublicationCreationPage.class})	
	@Test	
	public void testPublicationCreationPage(){
		logger.debug(LOG_PREFIX + "Starting testPublicationCreationPage test");		
		System.out.println("All links are "+publication.getAllLinks());
		publication.clickPublicatioTab();
		publication.openPublicationCreatePage();
		publication.typePublisherName();
		publication.typePublishersURL();
		publication.typePublishersSubscriptionURL();
		publication.typePublicationName();
		publication.typeChannelDescription();
		publication.selectAuthorityLevel();
		publication.selectNavigationScheme();
		publication.selectPublicationType();
		publication.selectApprovalRequired();
		publication.selectDisplayTags();
		publication.selectPublicationNameIndex();
		publication.typeFeedURL();
		publication.selectFeedFrequency();
		publication.selectIndexDownloadedContent();
		publication.typeDomainsToIgnore();
		conn.setCategoryDetails();
		publication.selectChannel(conn.getCategoryName());
		conn.setSubCategoryDetails();
		publication.selectTopic(conn.getSubCategoryName());
		publication.clickSubmitButton();
		publication.verifyConfirmatoryMessage(CONFIRMATORY_MESSAGE);
		logger.debug(LOG_PREFIX + "Stoping testPublicationCreationPage test");
		
		
	}
	
	
	
	//@Ignore
	//@Category({DataBaseVerification.class,CompletePublicationCreationPage.class})
	@Test
	public void dataValidationFromDB(){
		logger.debug(LOG_PREFIX + "Starting dataValidationFromDB test");
		File file=new File(ENTERPRISE_PUBLICATION_PROPERTIES_FILE);
		
		//conn=new DataBaseConnection();
		conn.setPublicationDetails();
		conn.setPublisherDetails();		
		propClass=TheSeleniumManager.getProperties(file);
		propClass.loadProperties(file);
		//errorCollector.checkThat("Publication Name Index assertion failed", propClass.getPublicationNameIndex(),is(equalTo(conn.getIsNameIndexable())));
		//errorCollector.checkThat("Approval Required assertion failed", propClass.getApprovalRequired(),is(equalTo(conn.getApprovalRequired())));
		
		
	}
	

}
