/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class FairPlay {
	
	private boolean SuppIsHappy;
	
	public FairPlay(){
		
		SuppIsHappy = true;
	}
	public void WeWon(){
		SuppIsHappy = true;
	}
	public void WeLost(){
		SuppIsHappy = false;
	}
	public void WeDrew(){
		SuppIsHappy = false;
	}
	public void TheyLost(){
		SuppIsHappy = true;
	}
	public void TheyWon(){
		SuppIsHappy = false;
	}
	public void TheyDrew(){
		SuppIsHappy = true;
	}
	public boolean IsHappy(){
		return SuppIsHappy;
	}

}
