package ua.yushin.mavenTestProject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

/**
 * Shows specified message in console
 * 
 * @version 11.10.2016
 * @author Yushin Roman
 *
 */
public class ShowMessage {

	/**
	 * Initialize LOG variable for logging for this class
	 */
	private static final Logger LOG = Logger.getLogger(ShowMessage.class);
	
	/**
	 * this variable is result of working of method createMessage()
	 */
	private String message1;
	
	/**
	 * this variable is result of working of method createMessage2()
	 */
	private String message2;
	
	/**
	 * this variable is result of working of method createMessage3()
	 */
	private String message3;
	
	/**
	 * Initialize default Locale for this OS
	 */
	//private Locale locale = Locale.getDefault();
	
	/**
	 * Initialize Englsh Locale
	 */
	private Locale locale = Locale.ENGLISH;
	
	/**
	 * Download files .properties depends on locale
	 */
	private ResourceBundle rb = ResourceBundle.getBundle("message_resources", locale);

	/**
	 * show specified message in console
	 */
	public void showMessage() {
		
		message1 = createMessage(new GregorianCalendar());
		message2 = createMessage2(new GregorianCalendar());
		message3 = createMessage3(new GregorianCalendar());
		
		System.out.println("createMessage: " + message1);
		System.out.println("createMessage2: " + message2);
		System.out.println("createMessage3: " + message3);

	}

	/**
	 * create message depends on time of day
	 * 
	 * @param currentTime	current time when call this method
	 * @return				message from propertie file depends on time
	 */
	public String createMessage(GregorianCalendar currentTime) {

		SimpleDateFormat f = new SimpleDateFormat("kk");
		LOG.debug("time is: " + new SimpleDateFormat("kk:mm:s").format(currentTime.getTime()));
		
		switch (f.format(currentTime.getTime())) {
			case "23":
			case "24":
			case "01":
			case "02":
			case "03":
			case "04":
			case "05":
				message1 = rb.getString("night");
				break;
			case "06":
			case "07":
			case "08":
				message1 = rb.getString("morning");
				break;
			case "09":
			case "10":
			case "11":
			case "12":
			case "13":
			case "14":
			case "15":
			case "16":
			case "17":
			case "18":
				message1 = rb.getString("day");
				break;
			case "19":
			case "20":
			case "21":
			case "22":
				message1 = rb.getString("evening");
				break;
			default:
				message1 = "undefined";
				LOG.error("UNDEFINED TIME!!!");
		}
		
		LOG.info("messsage \"" + message1 + "\" was created");
		return message1;
	}
	
	/**
	 * create message depends on time of day
	 * 
	 * @param currentTime	current time when call this method
	 * @return				message from propertie file depends on time
	 */
	public String createMessage2 (GregorianCalendar currentTime) {
						
		Calendar night_00_06 = new GregorianCalendar();
		Calendar morning_06_09 = new GregorianCalendar();
		Calendar day_09_19 = new GregorianCalendar();
		Calendar evening_19_23 = new GregorianCalendar();
		Calendar night_23_00 = new GregorianCalendar();		
		List<Calendar> arrList = new ArrayList<Calendar>();
		List<String> messages = new ArrayList<String>();
		
		messages.add("night");
		messages.add("morning");
		messages.add("day");
		messages.add("evening");
		messages.add("night");
		
		morning_06_09.set(11, 6);
		morning_06_09.set(12, 0);
		morning_06_09.set(13, 0);
		
		day_09_19.set(11, 9);
		day_09_19.set(12, 0);
		day_09_19.set(13, 0);
		
		evening_19_23 .set(11, 19);
		evening_19_23 .set(12, 0);
		evening_19_23 .set(13, 0);
		
		night_23_00.set(11, 23);
		night_23_00.set(12, 0);
		night_23_00.set(13, 0);
		
		night_00_06.set(11, 24);
		night_00_06.set(12, 0);
		night_00_06.set(13, 0);
		
		arrList.add(morning_06_09);		
		arrList.add(day_09_19);
		arrList.add(evening_19_23);
		arrList.add(night_23_00);
		arrList.add(night_00_06);
		
		int i = 0;
		for (Calendar gc : arrList) {
			if (currentTime.before(gc)){
				message2 = messages.get(i);
				break;
			}
			++i;
		}
		return rb.getString(message2);
	}
	
	/**
	 * create message depends on time of day
	 * 
	 * @param currentTime	current time when call this method
	 * @return				message from propertie file depends on time
	 */
	public String createMessage3 (GregorianCalendar currentTime) {
		
		int i = currentTime.get(11);		
		if (i < 6 || i >= 23) {
			message3 = rb.getString("night");
		} else if (i < 9) {
			message3 = rb.getString("morning");
		} else if (i < 19) {
			message3 = rb.getString("day");
		} else if (i < 23) {
			message3 = rb.getString("evening");
		}		
		return message3;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public ResourceBundle getRb() {
		return rb;
	}

	public void setRb(ResourceBundle rb) {
		this.rb = rb;
	}
	
	
	
}
