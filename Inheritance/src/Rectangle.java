
public class Rectangle extends Shape{

	private double height;
	private double width;
	
	public double getArea() {
		return getHeight() * getWidth();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
