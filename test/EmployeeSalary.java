/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class EmployeeSalary extends Employee{

	private double salary;

	/**
	 * 
	 */
	public EmployeeSalary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}

	public void mailCheck(){
		System.out.println("Mailcheck of super class");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}

	public double getSalary(){
		return salary;
	}

	public void setSalary(double newSalary){
		if(newSalary > 0.0){
			salary = newSalary;
		}
	}

	public double calculateMonthlySalary(){
		System.out.println("Computing weekly salary for " + getName());
		return getSalary()/52;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}