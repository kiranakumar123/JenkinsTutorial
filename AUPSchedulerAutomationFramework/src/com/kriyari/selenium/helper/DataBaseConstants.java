package com.kriyari.selenium.helper;

public class DataBaseConstants {

	   	public static final String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	    public static final String DATABASE_CONN_URL="jdbc:mysql://localhost:3306/test";
	    public static final String DATABASE_NAME="test";
	    public static final String DATABASE_USERNAME="root";
	    public static final String DATABASE_PASSWORD="Kr1y@204";
	    
	    public static final String CONNECT_DATABASE_BASE="use test;";
	    public static final String SELECT_EMPLOYEE_TABLE ="select * from employee where employee_id = 7369;";
	    public static final String SELECT_PUBLISHER_TABLE="select * from publisher_t where enterprise_id!=1 order by publisher_id desc limit 1;";
	    public static final String SELECT_NEWZSTAND_PUBLISHER_TABLE="select * from publisher_t where enterprise_id=1 order by publisher_id desc limit 1;";
	    public static final String SELECT_CHANNEL_TABLE="select * from  channel_t where enterprise_id!=1 order by channel_id desc limit 1;";
	    public static final String SELECT_NEWZSTAND_CHANNEL_TABLE="select * from  channel_t where enterprise_id=1 order by channel_id desc limit 1;";
	    public static final String SELECT_CATEGORY_TABLE="select * from  category_t where enterprise_id!=1 order by cat_id desc limit 1;";
	    public static final String SELECT_NEWZSTAND_CATEGORY_TABLE="select * from  where enterprise_id=1 category_t order by cat_id desc limit 1;";
	    public static final String SELECT_SUB_CATEGORY_TABLE="SELECT * FROM sub_cat_t where enterprise_id!=1 order by subcat_id desc limit 1;";
	    public static final String SELECT_NEWZSTAND_SUB_CATEGORY_TABLE="SELECT * FROM sub_cat_t where enterprise_id=1 order by subcat_id desc limit 1;";
	    public static final String TRUNCATE_ALL="call sp_truncate_all();";
	    


	    
}
