/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class Loop {

	/**
	 * 
	 */
	public Loop() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;

		Loop lo = new Loop();

		// while loop.
		lo.whileLoop(x);

		// do - while loop.
		lo.doWhileLoop(x);

		// for loop.
		lo.forLoop();

		// enhanced for loop
		lo.enhancedForLoop();

		// break keyword example
		lo.breakKeyword();

		//continue keyword example
		lo.continueKeyboard();
	}

	public void whileLoop(int y){
		while(y < 20){
			System.out.println("Value of x: " + y);
			y++;
			System.out.println("\n");
		}
	}

	public void doWhileLoop(int z){
		System.out.println("<-------------- Do While Loop ---------------->");
		do{
			System.out.println("Value of z: " + z);
			z++;
			System.out.println("\n");
		}while(z < 20);
	}

	public void forLoop(){
		System.out.println("<--------------- For Loop ---------------->");
		for(int a = 10; a < 30; a++){
			System.out.println("Value of a: " + a);
			System.out.println("\n");
		}
	}

	public void enhancedForLoop(){
		System.out.println("<------------------ Enhanced For Loop ----------------->");
		int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for(int x: numbers){
			System.out.print("Value of number: " + x);
			System.out.print(", ");
		}

		System.out.println("\n");
		String [] names = {"Tom", "Jerry", "Cat", "Cathy", "Jammy", "Apple", "Cucumber"};
		for(String y: names){
			System.out.println("Value of name: " + y);
			System.out.println(", ");
		}
	}

	public void breakKeyword(){
		int x = 10;

		System.out.println("\n<----------------- Break keyword with While Loop ------------>");
		while(x < 30){
			if(x == 20){
				break;
			}
			System.out.println("Value is: " + x + "\n");
			x++;
		}

		System.out.println("\nCurrent value of x is: " + x);

		System.out.println("\n \n<----------------- Break keyword with Do-While Loop ----------------->");
		do{
			if(x == 25){
				break;
			}
			System.out.println("Value is: " + x + "\n");
			x++;
		}while(x < 40);

		System.out.println("\nCurrent value of x is: " + x);

		System.out.println("\n \n<-------------- Break keyword with For loop -------------------->");
		for(int y = x; x < 50; x++){
			if(y > 35){
				break;
			}
			System.out.println("Value is: " + y + "\n");
			y++;
		}
	}

	public void continueKeyboard(){
		int x = 100;

		System.out.println("\n<--------------- Continue keyword with while loop ----------------->");
		System.out.println("\n \nCurrent value of x: " + x + "\n");
		while(x < 150){
			if(x > 130){
				continue;
			}
			System.out.println("Value is: " + x + "\n");
			x++;
		}

/*		System.out.println("\nCurrent value of x: " + x + "\n");
		System.out.println("\n<---------------- Continue keyword with Do-While Loop ------------------>");
		do{
			if(x > 140){
				continue;
			}
			System.out.println("Value is: " + x + "\n");
			x++;
		}while(x >= 130); */
	}

}
