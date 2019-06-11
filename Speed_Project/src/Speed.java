/**
 * 
 */

/**
 * @author Rafael Gameiro
*
 */

public class Speed {
	
	private double ms;
	private double kmh;
	private double mph;
	
	public Speed(){
		ms = 0;
		kmh = 0;
		mph = 0;
	}
	
	public void SetinMS(double speed){
		ms = speed;
		kmh = speed * 3.6;
		mph = speed * 2.236936;
		//Pre: speed > 0;
	}
	
	public double GetinMS(){//mph/ 2.236936 + kmh / 3.6 + ms
	return ms;	
	}
	
	public void SetinKM(double speed){
		kmh = speed;
		ms = speed / 3.6;
		mph = speed * 0.621371;
		//Pre: speed > 0;
	}
	
	public double GetinKM(){ //ms * 3.6 +  mph / 0.621371 + kmh
	return kmh;
		
	}
	
	public void SetinMP(double speed){
		mph = speed;
		kmh = speed * 1.609344;
		ms = speed * 0.44704;
		//Pre: speed > 0;
	}
	
	public double GetinMP(){ //kmh / 1.609344 + ms / 0.44704 + mph
	return mph;
	}

}
