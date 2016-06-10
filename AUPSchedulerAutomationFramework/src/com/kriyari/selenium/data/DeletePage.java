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

public class DeletePage {
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public DeletePage(WebDriver selenium) {	
		this.selenium=selenium;	
	}
	
	public void loadPropertiesFile(){	
		File file =new File(ADMIN_LOGIN_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);
				
	}
	
	public void clickCategoryDeleteLink(String categoryId) throws InterruptedException{
		String category_link=LINK_CATEGORY_DELETE+categoryId;
	//	selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementsByTagName(\"a\")", "30000");
		//selenium.wait(30L);
		//Thread.sleep(300L);
		//selenium.click(category_link);
	}
	public void getCategoryDeleteConfirmationMessages(String categoryName){
		
		
		String confirmation_for_category_delete=String.format(CONFIRMATION_FOR_CATEGORY_DELETE,categoryName);
		//assertEquals(confirmation_for_category_delete, selenium.getConfirmation());
		//assertEquals(confirmation_for_category_delete, selenium.getConfirmation());
	}
	
	public void clickSubCategoryDeleteLink(String subCategoryId) throws InterruptedException{
		String sub_category_link=LINK_SUB_CATEGORY_DELETE+subCategoryId;
	//	selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementsByTagName(\"a\")", "30000");
		//selenium.wait(30L);
		//Thread.sleep(300L);
		//selenium.click(sub_category_link);
	}
	public void getSubCategoryDeleteConfirmationMessages(String subCategoryName){
		
		String confirmation_for_sub_category_delete=String.format(CONFIRMATION_FOR_SUB_CATEGORY_DELETE,subCategoryName);
		//assertEquals(confirmation_for_sub_category_delete, selenium.getConfirmation());
		//assertEquals(confirmation_for_sub_category_delete, selenium.getConfirmation());
	}
	public void selectPublicationToDelete(String channelId){
		//selenium.click(channelId);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	
	public void clickDeleteButton() {
		// TODO Auto-generated method stub
		//selenium.click(BUTTON_CLICK_PUBLICATION_DELETE);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	public void verifyConfirmatoryMessage(String message){
		//System.out.println(selenium.getText("//span[@id='errContainer']"));
		//assertTrue("Confirmatory Message not captured.Verify the error snapshots",selenium.isTextPresent(message));
	}
	public void openChannelsPage(){
		//selenium.click(LINK_CHANNEL_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	public void openPublicationsPage(){
		//selenium.click(LINK_PUBLICATIONS_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
	}
	
}
