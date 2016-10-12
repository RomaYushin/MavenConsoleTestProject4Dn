package ua.yushin.mavenTestProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class ShowMessage {
	
	private static final Logger LOG = Logger.getLogger(ShowMessage.class);
	private Locale locale = Locale.getDefault();
	//private Locale locale = Locale.ENGLISH;
	private ResourceBundle rb = ResourceBundle.getBundle("message_resources", locale);

	public void showMessage() {

		String message = createMessage();
		System.out.println(message);

	}

	public String createMessage() {

		String message = null;
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("kk");
		LOG.debug("time is: " + new SimpleDateFormat("kk:mm:s").format(d));

		switch (f.format(d)) {
			case "23":
			case "00":
			case "01":
			case "02":
			case "03":
			case "04":
			case "05":
				message = rb.getString("night");
				break;
			case "06":
			case "07":
			case "08":
				message = rb.getString("morning");
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
				message = rb.getString("day");
				break;
			case "19":
			case "20":
			case "21":
			case "22":
				message = rb.getString("evening");
				break;
			default:
				message = "undefined";
				LOG.error("UNDEFINED TIME!!!");
		}
		
		LOG.info("messsage \"" + message + "\" was created");
		return message;
	}

	public Locale getLocale() {
		return locale;
	}

	public ResourceBundle getRb() {
		return rb;
	}
	
	
}