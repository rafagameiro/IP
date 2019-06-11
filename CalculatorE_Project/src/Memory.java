/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Memory {
	
	private String memName;
	private double memValue;
	
	/**
	 * It defines the created memory;
	 * 
	 * @param name
	 * The inserted name will be the name of the new memory; 
	 */
	public Memory(String name){
		memName = name;
		memValue = 0;
	}
	
	/**
	 * The method will set a memory name through the inserted double;
	 * 
	 * @param num
	 * The inserted value will be equal to memory value;
	 */
	public void setValue(double num){
		memValue = num;
		
	}
	
	/**
	 * getValue
	 * 
	 * @return
	 * It will return the value of a memory;
	 */
	public double getValue(){
		return memValue;
	}
	
	/**
	 * getName
	 * 
	 * @return
	 * Is will return the name of a memory;
	 */
	public String getName(){
		return memName;
	}
}
