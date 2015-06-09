/**
 * 
 */
package test;

import java.util.Date;
import java.util.*;
/**
 * @author janmejay.rai
 *
 */
public class SleepDemo {

	/**
	 * 
	 */
	public SleepDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Date date = new Date();
			System.out.println(date + "\n");
			Thread.sleep(5*60*20);
			System.out.println(new Date() + "\n");
		}catch (Exception e){
			System.out.println("Exception occured");
		}

	}

}
