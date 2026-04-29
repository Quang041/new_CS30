package Vehicle_Master;
public class Truck extends Vehicle {
	public Truck(double city, double hwy, int capacity, double volume) {
		super(city, hwy, capacity, volume);
	}
	
	public String getInformation() {
		String information = "------------------------------------\n" +
						"•Vehicle: Car.\n" +
						"•Economy City Fuel: " + fuelEconomyCity + " L/100Km.\n" +
						"•Economy Highway Fuel: " + fuelEconomyHwy + " L/100Km.\n" +
						"•Capacity: " + seatingCapacity + " seats.\n" +
						"•Cargo Volume: " + cargoVolume + " CBM.\n" +
						"------------------------------------\n";
		return information;
	}
}



