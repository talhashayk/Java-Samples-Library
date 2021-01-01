
public abstract class Circle extends Shape{

	public boolean overlap(Circle c) {
		double sSq = Math.pow(getX() - c.getX(), 2) + Math.pow(getY() - c.getY(), 2);
		double sumR = getRadius() + c.getRadius();
		return sumR > Math.pow(sSq, 0.5);
	}

	public abstract void setArea(double area);
	public abstract double getRadius();
	public abstract void setRadius(double radius);
	

}
