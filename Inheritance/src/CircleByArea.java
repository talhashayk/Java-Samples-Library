
public class CircleByArea extends Circle{

	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setRadius(double r) {
		this.area = Math.pow(r, 2) * Math.PI;
	}
	
	public double getRadius() {
		return Math.pow(area / Math.PI, 0.5);
	}
	
}
