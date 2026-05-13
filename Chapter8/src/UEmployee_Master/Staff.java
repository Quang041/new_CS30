package UEmployee_Master;

public class Staff extends UEmployee {

	private String title; //Stores the staff member's job title or position//

	//Constructor: passes name and salary up to the parent UEmployee constructor//
	public Staff(String name, double salary) {
		super(name,salary); //Calls UEmployee's constructor to initialize name and salary//
	}

	//Sets the staff member's job title to the provided value//
	public void setStaff(String position) {
		title = position;
	}

	//Returns a formatted string displaying the staff member's name, salary, and job title//
	public String getStaff() {
		String position = getName() + ", income $" + getSalary() + " currently doing " + title;
		return position;
	}
}
