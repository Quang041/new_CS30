package Account_Master;

public class PersonalAcct extends Account {
	
	private double Personal_Acct;
	public PersonalAcct(String ID) {
		super(ID);
		Personal_Acct = getBalance();
	}
	
	public void deposit(double amt) {
		Personal_Acct += amt;
	}
	
	public void withdrawal(double amt) {
	 	if (amt <= Personal_Acct) {
	 		Personal_Acct -= amt;
	 		if (Personal_Acct < 100) {
	 			Personal_Acct -= 2;
	 		}
	 		else {
	 			Personal_Acct -= 0;
	 		}
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	public String returnBalance() {
		String balance = String.valueOf(Personal_Acct);
		return(balance);
	}
	
	
	
}
