/**
 * 
 */
package test;

// for getting the Date methods to work.
import java.util.Date;
import java.text.*;

/**
 * @author janmejay.rai
 *
 */
public class DateAndTimeDemo {

	/**
	 * 
	 */
	public DateAndTimeDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Current date is: " + date.toString());

		System.out.println("\n<---------------- Formatting of date --------------->");
		SimpleDateFormat dt = new SimpleDateFormat("E dd-MM-yyyy 'at' hh:mm:ss a zzz");
		System.out.println(dt.format(date));
	}

}
