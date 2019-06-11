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
		
		Decathlon d = new Decathlon();
		d.Set100m(10.4f);
		d.getPoints() ;
		System.out.println(d.getPoints());// 999 (int)
		d.reset();
		d.getPoints() ;
		System.out.println(d.getPoints());// 0 (int)
		d.Set100m(10.4f);
		d.SetLongJump(736);
		d.getPoints() ;
		System.out.println(d.getPoints());// 1900 (int)
		d.SetShot(13.53f);
		d.getPoints() ;
		System.out.println(d.getPoints());// 2600 (int)
		d.SetHighJump(210);
		d.getPoints();
		System.out.println(d.getPoints());// 3497 (int)

	}

}
