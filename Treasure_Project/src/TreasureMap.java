/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class TreasureMap {
	
	private int X;
	private int Y;
	private int XP;
	private int YP;
	
	public TreasureMap(){
		XP = 0;
		YP = 0;
		X = 0;
		Y = 0;
	}
	
	public TreasureMap(int cx, int cy){
		X = cx;
		Y = cy;
		
		//Pre:steps > 0
	}
	
	public int getXPos(){
		return XP;
	}
	public int getYPos(){
		return YP;
	}
	
	public void walkNorth(int steps){
		YP = YP + steps;
		//Pre:steps > 0
	}
	public void walkSouth(int steps){
		YP = YP - steps;
		//Pre:steps > 0
	}
	public void walkEast(int steps){
		XP = XP + steps;
		//Pre:steps > 0
	}
	public void walkWest(int steps){
		XP = XP - steps;
		//Pre:steps > 0
	}
	
	public boolean dig(){
		return XP == X && YP == Y;
	}

}
