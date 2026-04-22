package UEmployee_Master;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = userinput.nextLine();
		System.out.print("Enter your current salary: $");
		double salary = userinput.nextDouble();
		
		UEmployee employee = new UEmployee(name,salary);
		System.out.println("----------------------------------------------------------");

		System.out.println("User's information taken successfully");
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: $" + employee.getSalary());
		System.out.println("----------------------------------------------------------");

		System.out.print("Enter your faculty: ");
		String faculty = userinput.next();
		Faculty employee_1 = new Faculty(name,salary); 
		employee_1.setFaculty(faculty);
		
		System.out.print("Enter your position: ");
		String title = userinput.next();
		Staff employee__1 = new Staff(name,salary);
		employee__1.setStaff(title);
		
		System.out.println("----------------------------------------------------------");
		
		
		
		System.out.println("Staff's information(Extened): \n"+
							"Faculty: " + employee_1.getFaculty()+"\n"+
							"Position: " + employee__1.getStaff());
		
	}
}
