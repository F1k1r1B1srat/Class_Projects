package group_assignment_with_fi;

public class Sphere implements ThreeDimentionalShape {
	private double rad, surf, vol;

	public void surfaceArea() {
		surf = 4 * PI * (rad * rad);
	}

	public void volume() {
		vol = (4 / 3) * PI * (rad * rad * rad);
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
}

class Cylinder implements ThreeDimentionalShape {
	private double rad, height, surf, vol;

	public void surfaceArea() {
		surf = 2 * PI * rad * (rad + height);
	}

	public void volume() {
		vol = PI * (rad * rad) * height;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
}
class Cone implements ThreeDimentionalShape {
	private double rad, height, surf, vol;

	public void surfaceArea() {
		surf =  PI * rad * (rad + Math.sqrt((rad*rad)+(height*height)));
	}

	public void volume() {
		vol = (1/3)* PI* (rad * rad) * height;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
}
class Cube implements ThreeDimentionalShape {
	private double sideLength,surf,vol;
	public void surfaceArea() {
		surf = 6*(sideLength*sideLength) ;
	}
	public void setSide(double s) {
	sideLength=s;
	
	}	
	public double setSide() {
		return sideLength;
		
		}	
	public void volume() {
		vol = sideLength*sideLength*sideLength;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
}

