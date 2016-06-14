


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

public class GroupSelectorPage {
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public GroupSelectorPage(WebDriver selenium) {	
		this.selenium=selenium;	
	}
	
	public void loadPropertiesFile(){		
		File file =new File(GROUP_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);		
	}
		
	public void openChannelsTab(){
		//selenium.click(LINK_CHANNEL_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	public void openGroupSelectorPage(){
		//selenium.click(LINK_GROUP_SELECTOR_PAGE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	
	public void selectAllGroups(){
		//selenium.select(COMBO_GROUP_SELECTOR, COMBO_LOCATOR_ALL_GROUPS);
		//selenium.waitForPageToLoad("30000");
	}
	public void verifyPublicationOnGroupSelectorDialogBox(String entCatTypeAndCatId,String channelName){
		
		//selenium.click(String.format(IMAGE_BUTTON_GROUP_SELECTOR_STORE_LIST, entCatTypeAndCatId));
		//assertTrue(selenium.isTextPresent(channelName));
		//selenium.click(IMAGE_BUTTON_CLOSE_GROUP_SELECTOR_STORE_LIST);
	}
	public void clickCategoryOnGroupSelector(String entCatTypeAndCatId){
		if(entCatTypeAndCatId.length()==0){
			System.out.println("entCatTypeAndCatId not in proper format");
			return;
		}
		//selenium.click(entCatTypeAndCatId);
		
		//selenium.click(BUTTON_CLICK_GROUP_SELECTOR_UPDATE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
		
	}
	
}
