/**
 * 
 */

/**
 * @author Pedro
 *
 */
public class ColPlayers {
	private static final int Max = 100;
	private Players [] players;
	private int playerCounter;

	public ColPlayers(){
		players = new Players[Max];
		playerCounter = 0;
	}

	public void newPlayer(String name){
		players[playerCounter++] = new Players(name);
	}	

	public String getName(int position){
		return players[position].getName();
	}
	public int getLvl(int position){
		return players[position].getLvl();
	}

	public int howManyPlayers(){
		return playerCounter;
	}

	public void nextLvl(int position){
		players[position].nextLvl();
	}
	public void needHelp(int position){
		players[position].needHelp();
	}

	public int getHelpsUsed(int position){
		return players[position].getHelpsUsed();
	}
	
	public void resetHelps(int position){
		players[position].resetHelps();
	}
	public void newHelp(int position){
		players[position].newHelps();
	}

	public float getTotalPrize(int position){
		return players[position].getScore();
	}
	public void implementHelpPenalti(int position){
		players[position].implementHelpPenalti();
	}
	public void resetPrize(String name){
		int position = indexOfPlayer(name);
		players[position].resetPrize();
	}
	public int getLvlPrize(int position){
		return players[position].getLevelPrize();
	}

	public int indexOfPlayer(String name){
		int pos = -1;
		int i = 0;
		while(i < playerCounter && pos == -1){
			if(name.equalsIgnoreCase(players[i].getName())){
				pos = i;
			}
			i++;
		}
		return pos;	
	}

	public void resetlvl(int position){
		players[position].resetLvl();
	}
}
