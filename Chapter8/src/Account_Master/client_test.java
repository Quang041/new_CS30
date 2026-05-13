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
		Scanner userinput = new Scanner(System.in); //Creates a Scanner object to read keyboard input//
		
		
		
		PersonalAcct personal = new PersonalAcct(1000,"Matthew","James","159 Macewan Valley","Calgary","Alberta","H6G 2F5"); //Assume values for personal account//
		BusinessAcct business = new BusinessAcct(10000,"Quang","Nguyen","123 Hauptstraße","Charlottenburg","Berlin","10115"); //Assume values for business account//
		String decision; //Create this variable to read user input//
		
		
		
		
		while (true) { //Loop this program until user decides to leave the program//
		/**
		 * Decide, which account to make
		 */
		// Displays the main menu options to the user//
		System.out.println("---------------------------------------");
		System.out.println("Menu.\n" +
							"1. Create New Personal Account.\n" +
							"2. Create New Business Account.\n" +
						    "3. Deposit.\n" +
							"4. Withdraw.\n" +
						    "5. Cancel.\n");
		System.out.print("•"); //Reads the user's menu choice//
		decision = userinput.next();
		System.out.println("---------------------------------------");
		
		if (decision.equals("1")) { //Displays the personal account's ID and full details//
			System.out.println("•Your account's ID: " + personal.getID());
			System.out.println("•Your account's information:\n" + 
							personal.toString());
			System.out.println("---------------------------------------");
		}
		else if (decision.equals("2")) { //Displays the business account's ID and full details//
			System.out.println("•Your account's ID: " + business.getID());
			System.out.println("•Your account's information: \n" +
							business.toString());
			System.out.println("---------------------------------------");
		}
		else if (decision.equals("3")) {     //DEPOSIT//
			System.out.println("1.Personal.\n" + "2.Business.");
			System.out.print("Enter your account: ");
			String dec = userinput.next(); //Reads whether the user wants to deposit into personal or business//
			
			if (dec.equals("1")) { //Personal account deposit//
				System.out.print("Enter your ID: ");
				String ID = userinput.next(); //Reads the account ID for verification//
				if (personal.getID().equals(ID)) { //Verifies the entered ID matches the personal account//
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble(); //Reads the deposit amount//
					personal.deposit(money); //Deposits the amount into the personal account//
					System.out.println("Your balance: $" + personal.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID."); //Notifies the user of an incorrect ID//
					System.out.println("---------------------------------------");
				}
				
			}
			else if (dec.equals("2")) { //Business account deposit//
				System.out.print("Enter your ID: ");
				String ID = userinput.next(); //Reads the account ID for verification//
				if (business.getID().equals(ID)) { //Verifies the entered ID matches the business account//
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble(); //Reads the deposit amount//
					business.deposit(money);  //Deposits the amount into the business account//
					System.out.println("Your balance: $" + business.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID."); //Notifies the user of an incorrect ID//
					System.out.println("---------------------------------------");
				}
			}
			
		}
		else if (decision.equals("4")) {  //WITHDRAW//
			System.out.println("1.Personal.\n" + "2.Business.");
			System.out.print("Enter your account: ");
			String dec = userinput.next(); //Reads whether the user wants to withdraw from personal or business//
			
			if (dec.equals("1")) { //Personal account withdrawal//
				System.out.print("Enter your ID: ");
				String ID = userinput.next(); //Reads the account ID for verification//
				
				if (personal.getID().equals(ID)) { //Verifies the entered ID matches the personal account//
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble(); //Reads the withdrawal amount//
					
					personal.withdrawal(money); //Withdraws the amount, applying a $2 fee if balance drops below $100//
					System.out.println("Your balance: $" + personal.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID."); //Notifies the user of an incorrect ID//
					System.out.println("---------------------------------------");
				}
				
			}
			else if (dec.equals("2")) { //Business account withdrawal//
				System.out.print("Enter your ID: ");
				String ID = userinput.next(); //Reads the account ID for verification//
				
				if (business.getID().equals(ID)) { //Verifies the entered ID matches the business account//
					System.out.print("Enter your amount: ");
					double money = userinput.nextDouble(); //Reads the withdrawal amount//
					
					business.withdrawal(money); //Withdraws the amount, applying a $10 fee if balance drops below $500//
					System.out.println("Your balance: $" + business.getBalance());
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("Please enter the right ID."); //Notifies the user of an incorrect ID//
					System.out.println("---------------------------------------");
				}
			}
		}
		else if (decision.equals("5")) { //Exits the program loop when the user selects Cancel//
			System.out.println("Goodbye. Thank you for your visit.");
			System.out.println("---------------------------------------");
			break; //Breaks out of the while loop, ending the program//
		}
		else {
			System.out.println("Error. Pleaes enter a value input."); // Handles any unrecognized menu input//
			System.out.println("---------------------------------------");
		}
	}}
}

/* Screen Dump
 * 
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•1
---------------------------------------
•Your account's ID: MJames
•Your account's information:
	◦MJames
	◦First name: Matthew
	◦Last name: James
	◦Street: 159 Macewan Valley
	◦City: Calgary
	◦Province: Alberta
	◦Postal code: H6G 2F5
	◦Current balance is $1,000.00
---------------------------------------
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•3
---------------------------------------
1.Personal.
2.Business.
Enter your account: 1
Enter your ID: MJames
Enter your amount: 1000
Your balance: $2000.0
---------------------------------------
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•sda
---------------------------------------
Error. Pleaes enter a value input.
---------------------------------------
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•4
---------------------------------------
1.Personal.
2.Business.
Enter your account: 1
Enter your ID: MJames
Enter your amount: 19999
Not enough money in account.
Your balance: $2000.0
---------------------------------------
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•4
---------------------------------------
1.Personal.
2.Business.
Enter your account: 1
Enter your ID: MJames
Enter your amount: 1999
Your balance: $-1.0
---------------------------------------
---------------------------------------
Menu.
1. Create New Personal Account.
2. Create New Business Account.
3. Deposit.
4. Withdraw.
5. Cancel.

•5
---------------------------------------
Goodbye. Thank you for your visit.
---------------------------------------

 
 */
 
 
