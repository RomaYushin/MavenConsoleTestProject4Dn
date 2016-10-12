package ua.yushin.mavenTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShowMessageTest {

	@Test
	public final void testShowMessage() {
		new ShowMessage().showMessage();
	}
	
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
