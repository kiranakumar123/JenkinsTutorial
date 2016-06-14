
package com.kriyari.selenium.data;

import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.ADMIN_LOGIN_PROPERTIES_FILE;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_CHANNEL_TAB;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_NEW_CHANNEL_PROMPT;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.LINK_NEW_TOPIC_PROMPT;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.WAIT_FOR_PAGE_TO_LOAD;
import static com.kriyari.selenium.helper.PublicationCreationSeleniumConstants.*;

import java.io.File;
import java.util.Properties;

import com.kriyari.selenium.helper.PropertiesClass;
import com.kriyari.selenium.helper.TheSeleniumManager;
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;

public class NewzstandChannelCreationPage {
	
	public WebDriver selenium;
	public Properties prop;
	public File file;
	public PropertiesClass propClass;
	public String comboid="value=";
	
	
	
	public NewzstandChannelCreationPage(WebDriver selenium) {
	
		this.selenium=selenium;
	
	}
	public void loadPropertiesFile(){
//		System.out.println("Properties file is" +PROPERTIES_FILE);
//		file=new File(PROPERTIES_FILE);
//		propClass=new PropertiesClass();
//		propClass.loadProperties(file);		
		File file =new File(NEWZSTAND_CAT_SUBCAT_PROPERTIES_FILE);
		propClass=TheSeleniumManager.getProperties(file);
	}
	public void openChannelsPage(){
		//selenium.click(LINK_CHANNEL_TAB);
		//selenium.waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD);
		
	}
	public void openNewChannelPrompt(){
		//selenium.click(LINK_NEW_CHANNEL_PROMPT);
	}
	public String readNewChannelPromptMsg(){
		//return selenium.getPrompt();
		return selenium.switchTo().alert().getText();
	}
	public void typeChannelName(){
		//selenium.answerOnNextPrompt(propClass.getNewCategoryName());
	}
	public void openNewTopicPrompt() throws InterruptedException{
		//selenium.waitForCondition("selenium.browserbot.window.getElementById()", timeout)
		//selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementsByTagName(\"a\")", "30000");
		//selenium.wait(30L);
		//Thread.sleep(30000L);
		//selenium.click(LINK_NEW_TOPIC_PROMPT);
	}
	public String readNewTopicPromptMsg(){
		//return selenium.getPrompt();
		return selenium.switchTo().alert().getText();
	}
	public void typeTopicName() {
		//selenium.answerOnNextPrompt(propClass.getSubCategoryName());
		
	}
		

}
