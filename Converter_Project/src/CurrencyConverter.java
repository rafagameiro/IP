/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class CurrencyConverter {
	
	private int USD;
	private int EUR;
	private int GBP;
	
	public CurrencyConverter(){
		EUR = 0;
		USD = 0;
		GBP = 0;
	}
	
	public void setInEuro(int amount){
		EUR = amount;
		USD = (int ) (amount / 0.70);
		GBP = (int ) (amount * 0.69);
		//Pre: amount > 0;
	}	
	public void setInDollar(int amount){
		USD = amount;
		EUR = (int ) (amount / 0.70);
		GBP = (int ) ((amount / 0.70) / 0.69);
		//Pre: amount > 0;
	}
	public void setInPound(int amount){
		GBP = amount;
		EUR = (int ) (amount / 0.69);
		USD = (int ) ((amount / 0.70) / 0.69);
		//Pre: amount > 0;
	}
	
	public int getInEuro(){
		return EUR;
	}
	public int getInDollar(){
		return USD;
	}
	public int getInPound(){
		return GBP;
	}

}
