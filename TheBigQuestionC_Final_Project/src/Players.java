/**
 * @author Pedro
 *
 *It contains all the information about the players;
 */
public class Players {
	
	// Variables;
	private String name;
	private int lvl;
	private int help;
	private float prizeWon;
	
	//It creates a new player;
	public Players(String newName){
		name = newName;
		lvl = 1;
		help = 0;
		prizeWon = 0.0f;
	}
	/**
	 * 
	 * @param score
	 * The score the that corresponds to the player;
	 */
	public void addScore(float score){
		prizeWon = score;
	}
	
	/**
	 * It moves the player to the next level;
	 */
	public void nextLvl(){
		prizeWon = levelPrize(lvl);
		lvl++;
	}
	/**
	 * It increases the number that corresponds to the variable help;
	 */
	public void needHelp(){
		help++;
	}
	
	/**
	 * 
	 * @return
	 * return the number that corresponds to the variable help;
	 */
	public int getHelpsUsed(){
		return help;
	}
	
	/**
	 * It gives to the variable help the number zero(0);
	 */
	public void newHelps(){
		help = 0;
	}
	/**
	 * 
	 * @return
	 * returns the variable name;
	 */
	public String getName(){
		return name;
	}
	/**
	 * 
	 * @return
	 * Returns the player's current level;
	 */
	public int getLvl(){
		return lvl;
	}
	
	/**
	 * It resets the player's current level;
	 */
	public void resetLvl(){
		lvl = 1;
	}
	
	/**
	 * It gives all the price that corresponds to the current level to the player;
	 */
	public void resetHelps(){
		prizeWon = levelPrize(lvl);
	}
	/**
	 * 
	 * @return
	 * returns the players's score;
	 */
	public float getScore(){
		return prizeWon;
	}
	
	/**
	 * It subtracts the amount of price that you need to use in order to use the option "Help";
	 * It subtracts depending on the number of used helps;
	 */
	public void implementHelpPenalti(){
		prizeWon = (prizeWon * (1-  (0.25f * help)));
	}
	
	/**
	 * 
	 * @return
	 * Returns the price of the player's current level;
	 */
	public int getLevelPrize(){
		return levelPrize(lvl);
	}
	
	/**
	 * The player loses all the price he has already gotten;
	 */
	public void resetPrize(){
		prizeWon = 0;
	}
	/**
	 * 
	 * @param lvl
	 * The level of the player;
	 * @return
	 * Returns the level's price;
	 */
	private int levelPrize(int lvl){
		int prize = 0;
		switch(lvl){
		case 1: prize = 50; break;
		case 2: prize = 100; break;
		case 3: prize = 200; break;
		case 4: prize = 300; break;
		case 5: prize = 500; break;
		case 6: prize = 1000; break;
		case 7: prize = 2000; break;
		case 8: prize = 3000; break;
		case 9: prize = 5000; break;
		case 10: prize = 10000; break;
		case 11: prize = 20000; break;
		case 12: prize = 50000; break;
		default: prize = 0;
		}
		return prize;
	}
}
