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
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100) + transportAllowance;
		//Display transportAllowance
		//display(transportAllowance);
		
		//Displaying salary by adding transport allowance
		display("Salary is salary  + transportation allowance (" + transportAllowance + ") = " + (salary));
	}

}
