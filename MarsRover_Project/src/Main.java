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
		
		MarsRover r = new MarsRover();
		
		r.getX();
		System.out.println(r.getX()); // 0 (int)
		r.getY();
		System.out.println(r.getY());// 0 (int)
		r.setHeading(90);
		r.moveForward(1.0);
		r.getX();
		System.out.println(r.getX());// 6.123233995736766E-17 (double)
		r.getY();
		System.out.println(r.getY());// 1.0 (double)
		r.moveForward(-2);
		r.getY();
		System.out.println(r.getY());// -1.0 (double)
		r.getX();
		System.out.println(r.getX());// -6.123233995736766E-17 (double)
		r.mark();
		r.moveForward(2);
		r.getDistance();
		System.out.println(r.getDistance());// 2.0 (double)
		r.setHeading(0);
		r.moveForward(2);
		r.getDistance();
		System.out.println(r.getDistance());// 2.8284271247461903 (double)

	}

}
