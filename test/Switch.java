/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author janmejay.rai
 *
 */
public class Switch {

	/**
	 * 
	 */
	public Switch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char grade = 'C';
		Scanner ja = new Scanner(System.in);
		System.out.println("Enter the grade: ");
		String grade = ja.nextLine();

		switch(grade){
		case "A":
			System.out.println("\nYour grade is excellent!");
			break;
		case "B":
			System.out.println("\nYour grade is good");
			break;
		case "C":
			System.out.println("\nYour grade is satisfactory");
			break;
		case "D":
			System.out.println("\nYour grade is poor");
			break;
		default:
			System.out.println("\nInvalid grade");
		}
		System.out.println("\nYour entered grade is: " + grade);
	}
}
