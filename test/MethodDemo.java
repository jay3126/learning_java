/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class MethodDemo {

	double x, y, z;
	/**
	 * 
	 */
	public MethodDemo(double a, double b, double c) {
		x = a;
		y = b;
		z = c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodDemo ab = new MethodDemo(23.54, 456.4343, 56465.656);
		ab.addNum(ab.x, ab.y, ab.z);
		ab.subNum(ab.x, ab.y, ab.z);
		ab.finalize();
	}

	public double addNum(double a1, double a2, double a3){
		double addRes = a1 + a2 + a3;
		System.out.println("Result of addition: " + addRes);
		return addRes;
	}

	public double subNum(double b1, double b2, double b3){
		double subRes = b1 - b2 - b3;
		System.out.println("\nResult of substraction: " + subRes);
		return subRes;
	}

	protected void finalize(){
		System.out.println("\nFinalizing.....");
	}

}