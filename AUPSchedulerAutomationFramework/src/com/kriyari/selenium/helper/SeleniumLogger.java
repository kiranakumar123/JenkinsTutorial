package com.kriyari.selenium.helper;



import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import com.testing.again.SeleniumLogger;


public class SeleniumLogger {


	private static String log4jPropertyFile;


	private Logger logger;

	private String logName;

	static {
	
		initLoggerConfig();
	}

	private static void initLoggerConfig() {
		String baseSeleniumDir = System.getenv("SELENIUM_HOME");
		System.out.println("selenium_home:"+baseSeleniumDir);
		log4jPropertyFile = baseSeleniumDir +File.separator + "config" + File.separator + "logger.properties";
                baseSeleniumDir = File.separator + "home" + File.separator + "kiran_akumar123" + File.separator + "git_repo" + File.separator + "JenkinsTutorial" + File.separator + "AUPSchedulerAutomationFramework"+File.separator;
                log4jPropertyFile = baseSeleniumDir +File.separator + "config" + File.separator + "logger.properties";
                System.out.println("inside logger selenium_home:"+baseSeleniumDir);
                System.out.println("inside logger log4jPropertyFile:"+log4jPropertyFile);
		System.setProperty("selenium.home", baseSeleniumDir);	
		PropertyConfigurator.configureAndWatch(log4jPropertyFile);		
	}

	public SeleniumLogger(final String logName) throws NullPointerException {
		this.logName = logName.toLowerCase();
		initLogger();
	}

	private void initLogger() {
		this.logger = Logger.getLogger(logName);
	}

	public void debug(final String message) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.debug(message);
		}
	}

	public void info(final String message) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.info(message);
		}
	}

	public void warn(final String message) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.warn(message);
		}
	}

	public void warn(final String message, final Throwable t) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.warn(message, t);
		}
	}

	public void error(final String message) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.error(message);
		}
	}

	public void error(final String message, final Throwable t) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.error(message, t);
		}
	}

	public void fatal(final String message) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.fatal(message);
		}
	}

	public void fatal(final String message, final Throwable t) {
		if(logger == null) {
			initLogger();
		}

		if(logger != null) {
			logger.fatal(message, t);
		}
	}
	
	public static void main(String args[])
	{
		SeleniumLogger logger = new SeleniumLogger("test");
		logger.debug("testING debug");
		logger.info("testING info");
		logger.fatal("testING fatal");
		logger.warn("testING warn");
	}

}
