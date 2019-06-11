/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreasureMap map = new TreasureMap(8, -4);
		
		map.walkNorth(1);
		map.walkWest(3);
		map.getXPos();
		System.out.println(map.getXPos());//-3
		map.getYPos();
		System.out.println(map.getYPos());//1
		map.dig();
		System.out.println(map.dig());//false
		map.walkSouth(6);
		map.walkEast(10);
		map.walkNorth(1);
		map.dig();
		System.out.println(map.dig());//false
		map.walkEast(1);
		map.dig();
		System.out.println(map.dig());//true
		
		

	}

}
