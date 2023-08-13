package javaAssMenRufa;

public class Sphere implements Shapes3D {
	protected final double PI=3.14;
	protected double radius,volume,surfaceArea;
 
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void surfaceArea() {
		setSurfaceArea(4*PI*radius*radius);
		
	}

	
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public void volume() {
		setVolume((1.33)*PI*radius*radius*radius);
		
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public void display() {
		System.out.println("Surface Area of Sphere: "+surfaceArea);
		System.out.println("Volume of Sphere: "+volume);
	}

}
