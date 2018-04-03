/**
 * @author Jacob Nartey
 * Manager class extending Employee class
 *
 */
public class Manager extends Employee {
	
	public Manager(long id, String Name, String address, long phone, double salary) {
		super(id, Name, address, phone);
		super.basicSalary = salary;
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15 * super.basicSalary /100;
		
		//Display transportAllowance
		display(transportAllowance);
	}

}
