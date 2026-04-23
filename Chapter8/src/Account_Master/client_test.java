package Account_Master;

import java.util.Scanner;

public class client_test {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		//Create new account//
		System.out.println("Create new account.");
		System.out.print("Enter your first name: ");
		String fname = userinput.nextLine();
		System.out.print("Enter your last name: ");
		String lname = userinput.nextLine();
		System.out.print("Enter your first deposit: ");
		String balance = userinput.nextLine();
		double bal = Double.parseDouble(balance);
		
		Account newAcct = new Account(bal,fname,lname);
		System.out.println(newAcct.getID());
		System.out.println(newAcct.getBalance());
		
		
		
		//Transaction//
		System.out.println("1. Deposit\n" + "2. Withdraw\n" + "3. End the program");
		String decision = userinput.nextLine();
		if (decision.equals(1)) {
			
		}

	}
}
