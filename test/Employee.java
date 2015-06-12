/**
 * 
 */
package test;

/**
 * @author janmejay.rai
 *
 */
public class Employee {

	private String name, address;
	private int number;
	/**
	 * 
	 */
	public Employee(String name, String address, int number) {
		System.out.println("Contructing an employee: ");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public void mailCheck(){
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

	public String toString(){
		return name + " " + address + " " + number;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public int getNumber(){
		return number;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public void setNumber(int newNumber){
		number = newNumber;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
