/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;

public class Circle {
	//estado
	private double X;
	private double Y;
	private double Radius;
	//construtor
	public Circle(){
		
		X = 0;
		Y = 0;
		Radius = 1;
		
	}
	
	public Circle(double radius){
		Radius = radius;
		//Pre: Radius > 0;
	}
	
	public Circle(double cx, double cy, double radius){
		X = cx;
		Y = cy;
		Radius = radius;
		//Pre: radius > 0;
	}
	//interface	
	public double getX(){
		return X;
	}
	
	public double getY(){
		return Y;
	}
	
	public double getRadius(){
		return Radius;
	}
	
	public double getPerimeter(){
		return Math.PI * 2 * getRadius();
	}
	
	public double getArea(){
		return Math.PI * Math.pow(getRadius(), 2);		
	}
	
	public boolean IsThere(double x, double y){
		return (Math.pow((X - x), 2) + Math.pow((Y - y), 2) <= Math.pow(Radius, 2));
	}
	
	public void translate(double dx, double dy){
		X = X + dx;
		Y = Y + dy;
	}

}
