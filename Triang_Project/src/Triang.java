/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;

public class Triang {
	
	private double Px;
	private double Py;
	private double Qx;
	private double Qy;
	private double Rx;
	private double Ry;
	
	public Triang(){
		Px = 1;
		Py = 1;
		Qx = 4;
		Qy = 4;
		Rx = 5;
		Ry = 1;
	}
	
	public double getX1(){
		return Px;
	}
	public double getY1(){
		return Py;
	}
	public double getX2(){
		return Qx;
	}
	public double getY2(){
		return Qy;
	}
	public double getX3(){
		return Rx;
	}
	public double getY3(){
		return Ry;
	}
	
	public double sideLength1(){
		double length;
		length = Math.sqrt((Math.pow((Qx-Px), 2) +(Math.pow((Qy -Py), 2))));
		return length;
	}
    public double sideLength2(){
    	double length;
		length = Math.sqrt((Math.pow((Qx-Rx), 2) +(Math.pow((Qy -Ry), 2))));
		return length;
	}
    public double sideLength3(){
    	double length;
		length = Math.sqrt((Math.pow((Px-Rx), 2) +(Math.pow((Py -Ry), 2))));
		return length;
	}
    public double perimeter(){
		double perimeter;
		perimeter = (sideLength1() + sideLength2() + sideLength3()) / 2;
		return perimeter;
	}
    public double area(){
    	double area;
    	area = Math.sqrt((perimeter() * (perimeter() - sideLength1()) * (perimeter() - sideLength2()) * (perimeter() - sideLength3())));
	    return area;
    }
	
	
	

}
