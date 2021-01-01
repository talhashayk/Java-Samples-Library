
public class Square extends Rectangle {

	public void setWidth(double width) {
		setSide(width);
	}
	public void setHeight(double height) {
		setSide(height);
	}
	public void setSide(double size) {
		super.setHeight(size);
		super.setWidth(size);
	}
	public double getSide() {
		return getHeight();
	}
}
