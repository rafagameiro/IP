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
		
		Sensor s1 = new Sensor();
		Sensor s2 = new Sensor();
		
		s1.IsMoving();
		System.out.println(s1.IsMoving());//false
		s2.IsMoving();
		System.out.println(s2.IsMoving());//false
		s1.move();
		s1.IsMoving();
		System.out.println(s1.IsMoving());//true
		s2.IsMoving();
		System.out.println(s2.IsMoving());//false
		s2.stop();
		s2.IsMoving();
		System.out.println(s2.IsMoving());//false
		s2.move();
		s2.IsMoving();
		System.out.println(s2.IsMoving());//true
		s2.stop();
		s2.IsMoving();
		System.out.println(s2.IsMoving());//false
		

	}

}
