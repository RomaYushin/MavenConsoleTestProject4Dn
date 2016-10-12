package ua.yushin.mavenTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class for testing class ShowMessageTest
 * 
 * @version 11.10.2016
 * @author Yushin Roman
 *
 */
public class ShowMessageTest {

	/**
	 * method for test method showMessage in class ShowMessage
	 */
	@Test
	public final void testShowMessage() {
		new ShowMessage().showMessage();
	}
	
	/**
	 * method for test method createMessage in class ShowMessage
	 */
	@Test
	public final void testCreateMessage () {
		
		ShowMessage sm = new ShowMessage();		
		String message = sm.createMessage();
		
		if (message.equals(sm.getRb().getString("night"))
				|| message.equals(sm.getRb().getString("morning"))
				|| message.equals(sm.getRb().getString("day"))
				|| message.equals(sm.getRb().getString("evening"))) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}		
	}

}
