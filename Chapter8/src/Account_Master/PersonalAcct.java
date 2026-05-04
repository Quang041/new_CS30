package Account_Master;

import java.text.NumberFormat;

public class PersonalAcct extends Account {
	
	private double Personal_Acct;
	public PersonalAcct(double bal, String fName, String lName, String st, String city1, String pro, String postal1) {
		super(bal, fName, lName, st, city1, pro, postal1); //Calls the parents Account constructor to initialize balance and customer information//
	}

	//Deposits the given amount by delegating directly to the parents deposit method//
	public void deposit(double amt) {
		super.deposit(amt); //Use the deposit method from the parent class to update to balance//
	}

	//Withdraws the given amount and charge $2 after the balance falls under $100//
	public void withdrawal(double amt) {
	 	if (amt <= getBalance()) {
           super.withdrawal(amt); // use parent's withdrawal to withdraw that specific amount//
           if (getBalance() < 100) {
               super.withdrawal(2); // charge extra $2 if the balance falls under $100 after the transaction//
           }
       } else {
           System.out.println("Not enough money in account."); //Notify user if the balance is not available for the withdraw//
       }
    }
	
	public String returnBalance() {
		String balance = String.valueOf(Personal_Acct);
		return(balance);
	}
	
	public String toString() {
		return(super.toString()); //Call the toString method from the parent class//
	}
	
	
	
	
	
}

