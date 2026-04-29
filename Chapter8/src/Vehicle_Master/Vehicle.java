package Vehicle_Master;
abstract public class Vehicle {
	double fuelEconomyCity;
	double fuelEconomyHwy;
	int seatingCapacity;
	double cargoVolume;
	
	public Vehicle (double city, double hwy, int capacity, double volume) {
		fuelEconomyCity = city;
		fuelEconomyHwy = hwy;
		seatingCapacity = capacity;
		cargoVolume = volume;
	}
	
	public abstract String getInformation();
}



