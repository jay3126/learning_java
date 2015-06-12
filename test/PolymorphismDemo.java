/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class PolymorphismDemo {

	/**
	 * 
	 */
	public PolymorphismDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeSalary es = new EmployeeSalary("Janmejay", "Lucknow chungi", 1231231, 435434534534535.4454);
		Employee emp = new EmployeeSalary("Jay bhbhb", "Noida dehlnkbn", 445454545, 98369865493594395.590874908587);
		System.out.println("Calling mail check for Salary reference");
		es.mailCheck();
		System.out.println("\nCalling mail check for employee reference");
		emp.mailCheck();
	}
}