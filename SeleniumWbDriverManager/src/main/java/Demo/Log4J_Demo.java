package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J_Demo {
	private static Logger logger=LogManager.getLogger(Log4J_Demo.class);
	public static void main(String[] args) {
		System.out.println("\n Hello World....\n");
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		System.out.println(" \n Completed");
	}

}
