package com.kriyari.selenium.helper;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * TheSeleniumManager class created as a Singleton to share the WebDriver session
 * across TestClasses,TestSuites and Tests
 */

public class TheSeleniumManager {
	

	private volatile static  SeleniumLogger logger=null; 
	private volatile static DataBaseConnection conn=null;
	private volatile static PropertiesClass propClass=null;
	private volatile static SeleniumManager instance = null;
	private volatile static String defaultLogger="DefaultSeleniumLogger";
	
	
	private TheSeleniumManager() {
	}
	
	public static SeleniumManager getSeleniumManager() {
		if(instance == null) {
			synchronized(SeleniumManager.class){
				if(instance == null) {
					System.out.println("!!!! CREATE SELENIUM MANAGER");
					instance = new SeleniumManager();			
				}
		    }
		}    
		return instance;
	}
	
	public static SeleniumLogger getSeleniumLogger() {
	/*	if(logger == null) {
			synchronized(SeleniumManager.class){
				if(logger == null) {
					System.out.println("!!!! INSTANTIATE SELENIUM LOGGER");
					logger = new SeleniumLogger("publication_creation");			
				}
		    }
		}*/    
		return getSeleniumLogger(defaultLogger);
	}
	
	
	public static DataBaseConnection getDataBaseConnection() {
		if(conn == null) {
			synchronized(SeleniumManager.class){
				if(conn == null) {
					System.out.println("!!!! INSTANTIATE DATABASE CONNECTION");
					conn = new DataBaseConnection();
					//conn.setPublicationDetails();
					//conn.setPublisherDetails();	
				}
		    }
		}    
		return conn;
	}
	
	public static PropertiesClass getProperties(File file){
		
		//if(propClass == null) {
		//	synchronized(SeleniumManager.class){
			//	if(propClass == null) {
					System.out.println("!!!! INSTANTIATE PROPERTIES");
					propClass=new PropertiesClass();
					propClass.loadProperties(file);	
				//}
		   // }
		//}    
		return propClass;

	}
	public void beforeClass() throws IOException{

	}
	
	public static String getScreenShotFolder(){
		String screenShotFolder=System.getenv("SELENIUM_HOME")+File.separator +"screenshots"+File.separator;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		Calendar cal =Calendar.getInstance();
		screenShotFolder= screenShotFolder+simpleDateFormat.format(cal.getTime());
		new File(screenShotFolder).mkdirs();
		return screenShotFolder + File.separator;
		
	}
	
	public static SeleniumLogger getSeleniumLogger(String loggername){
		//return new SeleniumLogger("publication_creation");
		//return new SeleniumLogger(loggername);
		if(logger == null) {
			synchronized(SeleniumManager.class){
				if(logger == null) {
					System.out.println("!!!! INSTANTIATE SELENIUM LOGGER");
					logger = new SeleniumLogger(loggername);			
				}
		    }
		}    
		return logger;
	}
	
	
}
