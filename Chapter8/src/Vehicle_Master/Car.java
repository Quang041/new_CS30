package Vehicle_Master;
public class Car extends Vehicle { //Car inherits from Vehicle, gaining all its fields and methods//

	//Constructor: passes all vehicle specifications up to the parent Vehicle constructor//
	public Car(double city, double hwy, int capacity, double volume) {
		super(city, hwy, capacity, volume); //Calls Vehicle's constructor to initialize all fields//
	}

	//Returns a formatted string displaying all of the car's specifications//
	public String getInformation() {
		String information = "------------------------------------\n" +
						"•Vehicle: Car.\n" +
						"•Economy City Fuel: " + fuelEconomyCity + " L/100Km.\n" + //Displays city fuel economy inherited from Vehicle//
						"•Economy Highway Fuel: " + fuelEconomyHwy + " L/100Km.\n" + //Displays highway fuel economy inherited from Vehicle//
						"•Capacity: " + seatingCapacity + " seats.\n" + //Displays seating capacity inherited from Vehicle//
						"•Cargo Volume: " + cargoVolume + " CBM.\n" + //Displays cargo volume inherited from Vehicle//
						"------------------------------------\n";
		return information;
	}
}



