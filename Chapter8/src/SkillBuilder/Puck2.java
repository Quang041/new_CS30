package SkillBuilder;

import java.util.Scanner;

public class Puck2 extends Puck1 implements Comparable {

	public Puck2(double w) {
		super(w);
	}

	public int compareTo(Object d) {
		Puck2 testPuck = (Puck2)d;
		
		if (getWeight() < testPuck.getWeight()) {
			return (-1);
		}
		else if (getWeight() == testPuck.getWeight()) {
			return(0);
		}
		else {
			return(1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first puck weight:");
		double puck1 = userinput.nextDouble();
		System.out.print("Enter the first puck weight:");
		double puck2 = userinput.nextDouble();

		
	}
}
