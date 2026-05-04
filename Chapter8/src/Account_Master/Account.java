package Account_Master;
/**
* Account class.
*/
import java.text.NumberFormat;
public class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
		
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and
	 * customer data has been initialized with parameters.
	 */
	public Account(double bal,String fName, String lName, String st, String city1, String pro, String postal1)//include street, city, province or state, postal code or zip code
	 {
		balance = bal; //Set the opening balance//
		cust = new Customer(fName, lName,st,city1,pro,postal1);//this constructor should reflect the new additions above, street, city, province, postal code
		 													   //Create a new user using the provided information//
		acctID = fName.substring(0,1) + lName; //Build the user ID using fisrt and last name//
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: An empty account has been created with the specified account ID.
	 */
	public Account(String ID) {
		balance = 0; //Set the balance equals to 0 (default)//
		cust = new Customer("", "","","","",""); //Create a empty Customer placeholder//
		acctID = ID; //Assign with the user ID)
	}
	/**
	 * Returns the account ID.
	 * pre: none
	 * post: The account ID has been returned.
	 */
	public String getID() {
	 	return(acctID); //Return the user ID linked with the account//
						//Will be used to vertify the account//
	}
	/**
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance); //Return balance, used to check if the transaction is working and determined how much money available for future transaction//
	}
	/**
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public void deposit(double amt) {
	 	balance += amt; //Update balance after every deposit//
	}
	
	/**
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 		balance -= amt; //Update balance after every withdrawal//
							//Note: Not include under $0, because this step will be included in PersonalAcct and BusinessAcct//
	}
	//Create a changeAddress() method that calls the cust object from above in order to change
	public void changeAddress(String st, String city, String pro, String code) {
		cust.changeStreet(st); //Update street//
		cust.changeCity(city); //Update city//
		cust.changeProvince(pro); //Update province//
		cust.changePostalCode(code); //Update postal code//
	}
	//Street, city, province, postalCode
	
	
	/**
	 * Returns a true when objects have matching account ids.
	 * pre: none
	 * post: true has been returned when the objects are equal,
	 * false returned otherwise.
	 */
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct; //Check for user ID, whether the ID exists or not//
		if (acctID.equals(testAcct.acctID)) {
				return(true); //Return true if the ID exist//
			} else {
				return(false); //Return false if the ID not exist//
			}
	}
	/**
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		accountString = "	◦" + acctID + "\n";
		accountString += cust.toString() + "\n";
		accountString += "	◦Current balance is " + money.format(balance);
	 	return(accountString); //Return the string for user to vertify their account information//
							   //If required higher security, this can be used to code higher securty vertification//
	}
}

