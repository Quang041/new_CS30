package Account_Master;

public class BusinessAcct extends Account {
	
	private double Business_Acct;
	public BusinessAcct(String ID) {
		super(ID);
		Business_Acct = getBalance();
	}
	
	public void deposit(double amt) {
		Business_Acct += amt;
	}
	
	public void withdrawal(double amt) {
	 	if (amt <= Business_Acct) {
	 		Business_Acct -= amt;
	 		if (Business_Acct < 500) {
	 			Business_Acct -= 10;
	 		}
	 		else {
	 			Business_Acct -= 0;
	 		}
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	public String returnBalance() {
		String balance = String.valueOf(Business_Acct);
		return(balance);
	}
	
	
	
}
