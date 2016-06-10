package com.kriyari.selenium.data;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.BUTTON_CLICK_CREATE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_APPROVAL_REQUIRED;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_AUTHORITY_LEVEL;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_CAT_ID;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_DISPLAY_TAGS;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_FEED_FREQUENCY;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_INDEX_DOWNLOADED_CONTENT;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_IS_PUBLICATION_NAME_INDEX;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_NAVIGATION_SCHEME;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_PUBLICATION_TYPE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.COMBO_SUB_CAT_ID;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_NEW_PUBLICATION;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_PUBLICATION_TAB;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_DESCRIPTION;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_DOMAINS_TO_IGNORE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_FEED_URL;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_PUBLICATION_NAME;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_PUBLISHER_HOME_PAGE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_PUBLISHER_NAME;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.TEXT_SUBSCRIPTION_URL;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.WAIT_FOR_PAGE_TO_LOAD;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.Properties;

import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
public class PublicationCreationPage {
	
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public PublicationCreationPage(WebDriver selenium) {
	
		this.selenium=selenium;
	
	}
	public void loadPropertiesFile(){

		File file =new File(ENTERPRISE_PUBLICATION_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);
		
	}	
	
	public void clickPublicatioTab() {
		//selenium.click("id=123");
		//selenium.click(LINK_PUBLICATION_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);		
	}
	public void openPublicationCreatePage(){
		
		//selenium.click(LINK_NEW_PUBLICATION);	
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);		
	}
	
	public void typePublisherName(){
		//selenium.type(TEXT_PUBLISHER_NAME,propClass.getPublisherName());
	}
	
	public void typePublishersURL(){
		//selenium.type(TEXT_PUBLISHER_HOME_PAGE,propClass.getPublisherHomePage());
	}	
	
	public void typePublishersSubscriptionURL(){
		//selenium.type(TEXT_SUBSCRIPTION_URL,propClass.getPublisherSubscriptionURL());
	}
	
	public void typePublicationName(){
		//selenium.type(TEXT_PUBLICATION_NAME, propClass.getPublicationName());
	}
	
	public void typeChannelDescription(){
		//selenium.type(TEXT_DESCRIPTION, propClass.getDescription());
	}
	
	public void selectAuthorityLevel(){
		//selenium.select(COMBO_AUTHORITY_LEVEL,comboid+propClass.getAuthorityLevel());		
	}
	
	public void selectNavigationScheme(){
		//selenium.select(COMBO_NAVIGATION_SCHEME, comboid+propClass.getNavigationScheme());
	}
	
	public void selectPublicationType(){
		//selenium.select(COMBO_PUBLICATION_TYPE, comboid+propClass.getPublicationType());
	}
	
	public void selectApprovalRequired(){
		//selenium.select(COMBO_APPROVAL_REQUIRED, comboid+propClass.getApprovalRequired());
	}
	
	public void selectDisplayTags(){
		//selenium.select(COMBO_DISPLAY_TAGS, comboid+propClass.getDisplayTags());
	}
	
	public void selectPublicationNameIndex(){
		//selenium.select(COMBO_IS_PUBLICATION_NAME_INDEX, comboid+propClass.getPublicationNameIndex());
	}
	public void typeFeedURL(){
		//selenium.type(TEXT_FEED_URL,propClass.getFeedUrl());
	}
	
	public void selectFeedFrequency(){
		//selenium.select(COMBO_FEED_FREQUENCY, comboid+propClass.getFeedFrequency());
	}
	
	public void selectIndexDownloadedContent(){
		//selenium.select(COMBO_INDEX_DOWNLOADED_CONTENT, comboid+propClass.getIndexDownloadedContent());
	}
	
	public void typeDomainsToIgnore(){
		//selenium.type(TEXT_DOMAINS_TO_IGNORE, propClass.getDomainsToIgnore());		
	}
	
	public void selectChannel(String catName){
		//selenium.select(COMBO_CAT_ID, propClass.getCategoryName(catName));
	}
	
	public void selectTopic(String subCatName){
		//selenium.select(COMBO_SUB_CAT_ID, propClass.getSubCategoryName());
		//selenium.select(COMBO_SUB_CAT_ID, subCatName);
	}
	
	public void clickSubmitButton(){
		//selenium.click(BUTTON_CLICK_CREATE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	
	public String[] getAllLinks(){
		//return selenium.getAllLinks();
		return null;
	}
	public void verifyConfirmatoryMessage(String message){
		//System.out.println(selenium.getText("//span[@id='errContainer']"));
		//assertTrue("Confirmatory Message not captured.Verify the error snapshots",selenium.isTextPresent(message));
	}
	
	
	
	

	

}
