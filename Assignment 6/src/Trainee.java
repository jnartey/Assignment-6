/**
 * @author Jacob Nartey
 * Trainee class extending Employee class
 *
 */
public class Trainee extends Employee {
		
	public Trainee(long id, String Name, String address, long phone, double salary) {
		super(id, Name, address, phone);
		super.basicSalary = salary;
	}

}
