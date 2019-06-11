/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Sensor {
	
	private boolean SensorIsMoving;
	
	public Sensor(){
		
		SensorIsMoving = false;
	}
	
	public void move(){
		SensorIsMoving = true;
	}
	
	public void stop(){
		SensorIsMoving = false;
	}
	
	public boolean IsMoving(){
		return SensorIsMoving;
	}

}
