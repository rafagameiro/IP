/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class TrafficLight {
	
	private boolean red;
	private boolean green;
	private boolean yellow;
	
	public TrafficLight(){
		red = true;
		green = false;
		yellow = false;
	}
	
	public boolean isRed(){
		return red;
	}
	public boolean isGreen(){
		return green;
	}
	public boolean isYellow(){
		return yellow;
	}
	public boolean pass(){
		return !isRed();
	}
	public boolean stop(){
		return isRed();
	}
	public void changeColor(){
		boolean oldred = this.red;
		boolean oldgreen = this.green;
		boolean oldyellow = this.yellow;
		red = oldyellow;
		green = oldred;
		yellow = oldgreen; 
	}

}
