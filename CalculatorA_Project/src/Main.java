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

		
		System.out.printf("%.2f\n", c.memoryValue("mem1"));
		
		System.out.printf("%.2f\n", c.memoryValue("mem2"));
			
		System.out.printf("%.2f\n", c.binaryFunction("+", 0.45, 5));

		c.giveLastValue("mem1");

		System.out.printf("%.2f\n", c.binaryFunction("-",5, 1.50));

		System.out.printf("%.2f\n", c.unaryFunction("sin",45));
		
		c.giveLastValue("mem2");

		System.out.printf("%.2f\n", c.memoryValue("mem1"));
		
		System.out.printf("%.2f\n", c.memoryValue("mem2"));
		
		System.out.printf("%.2f\n", c.binaryFunction("-",5, -0.45));

		c.giveLastValue("mem1");

		System.out.printf("%.2f\n", c.binaryFunction("-", 5, 5.5));

		System.out.printf("%.2f\n", c.unaryFunction("cos",45));

		c.giveLastValue("mem2");

		System.out.printf("%.2f\n", c.unaryFunction("abs",-23.765));

		System.out.printf("%.2f\n", c.binaryFunction("/",1, 3));

		System.out.printf(c.mem.getName() + " %.2f\n", c.memoryValue("mem1"));

		System.out.printf(c.mem2.getName() + " %.2f\n", c.memoryValue("mem2"));

	}

}
