/**
 * 
 */
package test;

import com.rsi.Test1;

/**
 * @author janmejay.rai
 *
 */
public class sample {

	/**
	 * 
	 */
	public sample() {
		// TODO Auto-generated constructor stub
		com.rsi.Test1 te = new Test1();
		te.display("Jammy", "29");
		te.add();
	}

	public void display(String userName){
		System.out.println("<---------- This is test -------------> " + userName);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample ja = new sample();
		ja.display("Jay");
	}

}