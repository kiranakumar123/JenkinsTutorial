package com.kriyari.selenium.helper;
/*import java.util.List;

import org.junit.Rule;
import org.junit.rules.*;
import org.junit.runners.model.FrameworkMethod;
import com.kriyari.selenium.categories.CompletePublicationCreationPage;
import com.kriyari.selenium.categories.DataBaseVerification;
import com.kriyari.selenium.categories.SeleniumPublicationCreationPage;
import com.kriyari.selenium.data.NewzstandChannelCreationPage;
import com.kriyari.selenium.data.PublicationCreationPage;
import com.kriyari.selenium.helper.DataBaseConnection;
import com.kriyari.selenium.helper.ErrorCollectorKiran;
import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.SeleniumLogger;
import com.kriyari.selenium.helper.SeleniumManager;
import com.kriyari.selenium.helper.TheSeleniumManager;
import com.thoughtworks.selenium.Selenium;


public class TheTestWatchMan {
	private static String LOG_PREFIX;
	private static final String MODULE_NAME = "ChannelCreationPageTest";
	private static SeleniumLogger logger ;
	private static Selenium selenium;
	private static SeleniumManager seleniumManager;
//	private static PublicationCreationPage publication;
	private static DataBaseConnection conn;
	//private PropertiesClass propClass;
	private static List arrayList;
	private static NewzstandChannelCreationPage newzstandChannelCreationPage;
	@Rule
	public static ErrorCollectorKiran errorCollector=new ErrorCollectorKiran();

	public static void failed(Throwable e,FrameworkMethod method){
		System.out.println("The Error is "+e.toString());

		if(e.toString().startsWith("com.thoughtworks.selenium.SeleniumException")){
			System.out.println("Caught selenium exception hence skiping the rest of the tests by stopping the selenium server");
			System.out.println("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server");
			logger.fatal("Caught "+ e.toString() +" exception ,hence skiping the rest of the tests by stopping the selenium server" );
			logger.debug("Exception was caught hence deleteing the till now inserted data from database");
			conn=TheSeleniumManager.getDataBaseConnection();
			conn.truncateAll();
			seleniumManager.stop();
			System.exit(1);

		}
		if(e.toString().equals("org.junit.internal.runners.model.MultipleFailureException")){
			String errorMessage="Method: "+method.getName()+" has thrown following error :";
			logger.fatal(errorMessage +e );
			logger.debug("Following are the errors :");
			arrayList=errorCollector.listAllErrors();
			logger.debug(arrayList.toString());		
		}
		else{
			String errorMessage="Method: "+method.getName()+" has thrown following error :";
			logger.fatal(errorMessage +e );				
			//String screenShotFile="D:/app/phoenix/Selenium/error"+method.getName()+".png";
			String screenShotFile=TheSeleniumManager.getScreenShotFolder()+method.getName()+".png";
			logger.debug("Hence adding the screen shot at "+screenShotFile + "Please check it");
			selenium.captureEntirePageScreenshot(screenShotFile,"");
			
		}			
	}	
	}
*/
