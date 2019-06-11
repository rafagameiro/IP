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
		
		FairPlay fair1 = new FairPlay();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//true
		fair1.WeLost();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//false
		fair1.TheyLost();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//true
		fair1.WeLost();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//false
		fair1.WeDrew();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//false
		fair1.TheyDrew();
		fair1.IsHappy();
		System.out.println(fair1.IsHappy());//true
		

	}

}
