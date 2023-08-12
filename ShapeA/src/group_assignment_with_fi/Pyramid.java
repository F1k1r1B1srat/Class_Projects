package group_assignment_with_fi;

public abstract class Pyramid implements ThreeDimentionalShape{
	protected double surf,vol,baseArea,sq_side,pyramheight, lateral_area;
	public abstract void surfaceArea();
	public abstract void volume();
	//public abstract void perimeter();
}

class TriangularPyramid extends Pyramid implements Shapes{
	private double tribase, triheight;
	public void surfaceArea() {
		area();
		area(pyramheight);// trying to overload
		perimeter();
		
		surf=baseArea+lateral_area;
	}
	public void volume() {
		vol= (baseArea*pyramheight)/2;
	}
	public void area(double x) {
		lateral_area=0.5*(tribase*x);
	}
	public void area() {
		baseArea=0.5*tribase*triheight;
	}
	public void perimeter() {
		lateral_area*=3;
	}
	public double getTribase() {
		return tribase;
	}
	public void setTribase(double tribase) {
		this.tribase = tribase;
	}
	public double getTriheight() {
		return triheight;
	}
	public void setTriheight(double triheight) {
		this.triheight = triheight;
	}
	public double getPyramheight() {
		return pyramheight;
	}
	public void setPyramheight(double pyramheight) {
		this.pyramheight = pyramheight;
	}
	public double getBaseArea() {
		return baseArea;
	}
	public double getLateral_area() {
		return lateral_area;
	}
	public double getSurf() {
		return surf;
	}
	public double getVol() {
		return vol;
	}
}

class SquarePyramid extends Pyramid implements Shapes{

	public void surfaceArea() {
		area();
		area(pyramheight);// trying to overload
		perimeter();
		
		surf=baseArea+lateral_area;
	}
	public void volume() {
		vol= (baseArea*pyramheight)/2;
	}
	 void area(double x) {
		lateral_area=0.5*(sq_side*x);
	}
	public void area() {
		baseArea=sq_side*sq_side;
	}
	public void perimeter() {
		lateral_area*=4;
	}
}
