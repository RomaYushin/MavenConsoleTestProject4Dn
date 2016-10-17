package ua.yushin.mavenTestProject;

import org.apache.log4j.Logger;

/**
 * Class, that contain main method, which started the app.
 * 
 * @version 11.10.2016
 * @author Yushin Roman
 *
 */
public class Main {
	
	/**
	 * Initialize LOG variable for logging for this class
	 */
	private static final Logger LOG = Logger.getLogger(Main.class);
	
	/**
	 * JVM start to run application with method main
	 * 
	 * @param args		an array of strings, come from 
	 * 					outside application
	 */
	public static void main(String[] args) {
		
		LOG.info("Start running app");
		new ShowMessage().showMessage();
		LOG.info("Finish running app");
	}
}
