package com.kriyari.selenium.helper;




import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.jdbc.JDBCAppender;

public class SampleJDBCLog4jLogging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* BasicConfigurator.configure();
	     Logger OurLogger = LogManager.getLogger("OurLogger");

	     //create a JDBCAppender class instance
	     JDBCAppender dataBaseAppender = new JDBCAppender();
	     //Provide connection details to the 
	     //Database appender
	     dataBaseAppender.setURL("jdbc:mysql://localhost:3306/test"); //Connection url
	     dataBaseAppender.setUser("root"); //Username for the DB connection
	     dataBaseAppender.setPassword("Kr1y@204"); //Password for the DB connection
	     dataBaseAppender.setDriver("com.mysql.jdbc.Driver"); // Drivers to use to connect to DB

	     //set the sql insert statement that you want to use
	     dataBaseAppender.setSql("INSERT INTO LOGS VALUES ('%x', now() ,'%C','%p','%m'");   

         //activate the new options
	     dataBaseAppender.activateOptions();

	     //Attach the appender to the Logger
	     OurLogger.addAppender(dataBaseAppender);

	     int x = 0;
	     while(x < 11){
	    	 OurLogger.debug("This is just a log that I want to print " + x);
		     x++;
	     }*/
		
		Logger logger = Logger.getLogger(SampleJDBCLog4jLogging.class.getName());
		String baseSeleniumDir = System.getenv("SELENIUM_HOME");
		String log4jPropertyFile = baseSeleniumDir +File.separator + "conf" + File.separator + "jdbclog4jlogger.properties";
		System.setProperty("selenium.home", baseSeleniumDir);	
		PropertyConfigurator.configureAndWatch(log4jPropertyFile);		
		logger.debug("Debug msg");
		logger.info("info msg");
  }
}
