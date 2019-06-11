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
		
		Triang t = new Triang();
		t.getX1();
		System.out.println(t.getX1());// 1.0 (double)
		t.getY2();
		System.out.println(t.getY2());// 4.0 (double)
		t.sideLength1();
		System.out.println(t.sideLength1());// 4.242640687119285 (double)
		t.sideLength2();
		System.out.println(t.sideLength2());// 3.1622776601683795 (double)
		t.perimeter();
		System.out.println(t.perimeter());// 5.702459173643832 (double)
		t.area();
		System.out.println(t.area());// 5.999999999999999 (double)

	}

}
