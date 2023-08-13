package javaAssMenRufa;

public class Circle implements Shape2D{

	private final double PI=3.14;
	private double radius,area,perimeter;
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public void area() {
	
		setArea(radius*PI*radius);
		
	}

	
	public void perimeter() {
		setPerimeter(2*PI*radius);
		
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double parameter) {
		this.perimeter = parameter;
	}


	
	public void display() {
		System.out.println("Area of Circle: "+area);
		System.out.println("Perimeter of Circle: "+perimeter);
		
	}


	
	}
 
	



