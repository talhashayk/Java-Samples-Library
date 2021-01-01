
public class CircleByRadius extends Circle {

	private double r;

	public double getArea() {
		return Math.pow(r, 2) * Math.PI;
	}

	public void setArea(double area) {
		this.r = Math.pow(area / Math.PI, 0.5);
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getRadius() {
		return r;
	}
	
}
