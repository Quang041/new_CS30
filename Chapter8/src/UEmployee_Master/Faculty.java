package UEmployee_Master;

public class Faculty extends UEmployee {

	private String workplace;//Stores the faculty member's current workplace//
	//Constructor: passes name and salary up to the parent UEmployee constructor//
	public Faculty(String name, double salary) {
		super(name,salary); //Calls UEmployee's constructor to initialize name and salary//
	}

	//Sets the faculty member's workplace to the provided value//
	public void setFaculty(String w) {
		workplace = w;
	}

	//Returns a formatted string displaying the faculty member's name, salary, and workplace//
	public String getFaculty() {
		String work = getName() + ", income $" + getSalary() + " currently working at " + workplace;
		return work;
	}
}
