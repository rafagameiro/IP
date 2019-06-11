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
		
		Contador c1 = new Contador();
		
		c1.status();
		System.out.println(c1.status());
		c1.dec();
		c1.status();
		System.out.println(c1.status());
		c1.inc();
		c1.status();
		System.out.println(c1.status());
		c1.reset();
		c1.status();
		System.out.println(c1.status());
    
	}

}
