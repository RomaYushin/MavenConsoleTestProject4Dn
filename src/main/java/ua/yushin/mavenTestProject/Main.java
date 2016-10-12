package ua.yushin.mavenTestProject;

import org.apache.log4j.Logger;

public class Main {

	private static final Logger LOG = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		LOG.info("Start running app");
		new ShowMessage().showMessage();
		LOG.info("Finish running app");
	}
}
