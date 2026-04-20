package SkillBuilder;

public class Rectangle implements Comparable {
	private double width;
	private double length;
	
	
	
	public Rectangle(double w, double l) { //Constructor//
		width = w;
		length = l;
	}
	
	//Set the data//
	public void setWidth(double Width) {  //Modifier//
		width = Width;
	}
	public void setLength(double Length) {  
		length = Length;
	}
	
	//Get the data//
	public double getWidth() {  //Accessor//
		return width;
	}
	public double getLength() {
		return length;
	}
	
	
	//Area//
	public double getArea() {
		double area = width*length;
		return (area);
	}
	//Compare//
	public int compareTo(Object a) {
		Rectangle test = (Rectangle)a;
		
		if (getWidth() == test.getWidth() && getLength() == test.getLength()) {
			return (0);
		}
		else {
			return (1);
		}
	}
	public int compareToArea(Object b) {
		Rectangle testArea = (Rectangle)b;
		
		if (getArea() < testArea.getArea()) {
			return (-1);
		}
		else if (getArea() == testArea.getArea()) {
			return (0);
		}
		else {
			return (1);
		}
	}
 }
