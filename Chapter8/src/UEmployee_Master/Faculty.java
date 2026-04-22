package UEmployee_Master;

public class Faculty extends UEmployee {

	private String workplace;
	public Faculty(String name, double salary) {
		super(name,salary);
	}
	
	public void setFaculty(String w) {
		workplace = w;
	}
	
	public String getFaculty() {
		String work = getName() + ", income $" + getSalary() + " currentky working at " + workplace;
		return work;
	}
}
