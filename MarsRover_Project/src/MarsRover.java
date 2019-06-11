/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class MarsRover {
	
	private double X, cx;
	private double Y, cy;
	private double Heading;
	
	public MarsRover(){
		X = 0;
		Y = 0;
		Heading = 0;
		cx = 0;
		cy = 0;
	}
	
	public void moveForward(double distance){
		Y = distance;
		X = distance;
		//pre: distance > 0
	}
	
	public void setHeading(double angle){
		double oldX = this.getX();
		double oldY = this.getY();
		X = oldX + getDistance() * Math.cos(Math.toRadians(angle));
		Y = oldY + getDistance() * Math.sin(Math.toRadians(angle));
	}
	
	public void mark(){
		cx = X;
		cy = Y;
	}
	
	public double getDistance(){
		double distance;
		distance = X - cx;
		distance = Y - cy;
		return distance;
	}
	
	public double getX(){
		return X;
	}
	
	public double getY(){
		return Y;
	}
	
	public double getHeading(){
		return Heading;
	}

}
