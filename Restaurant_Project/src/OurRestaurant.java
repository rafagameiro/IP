/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class OurRestaurant {
	
	/** Constants **/
	public static final float MENU = 10.00f;
	// Declare constants here
	/** Instance variables **/
	private int menuMeatN;
	private int menuFishN;
	private int menuMeatR;
	private int menuFishR;
	private float meatPrice;
	private float fishPrice;
	
	// Define instance variables here
	/**
	* Constructor
	* @param menuFish cost of the fish menu
	* @param menuMeat cost of the meat menu
	*/
	public OurRestaurant(float menuFish, float menuMeat){
	 meatPrice = menuMeat;
	 fishPrice = menuFish;
	 menuMeatN = 0;
	 menuMeatR = 0;
	 menuFishN = 0;
	 menuFishR = 0;
	}
	
	/**
	* Order menus, compute the total price,
	* considering discounts, where applicable.
	*
	* @param numberOfFish number of requested fish menus
	* @param numberOfMeat number of requested meat menus
	* @return value to pay
	*/
	public float request(int numberOfFish, int numberOfMeat){
		float sales;
		if (numberOfFish > 2 && numberOfMeat > 2){
			menuMeatR = numberOfMeat;
			menuFishR = numberOfFish;
			sales = menuMeatR * (MENU * 0.8f) + menuFishR * (MENU * 0.8f);
		} else {
			menuMeatN = numberOfMeat;
			menuFishN = numberOfFish;
			sales = menuMeatN * MENU + menuFishN * MENU;
		}
		return sales;
	}
	
	/**
	* Get the number of menus sold at a normal price
	* @return the number of menus sold at a normal price
	*/
	public int normalMenus(){
		return menuFishN + menuMeatN;
	
	}
	/**
	* Get the number of menus sold at a reduced price
	* @return the number of menus sold at a reduced price
	*/
	public int reducedMenus(){
	 return menuFishR + menuMeatR;
	}
	
	/**
	* Compute the total money, in Euros, obtained from the sales
	* @return the total money, in Euros, obtained from the sales
	*/
	public float cash(){
	return menuMeatR * (MENU * 0.8f) + menuFishR * (MENU * 0.8f) + menuMeatN * MENU + menuFishN * MENU;
	}
	/**
	* Compute the value of taxes to pay, in Euros (IVA at 23%)
	* @return the value in Euros of the IVA tax to pay
	*/
	public float iva(){
	 return this.cash() * 0.23f;
	}
	
	/**
	* Compute the restaurant profit, considering the cost of
	* the menus, the sales at normal and reduced costs, and
	* the IVA tax at 23%
	* @return profit value, in Euros
	*/
	public float profit(){
	 return this.cash() - (this.iva() + meatPrice * (menuMeatN + menuMeatR) + fishPrice * (menuFishN + menuFishR));
	}
	
	/**
	* Check if the restaurant had a profit
	* @return true, if the restaurant had a profit,
	* or false, otherwise
	*/
	public boolean hasProfit(){
	 return this.profit() > 0;
	}

	
	

}
