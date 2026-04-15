package SkillBuilder;

public class Puck1 extends Disk {
	private double weight;
	private boolean standard, youth;
	
	double standard_max = 5.5;
	double standard_min = 5;
	double youth_max = 4.5;
	double youth_min = 4;
	
	public Puck1(double w) {
		super(1, 1.5);
		weight = w;
		
		if (weight>=standard_min && weight<=standard_max) {
			standard = true;
			youth = false;
		}
		else if (weight>=youth_min && weight<=youth_max) {
			youth = true;
			standard = false;
		}
	}
	
	
	public double getWeight() {		
		return (weight);
	}
	
	
	String div;
	public String getDivision() {
		
		if (standard == true) {
			div = "Puck is standard";
		}
		else if (youth == true) {
			div = "Puck is youth";
		}
		
		return(div);
	}
	
	public boolean equals(Object d) {
		Puck1 testObj = (Puck1)d;
		
		if (weight == testObj.getWeight()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String diskString;
		
		diskString = "This disk is " + getDivision()
					+ " and weight " + getWeight();
		return(diskString);
	}
	
 }
