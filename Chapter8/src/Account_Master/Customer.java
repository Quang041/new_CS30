package Account_Master;
/**
* Customer class.
*/
public class Customer {
	private String firstName, lastName;
	private String street, city, province, postal;
	//create String variables street, city, province, postal code	
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created.
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String st, String city1, String pro, String code) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		street = st;
		city = city1;
		province = pro;
		postal = code;
		//reflect the changes in the parameter
	}
	
	//create changeCity method that asks the user their city and records city in a variable above
	public void changeCity(String city1) {
		city = city1;
	}
	public String getCity() {
		return city;
	}
	//create changeStreet method that asks the user their street and records street in a variable above
	public void changeStreet(String st) {
		street = st;
	}
	public String getStreet() {
		return street;
	}
	//create changeProvince method that asks the user their province and records province in a variable above
	public void changeProvince(String pro) {
		province = pro;
	}
	public String getProvince() {
		return province;
	}
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changePostalCode(String code) {
		postal = code;
	}
	public String getPostalCode() {
		return postal;
	}
	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has
	 * been returned.
	 */
	public String toString() {
		String custString;
		//update this string so that it contains the street, city, province, and postal code
		custString = "	◦First name: " + firstName +"\n"
				+ "	◦Last name: " + lastName + "\n"
				+ "	◦Street: " + street + "\n"
				+ "	◦City: " + city + "\n"
				+ "	◦Province: " + province + "\n"
				+ "	◦Postal code: " + postal;
	 	return(custString);
	}
}

