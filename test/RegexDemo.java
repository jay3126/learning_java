/**
 * 
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author janmejay.rai
 *
 */
public class RegexDemo {

	/**
	 * 
	 */
	public RegexDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String to be scanned to find the pattern.
		String line = "This is the line to be searched BH124#@!! ?><MKJBkjbkj794242";
		String pattern = "(.*)(\\d+)(.*)";

		// creating a pattern object
		Pattern r = Pattern.compile(pattern);

		// create matcher object
		Matcher m = r.matcher(line);
		if(m.find()){
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		}else{
			System.out.println("No Match!");
		}
	}
}