/*

Program: CSE 3130.java          Last Date of this Revision: April 29, 2026

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and Minivan classes 
should include members specific to the type of vehicle being represented. Create client code to test the classes.

Author: Quang Nguyen 
School: CHHS
Course: Computer Programming 30
 

*/
package Vehicle_Master;
public class client_test {
	public static void main(String[] args) {
	
		Vehicle car = new Car(28, 39, 5, 15.1); //Assume values for car//
		Vehicle truck = new Truck(20, 26, 3, 62.3); //Assume values for truck//
		Vehicle minivan = new Minivan(19, 28, 8, 32.8); //Assume values for minivan//
		System.out.println(car.getInformation()); //Print out the information for each vehicle//
		System.out.println(truck.getInformation());
		System.out.println(minivan.getInformation());
	
}
}
/* Screen Dump

------------------------------------
•Vehicle: Car.
•Economy City Fuel: 28.0 L/100Km.
•Economy Highway Fuel: 39.0 L/100Km.
•Capacity: 5 seats.
•Cargo Volume: 15.1 CBM.
------------------------------------

------------------------------------
•Vehicle: Car.
•Economy City Fuel: 20.0 L/100Km.
•Economy Highway Fuel: 26.0 L/100Km.
•Capacity: 3 seats.
•Cargo Volume: 62.3 CBM.
------------------------------------

------------------------------------
•Vehicle: Car.
•Economy City Fuel: 19.0 L/100Km.
•Economy Highway Fuel: 28.0 L/100Km.
•Capacity: 8 seats.
•Cargo Volume: 32.8 CBM.
------------------------------------
 
 */


