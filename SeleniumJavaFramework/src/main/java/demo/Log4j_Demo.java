package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {

	private static Logger logger = LogManager.getLogger(Log4j_Demo.class);
	public static void main(String[] args) {

		System.out.println("\n Hello World...! \n");

		logger.trace("This is a trace message");
		logger.info("This is a info message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");

		System.out.println("\n  Completed");
	}

}
