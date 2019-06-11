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
		
        Calculator c= new Calculator("mem1","mem2");

		System.out.printf("%.2f\n",c.calculate("/ (3) (4)"));
		
		System.out.printf("%.2f\n",c.calculate("+ (2) (3)"));
		
		c.giveLastValue("mem1");
		
		System.out.printf("%.2f\n", c.calculate("- (3.554)(3.55)"));
		
		System.out.printf("%.2f\n", c.calculate("* (mem1)(-1)"));
		
		c.giveLastValue("mem2");
		
		System.out.printf(c.mem.getName() + " %.2f\n", c.getMemoryValue());

		System.out.printf(c.mem2.getName() + " %.2f\n", c.getMemory2value());
		
		System.out.printf("%.2f\n", c.mem.getValue());
		
		System.out.printf("%.2f\n", c.mem2.getValue());
		
		System.out.printf("%.2f\n", c.calculate("39.003"));
		
		System.out.printf("%.2f\n", c.calculate("0"));
		
		c.giveLastValue("mem1");
		
		c.giveLastValue("mem2");
		
		System.out.printf("%.2f\n", c.calculate("abs (-23.4)"));
		
		c.giveLastValue("mem1");
		
		System.out.printf("%.2f\n", c.calculate("ceil (2.0001)"));
		
		c.giveLastValue("mem2");
		
        System.out.printf("%.2f\n", c.mem.getValue());
		
		System.out.printf("%.2f\n", c.mem2.getValue());
		
		System.out.printf("%.2f\n", c.calculate("3.14159"));
		
		System.out.printf("%.2f\n", c.calculate("+ (mem2)(mem1)"));
		
		System.out.printf(c.mem.getName() + " %.2f\n", c.getMemoryValue());

		System.out.printf(c.mem2.getName() + " %.2f\n", c.getMemory2value());
 
	}

}
