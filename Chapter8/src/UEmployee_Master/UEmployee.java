package UEmployee_Master;

public class UEmployee {

	private String name; //Stores the employee's name//
	private double salary; //Stores the employee's salary//

	//Constructor: initializes the employee's name and salary with the provided values//
	public UEmployee(String n, double s) {
		name = n; //Sets the employee's name//
		salary = s; //Sets the employee's salary//
	}

	//Returns the employee's name//
	public String getName() {
		return name;
	}

	//Returns the employee's salary//
	public double getSalary() {
		return salary;
	}
}
