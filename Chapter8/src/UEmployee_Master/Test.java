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
		boolean i = true; //Flag that controls the validation loop, stays true until valid input is entered//
		
		do {
		System.out.print("Enter your name: ");
		name = userinput.nextLine(); //Reads the user's full name including spaces//
		
		System.out.print("Enter your current salary: $");
		salaryInput = userinput.nextLine(); //Reads salary as a String so it can be validated before converting//
		
		try {
			
		salary = Double.parseDouble(salaryInput); //Attempts to convert the salary String to a double//
		/**
		 * If statement
		 */
		if (!name.isBlank() && salary > 0) { //Checks that name is not empty and salary is a positive number//
			i = false; //Valid input received, exit the loop//
		}
		else if (!(name instanceof String) || !(((Object)salary) instanceof Double)) { //Checks that both fields are the correct types//
			System.out.print("Invalid. Please try again.");
		}
		
		}
		catch (NumberFormatException e) { //Catches the case where the salary input cannot be parsed as a number//
			System.out.println("Invalid salary. Please enter a numeric value.");
			System.out.println("----------------------------------------------------------");
		}
		} while (i==true); //Repeats the loop until valid name and salary are entered//
		//////
		
		//Creates a base UEmployee object to display the validated name and salary//
		UEmployee employee = new UEmployee(name,salary);
		System.out.println("----------------------------------------------------------");
		System.out.println("User's information taken successfully");
		System.out.println("Name: " + employee.getName()); //Displays the employee's name//
		System.out.println("Salary: $" + employee.getSalary()); //Displays the employee's salary//
		System.out.println("----------------------------------------------------------");
		System.out.print("Enter your faculty: ");
		String faculty = userinput.nextLine(); //Reads the faculty or department name//
		Faculty employee_1 = new Faculty(name,salary); //Creates a Faculty object with the same name and salary//
		employee_1.setFaculty(faculty); //Sets the faculty member's workplace//
		
		System.out.print("Enter your position: ");
		String title = userinput.nextLine(); //Reads the staff member's job title//
		Staff employee__1 = new Staff(name,salary); //Creates a Staff object with the same name and salary//
		employee__1.setStaff(title); //Sets the staff member's job title//
		
		System.out.println("----------------------------------------------------------");
		
		
		//Displays the extended information for both Faculty and Staff roles//
		System.out.println("Staff's information(Extened): \n"+
							"Faculty: " + employee_1.getFaculty()+"\n"+ //Prints faculty name, salary, and workplace//
							"Position: " + employee__1.getStaff()); //Prints staff name, salary, and job title//
		
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
