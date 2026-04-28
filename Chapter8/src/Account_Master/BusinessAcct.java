package Account_Master;
public class BusinessAcct extends Account {
	
	private double Business_Acct;
	public BusinessAcct(double bal, String fName, String lName, String st, String city1, String pro, String postal1) {
		super(bal, fName, lName, st, city1, pro, postal1);
	}
	
	public void deposit(double amt) {
		super.deposit(amt);
	}
	
	public void withdrawal(double amt) {
	 	if (amt <= getBalance()) {
           super.withdrawal(amt); // use parent's withdrawal
           if (getBalance() < 500) {
               super.withdrawal(10);
           }
       } else {
           System.out.println("Not enough money in account.");
       }
    }
	
	public String returnBalance() {
		String balance = String.valueOf(Business_Acct);
		return(balance);
	}
	
	public String toString() {
		return(super.toString());
	}
	
	
	
}

