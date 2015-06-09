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

		System.out.println("\n<-------------- Creating formating strings ------------------>");
		String fs;
		String stringVar = "changu mangui";
		double floatVar = 34343434.44544;
		int intVar = 21;
		fs = String.format("The value of float is " + "%f, while the value of integer is " +
							"%d and the string is " + "%s", floatVar, intVar, stringVar);
		System.out.println(fs);

		System.out.println("\n<------------- Character at index ----------->");
		char stringAt = string1.charAt(5);
		System.out.println(stringAt);

		System.out.println("<\n------------- Trim function ------------->");
		String Str = new String("     This is test string.     ");
		System.out.println(Str.trim());

		System.out.println("<\n----------------- Upper Case & Lower case string methods -------------->");
		String Str1 = new String("this Is a Chungi lAl...");
		String strUpper = Str1.toUpperCase();
		String strLower = Str1.toLowerCase();
		System.out.println("Upper case string: " + strUpper);
		System.out.println("Lower case string: " + strLower);

		System.out.println("<\n------------ Splitting of strings ----------------->");
		String str2 = new String("This is-Core Java-Learning");
		for(String strRetVal: str2.split("-", 4)){
			System.out.println(strRetVal);
		}
		

		System.out.println("<\n------------ String Length ---------------->");
		String str3 = new String("This is Core Java tutorial");
		int strLength = str3.length();
		System.out.println("Length of String is: " + strLength);
		
	}

}
