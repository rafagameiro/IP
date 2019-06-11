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
		
		Diet d = new Diet();
		d.Balance();
		System.out.println(d.Balance());//0
		d.eattimes();
		System.out.println(d.eattimes());//0
		d.eat(50);
		d.eat(75);
		d.eattimes();
		System.out.println(d.eattimes());//2
		d.burntimes();
		System.out.println(d.burntimes());//0
		d.burn(20);
		d.Balance();
		System.out.println(d.Balance());//105
		d.eat(75);
		d.eat(100);
		d.burn(40);
		d.burn(30);
		d.Balance();
		System.out.println(d.Balance());//210
		d.eattimes();
		System.out.println(d.eattimes());//4
		d.burntimes();
		System.out.println(d.burntimes());//3
		d.averageEatenCalories();
		System.out.println(d.averageEatenCalories());//75.0
		d.averageBurntCalories();
		System.out.println(d.averageBurntCalories());//30.0
		d.IsBalanceNegative();
		System.out.println(d.IsBalanceNegative());//false
		

	}

}
