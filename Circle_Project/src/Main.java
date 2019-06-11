/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.getRadius();
		System.out.println(c.getRadius());
		c.getArea();
		System.out.println(c.getArea());
		c.translate(1, 1);
		c.getArea();
		System.out.println(c.getArea());
		c.IsThere(-1, -1);
		System.out.println(c.IsThere(-1, -1));
		c.getX();
		System.out.println(c.getX());
		c.getY();
		System.out.println(c.getY());
		
		Circle d = new Circle(1,1,10);
		d.getArea();
		System.out.println(d.getArea());
		d.translate(1, 2);
		d.getX();
		System.out.println(d.getX());
		d.getY();
		System.out.println(d.getY());
		d.getArea();
		System.out.println(d.getArea());
		
		Circle e = new Circle(5);
		e.getRadius();
		System.out.println(e.getRadius());
		

	}

}
