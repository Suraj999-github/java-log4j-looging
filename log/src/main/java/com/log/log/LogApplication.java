package com.log.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LogApplication {
	 private static final Logger logger = LogManager.getLogger(LogApplication.class);
	public static void main(String[] args) {
		   logger.info("Starting the demo. ");

		    //Lets throw exception but before that let's warn.
		    logger.warn("Exception must occur now.");
		    try {
		        throw new Exception("Throwing exception for demonstration");
		    }
		    catch(Exception e){
		        logger.error("Exception occured.", e.getMessage(), e);
		    }

		    logger.info("Ending the demo. ");
		    SpringApplication.run(LogApplication.class, args);
	}

}
