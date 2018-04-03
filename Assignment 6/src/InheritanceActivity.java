/**
 * @author Jacob Nartey
 *
 */

public class InheritanceActivity {

	public static void main(String[] args) {
		
		//Creating an instance of Manager class by calling the overloaded constructor with the below parameters
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		
		//Invoking the calculateSalary method of the manager object. 
		manager.calculateSalary();
		
		//Creating an instance of Manager class by calling the overloaded constructor with the below parameters
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		//Invoking the calculateSalary method of the trainee object. 
		trainee.calculateSalary();
		
		//Invoking the calculateTransportAllowance for the manager
		manager.calculateTransportAllowance();
		
		//Invoking the calculateTransportAllowance for the trainee
		trainee.calculateTransportAllowance();
	}

}
