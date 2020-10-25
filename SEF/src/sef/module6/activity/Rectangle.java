package sef.module6.activity;

public class Rectangle extends Shape {

	// Atributes
	private double lenght;
	private double breadth;
	
	//Behavior - default constructor
	public Rectangle(){ 
		System.out.println("I'm Student_I constructor");
	}
	
	//Parameterized constructor
	public Rectangle (double length, double breadth) {
		this.breadth = breadth; 
		this.lenght = length;
	}
	
	public double calculateArea() {
		return lenght * breadth;
	} 
	
	public double calculatePerimeter() {
		return 2 * (lenght + breadth);
	}
}
	
		
