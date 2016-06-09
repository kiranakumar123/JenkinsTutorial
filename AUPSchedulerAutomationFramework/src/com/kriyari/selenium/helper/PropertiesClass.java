package com.kriyari.selenium.helper;

import java.io.*;
import java.util.Properties;

import static com.kriyari.selenium.helper.PublicationCreationPropertiesConstants.*;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;

public class PropertiesClass {
		FileInputStream inputStream;
		Properties prop;
//		int publicationNameIndexFalse=0;
//		int publicationNameIndexTrue=1;
		//String comboid="value=";
		
	public void loadProperties(File file) {
		try{
		inputStream=new FileInputStream(file);
		prop=new Properties();
		prop.load(inputStream);
		}catch(IOException ex){
			System.out.println("Properties file could not be loaded");
			ex.printStackTrace();
		}
	}
	
	public String getAdminLoginName(){
		return prop.getProperty(ADMIN_LOGIN_NAME);
	}
	public String getAdminPassword(){
		return prop.getProperty(ADMIN_PASSWORD);
	}
	public String getPublisherName(){
		return prop.getProperty(PUBLISHER_NAME);		
	}

	public String getPublisherHomePage(){
		return prop.getProperty(PUBLISHER_HOME_PAGE);		
	}
	
	public String getPublisherSubscriptionURL(){
		return prop.getProperty(PUBLISHER_SUBSCRIPTION_URL);		
	}
	
	public String getPublicationName(){
		return prop.getProperty(PUBLICATION_NAME);		
	}
	
	public String getDescription(){
		return prop.getProperty(DESCRIPTION);		
	}
	
	public String getFeedUrl(){
		return prop.getProperty(FEED_URL);		
	}
	
	public String getDomainsToIgnore(){
		return prop.getProperty(DOMAINS_TO_IGNORE);		
	}
	
	public String getAuthorityLevel(){
		return  prop.getProperty(AUTHORITY_LEVEL);		
	}
	
	public String getNavigationScheme(){
		return  prop.getProperty(NAVIGATION_SCHEME);		
	}
	
	public String getApprovalRequired(){
		return  prop.getProperty(APPROVAL_REQUIRED);		
	}
	
	public String getPublicationNameIndex(){
		System.out.println(prop.getProperty(PUBLICATION_NAME_INDEX));
		//return prop.getProperty(PUBLICATION_NAME_INDEX);
		 if( prop.getProperty(PUBLICATION_NAME_INDEX).equals("false")){
			// return "0" ;
			 return "false";
			 
		 }
		 else{
			// return "1";
			 return "true";
		 }
	}
	
	public String getPublicationType(){
		return  prop.getProperty(PUBLICATION_TYPE);		
	}
	
	public String getDisplayTags(){
		return  prop.getProperty(DISPLAY_TAGS);		
	}
	
	public String getFeedFrequency(){
		return  prop.getProperty(FEED_FREQUENCY);		
	}
	
	public String getIndexDownloadedContent(){
		return  prop.getProperty(INDEX_DOWNLOADED_CONTENT);		
	}
	
	public String getCategoryName(String catName){
		
		//return Helper.catNameFormat(prop.getProperty(CATEGORY_NAME));
		//String categoryName=prop.getProperty(CATEGORY_NAME);
		//return categoryName+"-- Newzstand";
		return catName+"-- Enterprise";
	}
	public String getNewCategoryName(){
		System.out.println("Category from getNewCategoryName is "+ prop.getProperty(CATEGORY_NAME));
		return prop.getProperty(CATEGORY_NAME);
		
	}
	
	public String getSubCategoryName(){
		return prop.getProperty(SUB_CATEGORY_NAME);		
	}
	
	public String getTestName(){
		return prop.getProperty(TEST_HOME_PAGE);		
	}

	public static void main(String args[]){
		File file=new File(TEST_PROPERTIES_FILE);
		PropertiesClass propClass=new PropertiesClass();
		propClass.loadProperties(file);
		System.out.println("getTestName:"+propClass.getTestName());
	}
}


