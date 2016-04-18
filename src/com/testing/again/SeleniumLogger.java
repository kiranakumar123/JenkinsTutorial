package com.testing.again;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class SeleniumLogger {


	private static String log4jPropertyFile;


	private Logger logger;

	private String logName;

	static {
	
		initLoggerConfig();
	}

	private static void initLoggerConfig() {
		String baseSeleniumDir = System.getenv("SELENIUM_HOME");
		log4jPropertyFile = baseSeleniumDir +File.separator + "conf" + File.separator + "logger.properties";
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

}
