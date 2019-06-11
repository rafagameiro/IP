/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;

public class Ellipse {
	
	private double X;
	private double Y;
	private double BigRadius;
	private double SmallRadius;
	
	public Ellipse(){
		X = 0;
		Y = 0;
		BigRadius = 1;
		SmallRadius = 1;
	}
	
	public Ellipse(double Bradius, double Sradius){
		Bradius = BigRadius;
		Sradius = SmallRadius;
		
	}
	
	public double getX(){
		return X;
	}
	
	public double getY(){
		return Y;
	}
	
	public double getBigRadius(){
		return SmallRadius;
	}
	
	public double getSmallRadius(){
		return SmallRadius;
	}
	public double getArea(){
		return Math.PI * SmallRadius * BigRadius;
	}
	
	public boolean IsThere(double cx, double cy){
		return Math.pow((X/cx), 2) + Math.pow((Y/cy), 2) <= 1;
	}
	
	
	public void translate(double dx, double dy){
		X = X + dx;
		Y = Y + dy;
	}
	

}
