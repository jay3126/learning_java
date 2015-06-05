/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class Salary {

	public String name;
	private double age;
	private double salary;
	/**
	 * 
	 */
	public Salary(String userName) {
		// TODO Auto-generated constructor stub
		name = userName;
	}

	public void setAge(double empAge){
		age = empAge;
	}

	public void setSalary(double empSalary){
		salary = empSalary;
	}

	public void printEmpRecords(){
		System.out.println("Name :" + name);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary sal = new Salary("Jay");
		sal.setSalary(1000000);
		sal.setAge(300);
		sal.printEmpRecords();

	}

}
