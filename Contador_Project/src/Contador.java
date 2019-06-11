/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Contador {
	
	private int value;
	
	public Contador(){
		
		value = 0; 
		
	}
	
	public void inc(){
		value = value + 1;
	}
	
	public void dec(){
		value = value - 1;		
	}
	public void reset(){
		value = 0;
	}
	public int status(){
		return value;
	}
	


}
