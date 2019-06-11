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
	private int current;
	private int repeatPos;

	public ColPlayers(){
		players = new Players[Max];
		playerCounter = 0;
		current = -1;
		repeatPos = -1;
	}

	public void newPlayer(String name){
		if(isNameRepeated(name)){
			players[repeatPos].updateName(name);
			players[repeatPos].resetLvl();
		}else{
			players[playerCounter] = new Players(name);
			playerCounter++;
		}

	}	
	private boolean isNameRepeated(String name){
		int i = 0;
		boolean repeat = false;
		while(i < playerCounter){
			if(name.equalsIgnoreCase(players[i].getName())){
				players[i].updateName(name);
				repeatPos = i;
				repeat = true;
			}
			i++;
		}
		return repeat;
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

	public float getTotalPrize(int position){
		return players[position].getTotalPrize();
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

	public void ordenarJogadores(){
		Players [] temporaryPlayers = new Players[Max];
		int temporaryCounter = 0;
		int topPlayerPosition = -1;

		while(playerCounter != 0){
			int i = 0;
			float topScore = - 1;
			while(i <= playerCounter - 1){
				if(players[i].getScore() > topScore){
					topScore = players[i].getScore();
					topPlayerPosition = i;
					i++;
				}else{
					i++;
				}
			}
			temporaryPlayers[temporaryCounter] = players[topPlayerPosition];
			temporaryCounter++;
			removePlayer(topPlayerPosition);
		}
		players = temporaryPlayers;
		playerCounter = temporaryCounter;
	}

	//iterador
	public void initializeIterator(){
		current = 0;
	}
	public boolean hasNext(){
		return current != -1 && current < playerCounter;
	}
	public String getNameIterator(){
		return players[current].getName();
	}
	public float getScoreIterator(){
		return players[current].getScore();
	}
	public void next(){
		current++;
	}



	public void removePlayer(int position){
		for(int i = position; i < playerCounter; i++){
			players[i]= players[i+1];
		}
		playerCounter--;
	}

	//
	public int indexOfPlayer(String name){
		int pos = -1;
		int i = 0;
		while(i < playerCounter && pos == -1){
			if(name.equals(players[i].getName())){
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
