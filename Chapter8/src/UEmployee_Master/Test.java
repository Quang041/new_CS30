/*

Program: CSE 3130.java          Last Date of this Revision: April 29, 2026

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary. Create Faculty
and Staff classes that inherit the UEmployee class. The Faculty class should include members for storing
and returning the department name. The Staff class should include members for storing and returning the job
title.

Author: Quang Nguyen 
School: CHHS
Course: Computer Programming 30
 

*/
package UEmployee_Master;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		
		String name;
		String salaryInput;
		double salary = 0;
		boolean i = true;
		
		do {
		System.out.print("Enter your name: ");
		name = userinput.nextLine();
		
		System.out.print("Enter your current salary: $");
		salaryInput = userinput.nextLine();
		
		try {
			
		salary = Double.parseDouble(salaryInput);
		/**
		 * If statement
		 */
		if (!name.isBlank() && salary > 0) {
			i = false;
		}
		else if (!(name instanceof String) || !(((Object)salary) instanceof Double)) {
			System.out.print("Invalid. Please try again.");
		}
		
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid salary. Please enter a numeric value.");
			System.out.println("----------------------------------------------------------");
		}
		} while (i==true);
		//////
		
		
		UEmployee employee = new UEmployee(name,salary);
		System.out.println("----------------------------------------------------------");
		System.out.println("User's information taken successfully");
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: $" + employee.getSalary());
		System.out.println("----------------------------------------------------------");
		System.out.print("Enter your faculty: ");
		String faculty = userinput.nextLine();
		Faculty employee_1 = new Faculty(name,salary);
		employee_1.setFaculty(faculty);
		
		System.out.print("Enter your position: ");
		String title = userinput.nextLine();
		Staff employee__1 = new Staff(name,salary);
		employee__1.setStaff(title);
		
		System.out.println("----------------------------------------------------------");
		
		
		
		System.out.println("Staff's information(Extened): \n"+
							"Faculty: " + employee_1.getFaculty()+"\n"+
							"Position: " + employee__1.getStaff());
		
	}
}
/* Screen Dump

Enter your name: Quang Nguyen
Enter your current salary: $10000
----------------------------------------------------------
User's information taken successfully
Name: Quang Nguyen
Salary: $10000.0
----------------------------------------------------------
Enter your faculty: UofA Applied Math
Enter your position: Matrix Research
----------------------------------------------------------
Staff's information(Extened): 
Faculty: Quang Nguyen, income $10000.0 currently working at UofA Applied Math
Position: Quang Nguyen, income $10000.0 currently doing Matrix Research
 
 */
