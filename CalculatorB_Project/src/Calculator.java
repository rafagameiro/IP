/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;
	
public class Calculator {
	//Constantes
	public static final String SUM = "+";
	public static final String SUB = "-";
	public static final String MULTI = "*";
	public static final String DIV = "/";
	public static final String ABS = "abs";
	public static final String SIN = "sin";
	public static final String COS = "cos";
	public static final String EXP = "exp";
	public static final String LOG = "log";
	public static final String ROUND = "round";
	public static final String CEIL = "ceil";
	public static final String FLOOR = "floor";

	//Variables
		/**
		 * It creates two memories without defining them;
		 * Creates a double value that will save the last calculated value;
		 * Creates a int numOfMem that will give the number of memories created;
		 */ 
	Memory mem;
	Memory mem2;
	private double value;
	private int numOfMem;
	
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

		value = 0;
		numOfMem = 0;
	}
	public Calculator(String name){
		value = 0;
		mem = new Memory(name);
		mem2 = null;
		numOfMem = 1;
	}
	public Calculator(String name, String name2){
		value = 0;
		mem = new Memory(name);
		mem2 = new Memory(name2);
		numOfMem = 2;
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
		case SUM:
			res = exp + exp2;
			break;
		case SUB:
			res = exp - exp2;
			break;
		case MULTI: 
			res = exp * exp2;
			break;
		case DIV:
			res = exp / exp2;
			break;

	}
		value = res;
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
		case ABS:	
			res = Math.abs(exp);
			value = res;
			break;
		case SIN:
			res = Math.sin(exp);
			value = res;
			break;
		case COS:
			res = Math.cos(exp);
			value = res;
			break;
		case EXP:
			res = Math.exp(exp);
			value = res;
			break;
		case LOG: 
			res = Math.log(exp);
			value = res;
			break;
		case ROUND:
			res = Math.round(exp);
			value = res;
			break;
		case CEIL:
			res = Math.ceil(exp);
			value = res;
			break;
		case FLOOR:
			res = Math.floor(exp);
			value = res;
	}
		return res;
	}
	/**
	 * Compares a String with the different binary operators;
	 * 
	 * @return 
	 * It returns true if any of the operators are equal to the inserted String;
	 * @param op
	 * It is the String inserted by the user;
	 */
	public boolean isBinary(String op){
		return op.equals(SUM) || op.equals(SUB) || op.equals(MULTI) || op.equals(DIV);	
	}
	
	/**
	 * Compares a String with the different unary operators;
	 * 
	 * @return 
	 * It returns true if any of the operators are equal to the inserted String;
	 * @param op
	 * It is the String inserted by the user;
	 */
	public boolean isUnary(String op){
		return op.equals(ABS) || op.equals(LOG) || op.equals(EXP) || op.equals(SIN) || op.equals(COS) || op.equals(ROUND) || op.equals(CEIL) || op.equals(FLOOR);
	}
	/**
	 * getMemoryName
	 * 
	 * @return
	 * If there is not memory one name then it will return null;
	 * If the memory one exists it will return its name;
	 */
	public String getMemoryName(){
		if(mem == null){
			return null;
		}else 
		return mem.getName();
	}
	/**
	 * getMemory2Name
	 * 
	 * @return
	 * If there is not memory two name then it will return null;
	 * If the memory two exists it will return its name;
	 */
	public String getMemory2Name(){
		if(mem2 == null){
			return null;
		}else
		return mem2.getName();
	}
	/**
	 * getMemoryValue
	 * 
	 * @return
	 * Returns the value of the memory one;
	 */
	public double getMemoryValue(){
		return mem.getValue();
	}
	/**
	 * getMemory2Value
	 * 
	 * @return
	 * Returns the value of the memory two;
	 */
	public double getMemory2value(){
		return mem2.getValue();
	}
	
	/**
	 * This method will give the last calculated value to a memory;
	 * 
	 * @param name
	 * The inserted String will be compared with the memories name;
	 * @return
	 * It will return the value of the memory, which name is equal to the inserted String;
	 */
	public double giveLastValue(String name){
		if (name.equals(mem.getName())){
			mem.setValue(value);
			return mem.getValue();
		}else 
			mem2.setValue(value);
		return mem2.getValue();
	}
	
	/**
	 * numOfMem
	 * 
	 * @return
	 * Return the number of created memories;
	 */
	public int numOfMem(){
		return numOfMem;
	}
	/**
	 * 
	 * A expression will be compared to different cases where it will, depending on the case, be calculated;
	 * 
	 * @param exp
	 * It is the inserted expression inserted by the user that will be compared with the different cases;
	 * @return
	 * Returns the result of the inserted expression;
	 */
	public double calculate(String exp){
		exp = exp.trim();
		double result = 0;
		if(Utilities.isDoubleValue(exp)){
		    result = Double.parseDouble(exp);
		}else if(exp.equals(getMemoryName())){
			result = mem.getValue();
		}else if(exp.equals(getMemory2Name())){
			result = mem2.getValue();	
		}else{
			String op = "";
			String num;
			String num2;
			op = exp.substring(0, exp.indexOf("("));
			op = op.trim();
		
		if(isBinary(op)){
			double value1 = 0;
			double value2 = 0;
			num = exp.substring(exp.indexOf("(") + 1, exp.indexOf(")")).trim();
			value1 = calculate(num);
			num2 = exp.substring(exp.lastIndexOf("(") + 1, exp.lastIndexOf(")")).trim();
			value2 = calculate(num2);
			result = binaryFunction(op, value1, value2);
			
		   }else if(isUnary(op)){
		    	double value1 = 0;
		    	num = exp.substring(exp.indexOf("(") + 1, exp.indexOf(")")).trim();	
		    	value1 = calculate(num);
		    	result = unaryFunction(op,value1);
		  }  	
		}	
		value = result;
		return result;
	}  
}
	
