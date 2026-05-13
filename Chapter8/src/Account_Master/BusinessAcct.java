package Account_Master;
public class BusinessAcct extends Account {
	
	private double Business_Acct;
	public BusinessAcct(double bal, String fName, String lName, String st, String city1, String pro, String postal1) {
		super(bal, fName, lName, st, city1, pro, postal1); //Calls the parent Account constructor to initialize balance and customer information//
	}

	//Deposits the given amount by delegating directly to the parents deposit method//
	public void deposit(double amt) {
		super.deposit(amt); //Use the deposit method from the parent class to update to balance//
	}

	//Withdraws the givenn amount and charge $10 after the balance falls under $500//
	public void withdrawal(double amt) {
	 	if (amt <= getBalance()) {
           super.withdrawal(amt); // use parent's withdrawal to withdraw that specific amount//
           if (getBalance() < 500) {
               super.withdrawal(10); //Charge extra $10 if the balance falls under $500 after the transaction//
           }
       } else {
           System.out.println("Not enough money in account."); //Notify user if the balance is not available for the withdraw//
       }
    }
	
	public String returnBalance() {
		String balance = String.valueOf(Business_Acct);
		return(balance);
	}
	
	public String toString() {
		return(super.toString()); //Call the toString method from the parent class//
	}
	
	
	
}

