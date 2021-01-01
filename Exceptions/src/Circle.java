
public class Circle {
	
	private int r;

	public void setRadius(int r) {
		if (r < 0) {
			throw new IllegalArgumentException("radius must be positive.");
		}
		this.r = r;
	}

	public int getRadius() {
		return r;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Circle c = new Circle();
		try {
			c.setRadius(-10);
		} catch (IllegalArgumentException iae) {
			System.out.println("Caught first exception");
		}

		try {
			c.setRadius(10);
		} catch (IllegalArgumentException iae) {
			System.out.println("Caught second exception");
		}

		System.out.println(c.getRadius());

		try {
			System.out.println("Hello");
			Thread.sleep(1000);
			System.out.println("Goodbye");
		} catch (InterruptedException iae) {
			System.out.println("Sleeping was interrupted");
		}

		count();
	}

	public static void count() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);

		}
	}
}
