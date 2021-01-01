
public class UsingShape {

	public static void main(String[] args) {
		
		Circle c = new CircleByArea();
		c.setRadius(1);
		
		Circle d = new CircleByRadius();
		d.setRadius(1);
		
		Circle e = new CircleByArea();
		e.setX(10);
		e.setY(10);
		
		Circle f = new CircleByRadius();
		
		System.out.println("c overlaps d: " + c.overlap(d));
		System.out.println("e overlaps f: " + e.overlap(f));
		
		/*Rectangle r = new Rectangle();
		r.setY(2);
		r.setHeight(4);
		
		Square s = new Square();
		s.setX(4);
		s.setHeight(4);
		
		System.out.println(String.format("Circle (%s, %s, %s)",
							c.getX(),c.getY(),c.getRadius()));
		
		System.out.println(String.format("Rectangle (%s, %s, %s, %s)",
				r.getX(),r.getY(),r.getWidth(),r.getHeight()));
		
		System.out.println(String.format("Square (%s, %s, %s, %s)",
				s.getX(),s.getY(),s.getWidth(),s.getHeight()));*/
		
	}

}
