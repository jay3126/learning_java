/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class StringDemo {

	/**
	 * 
	 */
	public StringDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
		String helloString = new String(helloArray);
		System.out.println(helloString);

		System.out.println("<----------------- Concatenation of string ----------->");
		String string1, string2, stringAns;
		string1 = "My name is ";
		string2 = "Chedilal zindabad";
		stringAns = string1.concat(string2);
		System.out.println("\nConcatenated string is: " + stringAns);

	}

}
