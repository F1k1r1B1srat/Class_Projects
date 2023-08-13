package javaAssMenRufa;

public class Rectangle extends Square implements Shape2D{
private int area,perimeter,width;
	public void setLength(int length) {
		super.length=length;
	}
	public int getLength() {
		return super.length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void area() {
		setArea(length*width);
		
	}

	
	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public void perimeter() {
		setPerimeter(2*(length+width));
		
	}

	
	public int getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}


	public void display() {
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+perimeter);
		
	}

}
