package javaAssMenRufa;

public class Square implements Shape2D{
 protected int length,area,perimeter;
 
	public void setLength(int length) {
		this.length=length;
	}
	public void area() {
		setArea(length*length);
		
	}

	
	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public void perimeter() {
		setPerimeter(4*length);
		
	}


	
	public int getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}


	public void display() {
		System.out.println("Area of Square: "+area);
		System.out.println("Perimeter of Square: "+perimeter);
		
	}

}
