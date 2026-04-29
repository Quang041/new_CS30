/*

Program: CSE 3130.java          Last Date of this Revision: April 29, 2026

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 7.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then $2.00 
is charged (withdrawal) to the account. A business account requires a minimum balance of $500, otherwise the 
account if charged $10. Create client code to test the class.

Author: Quang Nguyen 
School: CHHS
Course: Computer Programming 30
 

*/
package Account_Master;
import java.util.Scanner;
public class client_test {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		
		
		PersonalAcct personal = new PersonalAcct(1000,"Matthew","James","159 Macewan Valley","Calgary","Alberta","H6G 2F5");
		BusinessAcct business = new BusinessAcct(10000,"Quang","Nguyen","123 Hauptstraße","Charlottenburg","Berlin","10115");
		String decision;
		
		
		
		
		while (true) {
		/**
		 * Decide, which account to make
		 */
		System.out.println("---------------------------------------");
		System.out.println("Menu.\n" +
							"1. Create New Personal Account.\n" +
							"2. Create New Business Account.\n" +
						    "3. Deposit.\n" +
							"4. Withdraw.\n" +
						    "5. Cancel.\n");
		System.out.print("•");
		decision = userinput.next();
		System.out.println("---------------------------------------");
		
		if (decision.equals("1")) {
			System.out.println("•Your account's ID: " + personal.getID());
			System.out.println("•Your account's information:\n" + 
							personal.toString());
			System.out.println("---------------------------------------");
		}
		else if (decision.equals("2")) {
			System.out.println("•Your account's ID: " + business.getID());
			System.out.println("•Your account's information: \n" +
							business.toString());
			System.out.println("---------------------------------------");
		}
		else if (decision.equals("3")) {     //DEPOSIT//
			System.out.println("1.Personal.\n" + "2.Business.");
			System.out.print("Enter your account: ");
			String dec = userinput.next();
			
			if (dec.equals("1")) {
				System.out.print("Enter your ID: ");
				String ID = userinput.next();
				if (personal.getID().equals(ID)) {
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble();
					personal.deposit(money);
					System.out.println("Your balance: $" + personal.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID.");
					System.out.println("---------------------------------------");
				}
				
			}
			else if (dec.equals("2")) {
				System.out.print("Enter your ID: ");
				String ID = userinput.next();
				if (business.getID().equals(ID)) {
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble();
					business.deposit(money);
					System.out.println("Your balance: $" + business.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID.");
					System.out.println("---------------------------------------");
				}
			}
			
		}
		else if (decision.equals("4")) {  //WITHDRAW//
			System.out.println("1.Personal.\n" + "2.Business.");
			System.out.print("Enter your account: ");
			String dec = userinput.next();
			
			if (dec.equals("1")) {
				System.out.print("Enter your ID: ");
				String ID = userinput.next();
				
				if (personal.getID().equals(ID)) {
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble();
					
					personal.withdrawal(money);
					System.out.println("Your balance: $" + personal.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID.");
					System.out.println("---------------------------------------");
				}
				
			}
			else if (dec.equals("2")) {
				System.out.print("Enter your ID: ");
				String ID = userinput.next();
				
				if (business.getID().equals(ID)) {
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble();
					
					business.withdrawal(money);
					System.out.println("Your balance: $" + business.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID.");
					System.out.println("---------------------------------------");
				}
			}
		}
		else if (decision.equals("5")) {
			System.out.println("Goodbye. Thank you for your visit.");
			System.out.println("---------------------------------------");
			break;
		}
		else {
			System.out.println("Error. Pleaes enter a value input.");
			System.out.println("---------------------------------------");
		}
	}}
}

