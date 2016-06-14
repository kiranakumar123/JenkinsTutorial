package com.kriyari.selenium.helper;

import static com.kriyari.selenium.helper.DataBaseConstants.CONNECT_DATABASE_BASE;
import static com.kriyari.selenium.helper.DataBaseConstants.DATABASE_CONN_URL;
import static com.kriyari.selenium.helper.DataBaseConstants.DATABASE_DRIVER;
import static com.kriyari.selenium.helper.DataBaseConstants.DATABASE_PASSWORD;
import static com.kriyari.selenium.helper.DataBaseConstants.DATABASE_USERNAME;
import static com.kriyari.selenium.helper.DataBaseConstants.SELECT_CATEGORY_TABLE;
import static com.kriyari.selenium.helper.DataBaseConstants.SELECT_CHANNEL_TABLE;
import static com.kriyari.selenium.helper.DataBaseConstants.SELECT_PUBLISHER_TABLE;
import static com.kriyari.selenium.helper.DataBaseConstants.SELECT_SUB_CATEGORY_TABLE;
import static com.kriyari.selenium.helper.DataBaseConstants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	
	 private Connection conn;
	 private Statement stmt;
	 private ResultSet result;
	 private String publisher_name;
	 private String channel_name;
	 private String publisher_url;
	 private String subscription_url;
	 private String channel_type;
	 private String channel_display_name;
	 private String publisher_id;
	 private String description;
	 private String navigation_scheme;
	 private String approval_required;
	 private String authority_level;
	 private String tags_display_required;
	 private String is_name_indexable;
	 private String channel_id;
	 private String category_id;
	 private String category_name;
	 private String sub_category_id;
	 private String sub_category_name;
	 private String category_enterprise_id;
	 private String category_type;
	 
	 private String employee_first_name;
	 private String employee_last_name;
	 private String employee_id;
	 private String employee_salary;

	
	public DataBaseConnection()
	{
		init();
	}
	
	
	public void init()
	{
		try
		{
			Class.forName(DATABASE_DRIVER);
			conn=DriverManager.getConnection(DATABASE_CONN_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
			stmt=conn.createStatement();
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Mysql driver not found");
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			System.out.println("Could not connect to database");
			ex.printStackTrace();
		}
	}
	
	public void  executeQuery(String query1,String query2)
	{
		
		try
		{		
			stmt.executeQuery(query1);
			stmt.executeQuery(query2);
			result=stmt.getResultSet();
		
		}
		catch(SQLException ex)
		{
			System.out.println("Sql exception occured");
			ex.printStackTrace();
		}
	
		
	}
	
	public void setNewzstandPublicationDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_NEWZSTAND_CHANNEL_TABLE);	
		try{
		while(result.next()){
			this.channel_name= result.getString("channel_name");
			this.channel_id=result.getString("channel_id");
			this.channel_type=result.getString("channel_type");
			this.channel_display_name=result.getString("channel_display_name");
			this.publisher_id=result.getString("publisher_id");
			this.description=result.getString("description");
			this.navigation_scheme=result.getString("navigation_scheme");
			this.approval_required=result.getString("approval_required");
			this.authority_level=result.getString("authority_level");
			this.tags_display_required=result.getString("tags_display_required");
			this.is_name_indexable=result.getString("is_name_indexable");
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setNewzstandPublicationDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void setPublicationDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_CHANNEL_TABLE);	
		try{
		while(result.next()){
			this.channel_name= result.getString("channel_name");
			this.channel_id=result.getString("channel_id");
			this.channel_type=result.getString("channel_type");
			this.channel_display_name=result.getString("channel_display_name");
			this.publisher_id=result.getString("publisher_id");
			this.description=result.getString("description");
			this.navigation_scheme=result.getString("navigation_scheme");
			this.approval_required=result.getString("approval_required");
			this.authority_level=result.getString("authority_level");
			this.tags_display_required=result.getString("tags_display_required");
			this.is_name_indexable=result.getString("is_name_indexable");
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setPublicationDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void setNewzstandCategoryDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_NEWZSTAND_CATEGORY_TABLE);	
		try{
		while(result.next()){
			this.category_id= result.getString("cat_id");
			this.category_name=result.getString("cat_name");
			this.category_enterprise_id=result.getString("enterprise_id");
			this.category_type=result.getString("type");
	
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setNewzstandCategoryDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void setCategoryDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_CATEGORY_TABLE);	
		try{
		while(result.next()){
			this.category_id= result.getString("cat_id");
			this.category_name=result.getString("cat_name");
			this.category_enterprise_id=result.getString("enterprise_id");
			this.category_type=result.getString("type");
	
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setCategoryDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void setNewzstandSubCategoryDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_NEWZSTAND_SUB_CATEGORY_TABLE);	
		try{
		while(result.next()){
			this.sub_category_id= result.getString("subcat_id");
			this.sub_category_name=result.getString("subcat_name");
	
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setNewzstandSubCategoryDetails");
			ex.printStackTrace();
		}	
		
	}
	public void setSubCategoryDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_SUB_CATEGORY_TABLE);	
		try{
		while(result.next()){
			this.sub_category_id= result.getString("subcat_id");
			this.sub_category_name=result.getString("subcat_name");
	
		}
		}catch(SQLException ex){
			System.out.println("Sql exception occured in setSubCategoryDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void setNewzstandPublisherDetails(){
		executeQuery(CONNECT_DATABASE_BASE,SELECT_NEWZSTAND_PUBLISHER_TABLE);	
		try{
		while(result.next()){
			this.publisher_name=result.getString("publisher_name");
			this.publisher_url=result.getString("publisher_url");
			this.subscription_url=result.getString("subscription_url");
		}
			}catch(SQLException ex){
			System.out.println("Sql exception occured in setNewzstandPublisherDetails");
			ex.printStackTrace();
		}
	}
	
	
	public void setPublisherDetails(){		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_PUBLISHER_TABLE);	
		try{
		while(result.next()){
			this.publisher_name=result.getString("publisher_name");
			this.publisher_url=result.getString("publisher_url");
			this.subscription_url=result.getString("subscription_url");
		}
			}catch(SQLException ex){
			System.out.println("Sql exception occured in setPublisherDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public void truncateAll(){
		executeQuery(CONNECT_DATABASE_BASE,TRUNCATE_ALL);
	}
		
	
	public void setEmployeeDetails()
	{		

		executeQuery(CONNECT_DATABASE_BASE,SELECT_EMPLOYEE_TABLE);	
		try
		{
			while(result.next())
			{
				this.employee_id = result.getString("employee_id");
				this.employee_first_name = result.getString("first_name");
				this.employee_last_name = result.getString("last_name");
				this.employee_salary = result.getString("salary");
			}
		}
		catch(SQLException ex)
		{
			System.out.println("Sql exception occured in setPublisherDetails");
			ex.printStackTrace();
		}	
		
	}
	
	public String getPublisherName(){
		return publisher_name;
	}
	
	public String getPublisherUrl(){
		return publisher_url;
	}
	
	public String getPublisherSubscriptionUrl(){
		return subscription_url;
	}
	
	public String getChannelName(){
		return channel_name;		
	}
	public String getChannelId(){
		
		System.out.println(channel_id);
		return channel_id;
	}
	
	public String getCategoryId(){
	
		return category_id;
	}
	
	public String getSubCategoryId(){
		return sub_category_id;
	}
	
	public String getSubCategoryName(){
		return sub_category_name;
	}
	
	public String getCategoryName(){
		return category_name;
	}
	
	public String getCategoryEnterpriseId(){
		return category_enterprise_id;
	}
	
	public String getCategoryType(){
		return category_type;
	}
	
	public String getChannelType(){
		return channel_type;		
	}
	
	public String getChannelDisplayName(){
		return channel_display_name;		
	}
	
	public String getPublisherId(){
		return publisher_id;		
	}
	
	public String getDescription(){
		return description;		
	}
	
	public String getNavigationScheme(){
		return navigation_scheme;		
	}
	
	public String getApprovalRequired(){
		return approval_required;		
	}
	
	public String getAuthorityLevel(){
		return authority_level;
	}
	
	public String getTagsDisplayRequired(){
		return tags_display_required;
	}	
	
	public String getIsNameIndexable(){
		return is_name_indexable;
	}
	
	
	
	
	public String getEmployeeId()
	{
		return employee_id;
	}
	
	public String getEmployeeFirstName()
	{
		return employee_first_name;
	}
	
	public String getEmployeeLastName()
	{
		return employee_last_name;
	}
	
	public String getEmployeeSalary()
	{
		return employee_salary;
	}
	
public void getAll(){
	System.out.println(employee_id);
	System.out.println(employee_first_name);
	System.out.println(employee_last_name);
	System.out.println(employee_salary);
}

public static void main(String args[]){
	DataBaseConnection conn=new DataBaseConnection();
	conn.setEmployeeDetails();
	//conn.setPublisherDetails();
	conn.getAll();
}
	

}
