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
		
		Calculator c = new Calculator("mem1", "mem2");
		
		System.out.printf("%.2f\n", c.calculate("* (abs(round (-3.67)))(+ (mem1)(mem2))"));
		
		System.out.printf("%.2f\n", c.calculate("- (* (10.0)(12))(round (abs (-3.67)))"));
		
		c.getLastValue("mem1");
		
		System.out.printf("%.2f\n", c.calculate("* (floor (exp(log (2.356))))(-5.003)"));
		
		c.getLastValue("mem2");
		
		System.out.printf("%.2f\n", c.calculate("+ (/ (round(abs(mem2)))(100.0))(3)"));
		
		System.out.printf(c.mem.getName() + " %.2f\n", c.getMemoryValue());

		System.out.printf(c.mem2.getName() + " %.2f\n", c.getMemory2value());
		
		

	}

}
