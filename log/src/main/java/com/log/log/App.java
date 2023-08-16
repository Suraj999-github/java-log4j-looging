package com.log.log;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class App {
	/* Get the logger for the actual class name to be printed on */
	static Logger log = Logger.getLogger(App.class.getName());
	
	public static void main(String[] args) throws IOException, SQLException {                      
		NDC.push("Aparajita ");
		log.fatal("This is a fatal message for log4j");
		log.error("This is an error message for log4j");
		log.debug("This is an debug message for log4j");
		log.warn("This is a warning message for log4j");
		log.info("This is an info message for log4j");
	}

}
