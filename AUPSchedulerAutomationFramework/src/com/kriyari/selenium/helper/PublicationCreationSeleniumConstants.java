package com.kriyari.selenium.helper;

import java.io.File;

public class PublicationCreationSeleniumConstants {
	
	public static final String BASE_URL_OF_ADMIN="http://localhost";
	public static final String PROPERTIES_DIRECTORY=System.getenv("SELENIUM_HOME")+File.separator+"properties"+File.separator;
	
	public static final String TEST_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"test.properties";
	
	public static final String NEWZSTAND_PUBLICATION_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"newzstand_publication.properties";
	public static final String ENTERPRISE_PUBLICATION_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"enterprise_publication.properties";
	public static final String ADMIN_LOGIN_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"adminLogin.properties";
	public static final String ENTERPRISE_CAT_SUBCAT_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"enterprise_cat_subcat.properties";
	public static final String NEWZSTAND_CAT_SUBCAT_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"newzstand_cat_subcat.properties";
	public static final String GROUP_PROPERTIES_FILE=PROPERTIES_DIRECTORY+"group.properties";
	
	public static final String WAIT_FOR_PAGE_TO_LOAD="30000";
	public static final String ADMIN_URL="/admin/login" ;
	
	
	
	public static final String TEXT_ADMIN_LOGIN_NAME="adminLogin";
	public static final String TEXT_ADMIN_PASSWORD="adminPwd";
	public static final String TEXT_PUBLISHER_NAME="publisherName";
	public static final String TEXT_PUBLISHER_HOME_PAGE="publisherUrl";
	public static final String TEXT_SUBSCRIPTION_URL="subscriptionUrl";
	public static final String TEXT_PUBLICATION_NAME="channelName";
	public static final String TEXT_DESCRIPTION="channelDescription";
	public static final String TEXT_FEED_URL="feedUrl";
	public static final String TEXT_DOMAINS_TO_IGNORE="unwantedPublicationArticleDomains";
	
	public static final String COMBO_AUTHORITY_LEVEL="authorityLevel";
	public static final String COMBO_NAVIGATION_SCHEME="navigationScheme";
	public static final String COMBO_APPROVAL_REQUIRED="approvalRequired";
	public static final String COMBO_IS_PUBLICATION_NAME_INDEX="isChannelNameIndexable";
	public static final String COMBO_PUBLICATION_TYPE="channelType";
	public static final String COMBO_AUTO_APPROVAL="approvalRequired";
	public static final String COMBO_DISPLAY_TAGS="tagsDisplayRequired";
	public static final String COMBO_FEED_FREQUENCY="feedFrequency";
	public static final String COMBO_INDEX_DOWNLOADED_CONTENT="indexDownloadedContent";
	public static final String COMBO_CAT_ID="catId";
	public static final String COMBO_SUB_CAT_ID="subCatId";
	public static final String COMBO_GROUP_SELECTOR="deptList";
	public static final String COMBO_LOCATOR_ALL_GROUPS="label=All Groups";
	
	public static final String BUTTON_CLICK_LOGIN="//input[@value='Login']";
	public static final String BUTTON_CLICK_CREATE="//input[@value='Create']";
	public static final String BUTTON_CLICK_PUBLICATION_DELETE="//input[@value='Delete']";
	public static final String BUTTON_CLICK_GROUP_SELECTOR_UPDATE="//input[@value='Update']";
	
	public static final String IMAGE_BUTTON_GROUP_SELECTOR_STORE_LIST="storeList_%s";
	public static final String IMAGE_BUTTON_CLOSE_GROUP_SELECTOR_STORE_LIST="//div[@id='dialog']/a/img";
	
	public static final String LINK_NEW_PUBLICATION="link=Create New Publication";
	public static final String LINK_ENTERPRISE="link=Enterprise Admin";
	public static final String LINK_CHANNEL_TAB="link=Channels";
	public static final String LINK_PUBLICATIONS_TAB="link=Publications";
	public static final String LINK_PUBLICATIONS_SELECTED_PAGE="link=Selected";
	public static final String LINK_GROUP_SELECTOR_PAGE="link=Group Selector";
	public static final String LINK_NEW_CHANNEL_PROMPT="link=New Channel";
	public static final String LINK_NEW_TOPIC_PROMPT="link=New Topic";
	public static final String LINK_PUBLICATION_TAB="link=Publications";
	public static final String LINK_CATEGORY_DELETE="delCat";
	public static final String LINK_SUB_CATEGORY_DELETE="delSubCat";
	public static final String LINK_PUBLICATION_ALPHABETIC_TAB="//table[@id='publicationsList']//li[contains(.,'%s')]";
	
	public static final String SELECT_WINDOW_ENTERPRISE="title=Enterprise Admin: Enterprise Publications";
	
	public static final String CONFIRMATORY_MESSAGE="Publication created successfully";
	public static final String CONFIRMATORY_MESSAGE_FOR_PUBLICATION_DELETE="Publication deleted successfully";
	public static final String CONFIRMATION_FOR_CATEGORY_DELETE="Are you sure you want to delete Channel: %s\nWarning: All the publications in this Channel will get moved to Channel:\"Unassigned\" and Topic:\"Unassigned\" ";
	public static final String CONFIRMATION_FOR_SUB_CATEGORY_DELETE="Are you sure you want to delete Topic: %s\nWarning: All the publications in this Topic will get moved to Channel:\"Unassigned\" and Topic:\"Unassigned\" ";
	
	
	
}
