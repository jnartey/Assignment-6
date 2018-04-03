/**
 * @author Jacob Nartey
 * Employee class
 *
 */
public class Employee {
	
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double Hra = 1000.50;
	
	public Employee(long id, String Name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public void display(double value) {
		System.out.println(value);
	}
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		
		//Display salary
		display(salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10 * basicSalary/100;
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100) + transportAllowance;
		//Display transportAllowance
		//display(transportAllowance);
		
		//Displaying salary by adding transport allowance
		display("Salary is salary  + transportation allowance (" + transportAllowance + ") = " + (salary));
	}

}
