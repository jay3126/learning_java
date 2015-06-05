/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class MyCalculator {

	/**
	 * 
	 */
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calc = new MyCalculator();
		calc.add();
		calc.substract();
		calc.multiply();
		calc.divide();
		calc.modulus();
	}

	public double add(){
		double a = 10.2344 + 4343.43434;
		System.out.println("Add: " + a);
		return a;
	}

	public int substract(){
		int b = 2020202 - 323232323;
		System.out.println("Substract: " + b);
		return b;
	}

	public int multiply(){
		int c = 21212121 * 42097437;
		System.out.println("Multiply: " + c);
		return c;
	}

	public void divide(){
		double d = 2332.32323 / 4343.43434;
		System.out.println("Divide: " + d);
	}

	public void modulus(){
		double e = 2432.434343 % 42423.3232;
		System.out.println("Modulus: " + e);
	}

}
