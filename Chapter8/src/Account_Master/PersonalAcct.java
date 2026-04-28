package Account_Master;

import java.text.NumberFormat;

public class PersonalAcct extends Account {
	
	private double Personal_Acct;
	public PersonalAcct(double bal, String fName, String lName, String st, String city1, String pro, String postal1) {
		super(bal, fName, lName, st, city1, pro, postal1);
		Personal_Acct = bal;
	}
	
	public void deposit(double amt) {
		super.deposit(amt);
	}
	
	public void withdrawal(double amt) {
	 	if (amt <= getBalance()) {
           super.withdrawal(amt); // use parent's withdrawal
           if (getBalance() < 100) {
               super.withdrawal(2); // charge $2 fee
           }
       } else {
           System.out.println("Not enough money in account.");
       }
    }
	
	public String returnBalance() {
		String balance = String.valueOf(Personal_Acct);
		return(balance);
	}
	
	public String toString() {
		return(super.toString());
	}
	
	
	
	
	
}

