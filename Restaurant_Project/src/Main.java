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
		
		OurRestaurant myRest = new OurRestaurant(4.5f, 5.0f);
		
		myRest.cash();
		System.out.printf("%.2f\n", myRest.cash());//0.00 (float)
		myRest.iva();
		System.out.printf("%.2f\n", myRest.iva());//0.00 (float)
		myRest.profit();
		System.out.printf("%.2f\n", myRest.profit());//0.00 (float)
		myRest.hasProfit();
		System.out.println(myRest.hasProfit());//false (boolean)
		myRest.normalMenus();
		System.out.println(myRest.normalMenus());//0 (int)
		myRest.reducedMenus();
		System.out.println(myRest.reducedMenus());//0 (int)
		myRest.request(2, 1);
		System.out.printf("%.2f\n", myRest.request(2, 1));//30.00 (float)
		myRest.cash();
		System.out.printf("%.2f\n", myRest.cash());//30.00 (float)
		myRest.iva();
		System.out.printf("%.2f\n", myRest.iva());//6.90 (float)
		myRest.profit();
		System.out.printf("%.2f\n", myRest.profit());//9.10 (float)
		myRest.hasProfit();
		System.out.println(myRest.hasProfit());//true (boolean)
		myRest.normalMenus();
		System.out.println(myRest.normalMenus());//3 (int)
		myRest.reducedMenus();
		System.out.println(myRest.reducedMenus());//0 (int)
		myRest.request(4, 4);
		System.out.printf("%.2f\n", myRest.request(4, 4));//64.00 (float)
		myRest.cash();
		System.out.printf("%.2f\n", myRest.cash());//94.00 (float)
		myRest.iva();
		System.out.printf("%.2f\n", myRest.iva());//21.62 (float)
		myRest.profit();
		System.out.printf("%.2f\n", myRest.profit());//20.38 (float)
		myRest.hasProfit();
		System.out.println(myRest.hasProfit());//true (boolean)
		myRest.normalMenus();
		System.out.println(myRest.normalMenus());//3 (int)
		myRest.reducedMenus();
		System.out.println(myRest.reducedMenus());//8 (int)
		

	}

}
