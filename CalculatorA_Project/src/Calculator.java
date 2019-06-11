/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;



public class Calculator {
	public static final int DEFAULT_VALUE = -1;
	public static final String DEFAULT_STRING = "";
	
	//Variables
	/**
	 * It creates two memories without defining them;
	 * Creates a double value that will save the last calculated value;
	 */ 
	Memory mem;
	Memory mem2;
	private double result;
	
	//Constructor
		/**
		 * Creates a calculator with zero, one and two memories;
		 * The variables are defined;
		 * 
		 * The parameters are only applied when one or two memories are created;
		 * @param name
		 * String inserted by the user;
		 *  @param name2
		 *  String inserted by the user;
		 */
	public Calculator(){
		result = 0;
	}
	public Calculator(String name){
		result = 0;
		mem = new Memory(name);
		mem2 = null;		
	}
	public Calculator(String name, String name2){
		result = 0;
		mem = new Memory(name);
		mem2 = new Memory(name2);
	}
	
	//interface
		/**
		 * Depending on the operator, a different expression will be calculated;
		 * 
		 * @return 
		 * Result of a calculated expression;
		 * @param unary
		 * It correspond to a operator;
		 * @param exp
		 * It corresponds to a numerator;
		 * @param exp2
		 * It corresponds to a numerator;
		 */
	public double binaryFunction(String unary, double exp, double exp2){
		double res = 0;
		switch(unary){
		case "+":
			res = exp + exp2;
			result = res;
			break;
		case "-":
			res = exp - exp2;
			result = res;
			break;
		case "*": 
			res = exp * exp2;
			result = res;
			break;
		case "/":
			res = exp / exp2;
			result = res;
			break;
	}
		return res;
	}
	
	/**
	 * Depending on the operator, a different expression will be calculated;
	 * 
	 * @return 
	 * Result of a calculated expression;
	 * @param op
	 * It correspond to a operator;
	 * @param exp
	 * It corresponds to a numerator;
	 */
	public double unaryFunction(String op, double exp){
		double res = 0;
		switch(op){
		case "abs":	
			res = Math.abs(exp);
			result = res;
			break;
		case "sin":
			res = Math.sin(exp);
			result = res;
			break;
		case "cos":
			res = Math.cos(exp);
			result = res;
			break;
		case "pow":
			res = Math.pow(Math.E, exp);
			result = res;
			break;
		case "log": 
			res = Math.log(exp);
			result = res;
			break;
		case "round":
			res = Math.round(exp);
			result = res;
			break;
		case "ceil":
			res = Math.ceil(exp);
			result = res;
			break;
		case "floor":
			res = Math.floor(exp);
			result = res;
			break;
	}
		return res;
	}
	
	/**
	 * This method will give the last calculated value to a memory;
	 * 
	 * @param name
	 * The inserted String will be compared with the memories name;
	 * @return
	 * It will return the value of the memory, which name is equal to the inserted String;
	 * If the inserted String is not equal to any of the memories names then it will return DEFAULT_VALUE;
	 */
	public double giveLastValue(String name){
		if (mem.getName() == name){
			mem.setValue(result);
			return mem.getValue();
		}else if(mem2.getName() == name){
			mem2.setValue(result);
			return mem2.getValue();
		}
		return DEFAULT_VALUE;
	}
	
	/**
	 * This method will return the memory value depending on the inserted String;
	 * 
	 * @param name
	 * It is the inserted String that will be compared with the memories name;
	 * @return
	 * It will return the value of the memory, which name is equal to the inserted String;
	 * If the inserted String is not equal to any of the memories names then it will return DEFAULT_VALUE;
	 */
	public double memoryValue(String name){
		if (mem.getName() == name){
			return mem.getValue();
		}else if(mem2.getName() == name){
			return mem2.getValue();
		}
		return DEFAULT_VALUE;
	}
	
	/**
	 * This method will return the memory name depending on the inserted double;
	 * 
	 * @param num
	 * It is the double that will be compared with the memories value;
	 * @return
	 * Depending on the inserted double it will return the name of the memory, which value matches with the insert double;
	 */
	public String memoryName(double num){
		if (num == mem.getValue()){
			return mem.getName();
		}else if (num == mem2.getValue()){
			return mem2.getName();
		}
		return DEFAULT_STRING;
	}
	

}
