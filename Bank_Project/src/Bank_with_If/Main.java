/**
 * 
 */
package Bank_with_If;

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
		SafeBankAccount ba1 = new SafeBankAccount(1000);
		ba1.getBalance();
		System.out.println(ba1.getBalance());//1000 (int)
		ba1.withdraw(1500);
		ba1.getBalance();
		System.out.println(ba1.getBalance());//800 (int)
		ba1.computeInterest();
		System.out.println(ba1.computeInterest());//8 (int)
		ba1.applyInterest();
		ba1.getBalance();
		System.out.println(ba1.getBalance());//808 (int)

	}

}
