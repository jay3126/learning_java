/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */

class Animal1{
	public void move(){
		System.out.println("Animals can move");
	}
}

class dog extends Animal1{
	public void move(){
		super.move();
		System.out.println("\nDog can also bark");
	}
}

public class OverridingDemo extends dog {

	/**
	 * 
	 */
	public OverridingDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal1 a = new dog();
		a.move();
	}

}