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
		
		TrafficLight t1 = new TrafficLight();
		
		t1.isGreen();
		System.out.println(t1.isGreen());//false
		t1.isRed();
		System.out.println(t1.isRed());//true
		t1.pass();
		System.out.println(t1.pass());//false
		t1.stop();
		System.out.println(t1.stop());//true
		t1.changeColor();
		t1.isYellow();
		System.out.println(t1.isYellow());//false
		t1.pass();
		System.out.println(t1.pass());//true
		t1.changeColor();
		t1.isGreen();
		System.out.println(t1.isGreen());//false
		t1.isYellow();
		System.out.println(t1.isYellow());//true
		t1.pass();
		System.out.println(t1.pass());//true
		t1.changeColor();
		t1.pass();
		System.out.println(t1.pass());//false
	}

}
