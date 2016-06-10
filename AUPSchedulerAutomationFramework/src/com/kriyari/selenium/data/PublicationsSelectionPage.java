
package com.kriyari.selenium.data;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.BUTTON_CLICK_PUBLICATION_DELETE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.CONFIRMATION_FOR_CATEGORY_DELETE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.CONFIRMATION_FOR_SUB_CATEGORY_DELETE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_CATEGORY_DELETE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_CHANNEL_TAB;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_SUB_CATEGORY_DELETE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.WAIT_FOR_PAGE_TO_LOAD;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.Properties;

import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;

public class PublicationsSelectionPage {
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public PublicationsSelectionPage(WebDriver selenium) {	
		this.selenium=selenium;	
	}
	
	public void loadPropertiesFile(){		
		File file =new File(ENTERPRISE_PUBLICATION_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);	
	}
		
	public void openPublicationsTab(){
		//selenium.click(LINK_PUBLICATIONS_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	public void openPublicationsSelectedPage(){
		//selenium.click(LINK_PUBLICATIONS_SELECTED_PAGE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	
	public void clickOnAlphabeticTab(String channelName){
		if(channelName.length()==0){
			System.out.println("Publication Name not proper");
			return;
		}
		String firstLetterOfChannelName=channelName.substring(0, 1).toUpperCase();
		//selenium.click(String.format(LINK_PUBLICATION_ALPHABETIC_TAB,firstLetterOfChannelName));		
		//assertTrue("The newly selected publication"+channelName+ " not displayed on the Selected Page",selenium.isTextPresent(channelName));
		
	}
	
	public void verifyWhetherPublicationIsDisplayedOnSelectedPage(String channelName){
		
		String funcChannelName="\""+channelName+"\"";	
		//String publicationSelected=selenium.getEval("function getPublication(){var allLinks =selenium.browserbot.getCurrentWindow().document.getElementsByTagName(\"div\"); for (var i=0; i<allLinks.length; i++) {var innerHtml=allLinks[i].innerHTML;if(innerHtml=="+funcChannelName+"){return innerHtml;}}}	getPublication();");		
		//assertEquals("The newly selected publication"+channelName+ " not displayed on the Selected Page",channelName,publicationSelected);
	}
	
}
