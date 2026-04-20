package SkillBuilder;

import java.util.Scanner;

public class Rectangle_test {
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first width: ");
		double width1 = userinput.nextDouble();
		System.out.print("Enter the first length: ");
		double length1 = userinput.nextDouble();
		
		System.out.print("Enter the second width: ");
		double width2 = userinput.nextDouble();
		System.out.print("Enter the second length: ");
		double length2 = userinput.nextDouble();
		System.out.println("");

		
		Rectangle rectangle1 = new Rectangle(width1, length1);
		Rectangle rectangle2 = new Rectangle(width2, length2);
		
		System.out.println("Compare length and width ONLY.");
		System.out.println("Notation: 0 = same, 1 = different.");
		System.out.println(rectangle1.compareTo(rectangle2));
		
		System.out.println("");

		
		System.out.println("Compare area");
		System.out.println("Notation: 1 = first bigger, 0 = same, -1 = second bigger");
		System.out.println(rectangle1.compareToArea(rectangle2));
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle2.getArea());
	}
}
