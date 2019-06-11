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
		
		Ellipse c = new Ellipse();
		c.getBigRadius();
		System.out.println(c.getBigRadius());// 1.0 (double)
		c.getArea();
		System.out.println(c.getArea());// 3.141592653589793 (double)
		c.translate(1,1);
		c.getArea();
		System.out.println(c.getArea());// 3.141592653589793 (double)
		c.IsThere(-1,-1);
		System.out.println(c.IsThere(-1,-1));// false (boolean)
		c.getX();
		System.out.println(c.getX());// 1.0 (double)
		c.getY();
		System.out.println(c.getY());// 1.0 (double)

	}

}
