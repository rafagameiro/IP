/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {
	
	//
	/**
	 * Selecting the "VM " option it will verify the number of created memories and then depending on the inserted expression it will print the number and value of a memory;
	 * 
	 * @param c
	 * It will evoke calculator methods;
	 * @param in
	 * The user will be able to insert a expression that will be compared with the memories name;
	 */
	private static void processMemory(Calculator c, Scanner in) {
		// TODO Auto-generated method stub
		String name = in.next();
		if(c.numOfMem() == 0){
			System.out.println("Memoria nao existente.");
		}else if(c.numOfMem() == 1){
			if(name.equals(c.getMemoryName())){
				System.out.printf(c.getMemoryName() + ": %.2f\n", c.getMemoryValue());
			}else 
				System.out.println("Memoria nao existente.");			
		}else if(c.numOfMem() == 2){
			if(name.equals(c.getMemoryName())){
				System.out.printf(c.getMemoryName() + ": %.2f\n", c.getMemoryValue());
			}else if(name.equals(c.getMemory2Name())){
				System.out.printf(c.getMemory2Name() + ": %.2f\n", c.getMemory2value());
			}else
				System.out.println("Memoria nao existente.");	
			
		}	
	}
    /**
     * Selecting the "LM" option the method will verify the number of existing memories and print the number and value of all created memories;
     * 
     * @param c
     * It will evoke calculator methods;
     */
	private static void processName(Calculator c) {
		// TODO Auto-generated method stub
		if(c.numOfMem() == 0){
			System.out.println("Calculadora sem memorias.");
		}else if(c.numOfMem() == 1){
			System.out.printf(c.getMemoryName() + ": %.2f\n", c.getMemoryValue());
		}else if(c.numOfMem() == 2){
			System.out.printf(c.getMemoryName() + ": %.2f\n", c.getMemoryValue());
			System.out.printf(c.getMemory2Name() + ": %.2f\n", c.getMemory2value());
		}
	}
    
	/**
	 * Selecting "CE" option a method will calculate an expression inserted by the user;
	 * 
	 * @param c
	 * It will evoke Calculator methods;
	 * @param in
	 * The user will insert an expression that will be calculated through Calculator methods;
	 */
	private static void processCalcule(Calculator c, Scanner in) {
		// TODO Auto-generated method stub
		String exp;
		exp = in.nextLine();
		System.out.printf("resultado: %.2f\n", c.calculate(exp));
	}
	
	/**
	 * Selecting "AVM" option a method will give the last calculated value to a memory, depending on the inserted expression;
     *
	 * @param c
	 * It will evoke calculator methods;
	 * @param in
	 * The user will write a name that will be compared with the memories name;
	 */
	private static void processGive(Calculator c, Scanner in) {
		// TODO Auto-generated method stub
		String name = in.next();
		if(c.numOfMem() == 0){
			System.out.println("Memoria nao existente.");
		}else if(c.numOfMem() == 1){
			if(name.equals(c.getMemoryName())){
				c.getLastValue(name);
			}else 
				System.out.println("Memoria nao existente.");
		}else if(c.numOfMem() == 2){
            if(name.equals(c.getMemoryName())){
            	c.getLastValue(name);
            }else if(name.equals(c.getMemory2Name())){
				c.getLastValue(name);
			}else
				System.out.println("Memoria nao existente.");
		}
	}
	/**
	 * Selecting "A" option the method will print the available options and what they mean;
     */
	private static void processHelp() {
		// TODO Auto-generated method stub
		System.out.println("VM - Consultar o valor da memoria");
		System.out.println("LM - Indicar o nome das memorias");
		System.out.println("CE - Calcular o valor duma expressao");
		System.out.println("AVM - Atribuir ultimo valor calculado a memoria");
		System.out.println("A - Ajuda");
		System.out.println("S - Sair");
	}
    /**
     * Selecting "S" option the method will terminate the program;
     */
	private static void processExit() {
		// TODO Auto-generated method stub
		System.out.println("Aplicacao terminada. Ate a proxima.");
	}
	
    /**
     * The method will select the inserted text by user and it will create one or two memories depending on the text;
     * If nothing is written then it will not create any memory;
     * 
     * @param in
     * It is the text inserted by user;
     * @return
     * It will define a calculator with zero, one or two memories depending on the inserted text;
     */
	private static Calculator defineCalculator(Scanner in) {
		// TODO Auto-generated method stub
		Calculator c = null;
		String mem;
		 String mem2;	
		 String line = in.nextLine();
		 line = line.trim();
			if (line.equals("")){
			    c = new Calculator();
			}else if(line.contains(" ")){
				mem = line.substring(0, line.indexOf(" "));
				mem = mem.trim();
				mem2 = line.substring(line.indexOf(" ") + 1);
				mem2 = mem2.trim();
				if(mem.equalsIgnoreCase(mem2)){
					c = new Calculator(mem);
				}else
					c = new Calculator(mem, mem2);
		   }else{
		 c = new Calculator(line);
	 }
			
	return c; 
	}
	
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		Scanner in = new Scanner(System.in);
		String option = "";
		Calculator c = defineCalculator(in);
		
		
		/**
		 * Starts operations until "S" option is selected;
		 * String option does not make difference between upper or lower case;
		 * If a option that is not registered is inserted it will print "Opcao inexistente.";
		 */
		while(!option.equals("S")){
			
			option = in.next().toUpperCase();
			
			switch(option){
			case "VM":processMemory(c, in);break;
			case "LM":processName(c);break;
			case "CE":processCalcule(c,in);break;
			case "AVM":processGive(c,in);break;
			case "A":processHelp();break;
			case "S":processExit();break;
			default:System.out.println("Opcao inexistente.");
			
			}	
		}
		
		in.close();

	}
	
}


