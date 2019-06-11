/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */

import java.math.*;

public class Decathlon {
	
	private double points, pt100, pt400, pt1500, pt110, ptHJ, ptPV, ptLJ, ptS, ptD, ptJ;
	private double t;
	private double m;
	private double d;
	
	public Decathlon(){
		points = 0;
		pt100 = 0;
		pt400 = 0;
		pt1500 = 0;
		pt110 = 0;
		ptHJ = 0;
		ptPV = 0;
		ptLJ = 0;
		ptS = 0;
		ptD = 0;
		ptJ = 0;
		t = 0;
		m = 0;
		d = 0;
	}
	
	public void Set100m(double t){
		pt100 = 25.4347 * (Math.pow(18.00 - t, 1.81));
		// Pre: t > 0
	}
	public void Set400m(double t){
		pt400 = 1.53775  * (Math.pow(82.00 - t, 1.81));
		// Pre: t > 0
	}
	public void Set1500m(double t){
		pt1500 = 0.03768  * (Math.pow(480.00 - t, 1.85));
		// Pre: t > 0
	}
	public void Set110Hurdles(double t){
		pt110 = 5.74352  * (Math.pow(28.50 - t, 1.92));
		// Pre: t > 0
	}
	public void SetHighJump(int m){
		ptHJ = 0.8465 * (Math.pow(m - 75.00, 1.42));
		// Pre: m > 0
	}
	public void SetPoleVault(int m){
		ptPV = 0.2797 * (Math.pow(m - 100.00, 1.35));
		// Pre: m > 0
	}
	public void SetLongJump(int m){
		ptLJ = 0.14354  * (Math.pow(m - 220.00, 1.40));
		// Pre: m > 0
	}
	public void SetShot(double d){
		ptS = 51.39 * (Math.pow(d - 1.50, 1.05));
		// Pre: d > 0
	}
	public void SetDiscus(double d){
		ptD = 12.91 * (Math.pow(d - 4.00, 1.10));
		// Pre: d > 0
	}
	public void SetJavelin(double d){
		ptJ = 10.14 * (Math.pow(d - 7.00, 1.08));
		// Pre: d > 0
	}
	
	public double Get100m(){
		return pt100;
	}
	public double Get400m(){
		return pt400;
	}
	public double Get1500m(){
		return pt1500;
	}
	public double Get110Hurdles(){
		return pt110;
	}
	public double GetHighJump(){
		return ptHJ;
	}
	public double GetPoleVault(){
		return ptPV;
	}
	public double GetLongJump(){
		return ptLJ;
	}
	public double GetShot(){
		return ptS;
	}
	public double GetDiscus(){
		return ptD;
	}
	public double GetJavelin(){
		return ptJ;
	}
	
	public int getPoints(){
		points = pt100 + pt400 + pt1500 + pt110 + ptHJ + ptPV + ptLJ + ptS + ptD + ptJ;
		return (int) points;
	}
	public void reset(){ 
		pt100 =	pt400 =	pt1500 = pt110 = ptHJ =	ptPV = ptLJ = ptS = ptD = ptJ = 0;
	}

}
