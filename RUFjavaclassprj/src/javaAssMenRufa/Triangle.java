package javaAssMenRufa;

public class Triangle implements Shape2D{
	private int base,height,sideA,sideC;
    private double area,perimeter; 
    
	public void setBase(int base) {
		this.base=base;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void setSideA(int sideA) {
		this.sideA=sideA;
	}
	public void setSideC(int sideC) {
		this.sideC=sideC;
	}
	public void area() {
		setArea(0.5*base*height);
		
	}

	
	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public void perimeter() {
		
		setPerimeter(base+sideA+sideC);
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public void display() {
		System.out.println("Area of Triangle: "+area);
		System.out.println("Perimeter of Triangle: "+perimeter);
		
	}

}
