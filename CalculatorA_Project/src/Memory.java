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
	
	public Memory(String name){
		memName = name;
		memValue = 0;
	}
	
	public void setValue(double num){
		memValue = num;
		
	}
	public double getValue(){
		return memValue;
	}
	
	public String getName(){
		return memName;
	}
}



