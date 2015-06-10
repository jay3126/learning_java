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
			System.out.println("\nException occured");
		}

		SleepDemo sd = new SleepDemo();
		sd.timeDiff();
	}

	public void timeDiff(){
		try{
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(5*60*10);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff1 = end - start;
			System.out.println("\nDifferene in time is: " + diff1);
		}catch (Exception e){
			System.out.println("\nException occured.");
		}
	}

}
