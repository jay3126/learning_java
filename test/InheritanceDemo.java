/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class InheritanceDemo extends Mammal {

	/**
	 * 
	 */
	public InheritanceDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InheritanceDemo iid = new InheritanceDemo();
		Animal a = new Animal();
		Mammal m = new Mammal();

		System.out.println(iid instanceof Animal);
		System.out.println(iid instanceof Mammal);
		System.out.println(m instanceof Animal);
		iid.mainMammal();
	}

}
