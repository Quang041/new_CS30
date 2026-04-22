package UEmployee_Master;

public class Staff extends UEmployee {

	private String title;
	
	public Staff(String name, double salary) {
		super(name,salary);
	}
	
	public void setStaff(String position) {
		title = position;
	}
	
	public String getStaff() {
		String position = getName() + ", income $" + getSalary() + " currently doing " + title;
		return position;
	}
}
