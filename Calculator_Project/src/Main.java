/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String VALUE = "VM";
	public static final String MEMORY_NAME = "LM";
	public static final String EXP_VALUE = "CE";
	public static final String GIVE_VALUE = "AVM";
	public static final String HELP = "A";
	public static final String LEAVE = "S";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String option = "";
        String name = " ";
		Calculator c = defineCalculator(in);
			
			option = readcommand(in);
			
		while(!option.equals(LEAVE))
		{			
			
		if (option.equals(VALUE)){
		processValue(c,name);
		} else if(option.equals(MEMORY_NAME)){
			processName(c);	
		}else if(option.equals(EXP_VALUE)){
			processExp(c,in);
		}else if(option.equals(GIVE_VALUE)){
			processGive(c,name);
		}else if (option.equals(HELP)){
			processHelp();
		}else if(option.equals(LEAVE)){
			processExit();
		}else{
			System.out.println("Opcao inexistente.");
		}	
		
		in.nextLine();
		}
		in.close();
	}

	private static Calculator defineCalculator(Scanner in) {
		// TODO Auto-generated method stub
	Calculator c = null;
	String mem = null;
	 String mem2 = null;	
	 
		if (in.hasNext()){
		   String line = in.nextLine().trim();
		   if(line.isEmpty()){
			   c = new Calculator();
		   }else{
			   int i = line.indexOf(" ");
			   if (i == -1){
				  c = new Calculator(line); 
			   }else{
		
				   mem = line.substring(0, i).trim();
				   mem2 = line.substring(i + 1).trim();
				   if(mem.equalsIgnoreCase(mem2)){
					   c = new Calculator(mem);
				   }else
					   c = new Calculator(mem, mem2);
			   	}
		   }
	   } 
		return c; 
	}
		

	private static void processValue(Calculator c, String name) {
		// TODO Auto-generated method stub
		if(c.getMemoryName() == name){
			System.out.printf(c.getMemoryName() + ": %.2f\n",c.getMemoryValue());
		}else if(c.getMemory2Name() == name){
			System.out.printf(c.getMemory2Name() + ": %.2f\n",c.getMemory2value());
		}else
			System.out.println("Memoria nao existente.");
	
	}

	private static void processName(Calculator c) {
		// TODO Auto-generated method stub
		System.out.printf(c.getMemoryName() + ": %.2f\n",  + c.getMemoryValue());
		System.out.printf(c.getMemory2Name() + ": %.2f\n",  + c.getMemory2value());
		
	}

	private static void processExp(Calculator c, Scanner in) {
		// TODO Auto-generated method stub
		String exp;
		exp = in.nextLine();
		System.out.printf( "Resultado: " + "%.2f\n",c.calculate(exp));
		in.nextLine();
	}
	
	private static void processGive(Calculator c, String name) {
		// TODO Auto-generated method stub
		c.getLastValue(name);
	}

	private static String readcommand(Scanner in) {
		// TODO Auto-generated method stub
		String op;
		System.out.println("VM - Consultar o valor da memoria");
		System.out.println("LM - Indicar o nome das memorias");
		System.out.println("CE - Calcular o valor duma expressao");
		System.out.println("AVM - Atribuir ultimo valor calculado a memoria");
		System.out.println("A - Ajuda");
		System.out.println("S - Sair");
		op = in.next().toUpperCase();
		return op;
	}
	
	private static void processHelp() {
		// TODO Auto-generated method stub
		System.out.println("VM - Consultar o valor da memoria");
		System.out.println("LM - Indicar o nome das memorias");
		System.out.println("CE - Calcular o valor duma expressao");
		System.out.println("AVM - Atribuir ultimo valor calculado a memoria");
		System.out.println("A - Ajuda");
		System.out.println("S - Sair");
	}
	
	private static void processExit() {
		// TODO Auto-generated method stub
		System.out.println("Aplicacao terminada. Ate a proxima.");
	}
	

	

}

