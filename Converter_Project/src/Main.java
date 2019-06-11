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
		
		CurrencyConverter c = new CurrencyConverter();
		
		c.setInEuro(100);
		c.getInEuro();
		System.out.println(c.getInEuro());// 100
		c.getInDollar();
		System.out.println(c.getInDollar());// 143
		c.getInPound();
		System.out.println(c.getInPound());// 69
		c.setInPound(200);
		c.getInEuro();
		System.out.println(c.getInEuro());// 290
		c.getInDollar();
		System.out.println(c.getInDollar());// 414
		c.getInPound();
		System.out.println(c.getInPound());// 200
		

	}

}
