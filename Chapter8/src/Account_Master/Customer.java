package Account_Master;
/**
* Customer class.
*/
public class Customer {
	private String firstName, lastName; //Stores the customer's first and last name//
	private String street, city, province, postal; //Stores the customer's full address details//
	//create String variables street, city, province, postal code	
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created.
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String st, String city1, String pro, String code) //modify constructor to include street, city, province, postal code
	{
		firstName = fName; //Sets the first name//
		lastName = lName; //Sets the last name//
		street = st; //Sets the street//
		city = city1; //Sets the city//
		province = pro; //Sets the province//
		postal = code; //Sets the postal code//
		//reflect the changes in the parameter
	}
	
	//create changeCity method that asks the user their city and records city in a variable above
	public void changeCity(String city1) {
		city = city1; //Updates the city to the provided value//
	}
	public String getCity() {
		return city; //*//
	}
	//create changeStreet method that asks the user their street and records street in a variable above
	public void changeStreet(String st) { 
		street = st; //Updates the street to the provided value//
	}
	public String getStreet() {
		return street; //*//
	}
	//create changeProvince method that asks the user their province and records province in a variable above
	public void changeProvince(String pro) {
		province = pro; //Updates the province to the provided value//
	}
	public String getProvince() {
		return province; //*//
	}
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changePostalCode(String code) {
		postal = code; //Updates the postal code to the provided value//
	}
	public String getPostalCode() {
		return postal; //*//
	} 
    //*: I tend to use these value to create a function to reset information in case user forgot their ID and use this to verify their information//

	
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
	 	return(custString);  //Set the information for user to check after create new account//
	}
}

