package ua.yushin.mavenTestProject;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

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
	 * default locale
	 */
	private static final Locale LOCALE_DEFAULT = Locale.getDefault();

	/**
	 * english locale
	 */
	private static final Locale LOCALE_EN = Locale.ENGLISH;

	/**
	 * resource bundle for default locale
	 */
	private ResourceBundle resourceBundle_default = ResourceBundle.getBundle("message_resources", LOCALE_DEFAULT);

	/**
	 * resource bundle for english locale
	 */
	private ResourceBundle resourceBundle_en = ResourceBundle.getBundle("message_resources", LOCALE_EN);
	
	/**
	 * object of class ShowMessage
	 */
	private ShowMessage sm = new ShowMessage();

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
	public final void testCreateMessage() {

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 0);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Good night, World!".equals(message));
			} else if (i < 9) {
				assertTrue("Good morning, World!".equals(message));
			} else if (i < 19) {
				assertTrue("Good day, World!".equals(message));
			} else if (i < 23) {
				assertTrue("Good evening, World!".equals(message));
			}
		}

		// change Locale
		sm.setRb(resourceBundle_default);

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 0);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Доброй ночи, мир!".equals(message));
			} else if (i < 9) {
				assertTrue("Доброе утро, мир!".equals(message));
			} else if (i < 19) {
				assertTrue("Добрый день, мир!".equals(message));
			} else if (i < 23) {
				assertTrue("Добрый вечер, мир!".equals(message));
			}
		}
	}

	/**
	 * method for test method showMessage in class ShowMessage
	 */
	@Test
	public final void testCreateMessage2() {

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 30);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Good night, World!".equals(message));
			} else if (i < 9) {
				assertTrue("Good morning, World!".equals(message));
			} else if (i < 19) {
				assertTrue("Good day, World!".equals(message));
			} else if (i < 23) {
				assertTrue("Good evening, World!".equals(message));
			}
		}

		// change Locale
		sm.setRb(resourceBundle_default);

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 0);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Доброй ночи, мир!".equals(message));
			} else if (i < 9) {
				assertTrue("Доброе утро, мир!".equals(message));
			} else if (i < 19) {
				assertTrue("Добрый день, мир!".equals(message));
			} else if (i < 23) {
				assertTrue("Добрый вечер, мир!".equals(message));
			}
		}
	}

	/**
	 * method for test method showMessage in class ShowMessage
	 */
	@Test
	public final void testCreateMessage3() {

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 30);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Good night, World!".equals(message));
			} else if (i < 9) {
				assertTrue("Good morning, World!".equals(message));
			} else if (i < 19) {
				assertTrue("Good day, World!".equals(message));
			} else if (i < 23) {
				assertTrue("Good evening, World!".equals(message));
			}
		}

		// change Locale
		sm.setRb(resourceBundle_default);

		for (int i = 0; i < 24; i++) {
			GregorianCalendar time = new GregorianCalendar();
			time.set(11, i);
			time.set(12, 30);
			time.set(13, 0);
			String message = sm.createMessage3(time);
			//System.out.println(message + " " + time.getTime());
			if (i < 6 || i >= 23) {
				assertTrue("Доброй ночи, мир!".equals(message));
			} else if (i < 9) {
				assertTrue("Доброе утро, мир!".equals(message));
			} else if (i < 19) {
				assertTrue("Добрый день, мир!".equals(message));
			} else if (i < 23) {
				assertTrue("Добрый вечер, мир!".equals(message));
			}
		}
	}
}
