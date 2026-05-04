package Vehicle_Master;
abstract public class Vehicle { //Abstract base class representing a vehicle, cannot be instantiated directly//
	double fuelEconomyCity; //Stores the city fuel economy in L/100Km//
	double fuelEconomyHwy; //Stores the highway fuel economy in L/100Km//
	int seatingCapacity; //Stores the number of seats the vehicle has//
	double cargoVolume; //Stores the cargo volume of the vehicle in CBM//
	
	public Vehicle (double city, double hwy, int capacity, double volume) { //Initializes all vehicle fields with the provided specifications//
		fuelEconomyCity = city; //Sets the city fuel economy//
		fuelEconomyHwy = hwy; //Sets the highway fuel economy//
		seatingCapacity = capacity; //Sets the seating capacity//
		cargoVolume = volume; //Sets the cargo volume//
	}
	
	public abstract String getInformation(); //Forces all subclasses to implement their own version of getInformation()//
}



