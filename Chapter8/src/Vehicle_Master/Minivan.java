package Vehicle_Master;
public class Minivan extends Vehicle { //Minivan inherits from Vehicle, gaining all its fields and methods//
	public Minivan(double city, double hwy, int capacity, double volume) {
		super(city, hwy, capacity, volume); //Passes all vehicle specifications up to the parent Vehicle constructor//
	}
	
	public String getInformation() { //Returns a formatted string displaying all of the minivan's specifications//
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



