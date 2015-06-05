/**
 * 
 */
package com.rsi;

/**
 * @author janmejay.rai
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 j = new Test1();
		j.display(args[0], args[1]);

	}

	public void display(String userName, String age){
		System.out.println("<><><><> This is the display of Test1 class <><><><><> " + " You are " + age + " years old");
	}

	public void add(){
		int a = 10 + 30;
		double c = 10.225 + 20.465;
		float d = 11.2f + 23.3f;
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}

}
