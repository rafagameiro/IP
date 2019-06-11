/**
 * @author Pedro
 * 
 * This class will join all players that were created since the program's beginning;
 * It contains all the information about the players transfered from the Players's class;
 *
 */
public class ColPlayers {
	
	//Variables;
	private static final int Max = 100;
	private Players [] players;
	private int playerCounter;
	private int lastPlayerPosition;
	private int current;
	
	//It creates a collection of players every time the programs starts;
	public ColPlayers(){
		players = new Players[Max];
		playerCounter = 0;
		lastPlayerPosition = -1;
		current = -1;
	}
	
	/**
	 * It created a new player on the position of the PlayerCounter's number;
	 * 
	 * @param name
	 * The name inserted by the player;
	 */
	public void newPlayer(String name){
		players[playerCounter] = new Players(name);
		playerCounter++;
	}	
	
	/**
	 * 
	 * @param position
	 * Position of the player;
	 * @return
	 * Returns the player's name depending on the name;
	 */
	public String getName(int position){
		return players[position].getName();
	}
	
	/**
	 * 
	 * @return
	 * Returns the total number of Players;
	 */
	public int howManyPlayers(){
		return playerCounter;
	}
	/**
	 * Depends on the inserted position;
	 * 
	 * @param position
	 * Position of the player;
	 * @return
	 * Returns player's current position;
	 */
	public int getLvl(int position){
		return players[position].getLvl();
	}
	
	/**
	 * It moves the player to the next level;
	 * Depends on the inserted position;
	 *  
	 * @param position
	 * Position of the player;
	 */
	public void nextLvl(int position){
		players[position].nextLvl();
	}
	
	/**
	 * It adds one value to the current number of helps used by the player;
	 * It depend on the player's position;
	 * 
	 * @param position
	 * The position of the Player;
	 */
	public void needHelp(int position){
		players[position].needHelp();
	}
	
	/**
	 * It depends on the player's position;
	 * 
	 * @param position
	 * The player's position;
	 * @return
	 * Return the number of helps used by the player;
	 */
	public int getHelpsUsed(int position){
		return players[position].getHelpsUsed();
	}
	
	/**
	 * Instead of subtracting the amount of money required to use the "Help"'s option, it won't;
	 * It depends on the player's position;
	 * 
	 * @param position
	 * The player's position;
	 */
	public void resetHelps(int position){
		players[position].resetHelps();
	}
	
	/**
	 * It resets the number of used helps to zero(0), in order to start a new game;
	 * 
	 * @param position
	 * The player's position;
	 */
	public void newHelp(int position){
		players[position].newHelps();
	}
	
	/**
	 * It gives the final amount of price given to the player;
	 * It depends on the player's position;
	 * 
	 * @param position
	 * The player's position;
	 * @return
	 * Returns the Score obtained by the player;
	 */
	public float getTotalPrize(int position){
		return players[position].getScore();
	}
	
	/**
	 * The players loses all the price he has already gotten;
	 * It depends on the player's position;
	 * 
	 * @param position
	 * The player's position;
	 */
	public void resetPrize(int position){
		players[position].resetPrize();
	}
	
	/**
	 * It will subtract the amount of price required to use "Help"'s option;
	 * It depends on the inserted position;
	 * 
	 * @param position
	 * The player's position;
	 */
	public void implementHelpPenalti(int position){
		players[position].implementHelpPenalti();
	}
	
	/**
	 * It gives the price of the level where the player is;
	 * It depends on the inserted position;
	 * 
	 * @param position
	 * The player's position;
	 * @return
	 * Returns the price that corresponds to the current player's level;
	 */
	public int getLvlPrize(int position){
		return players[position].getLevelPrize();
	}
	
	/**
	 * It reorders the existent players in the ColPlayers vector into a new;
	 * The order is based on the score obtain by everyone of them;
	 */
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
	
	/**
	 * 
	 * @param position
	 * The player's position;
	 */
	public void removePlayer(int position){
		for(int i = position; i < playerCounter; i++){
			players[i]= players[i+1];
		}
		playerCounter--;
	}
	
	/**
	 * 
	 * @param name
	 * The player's name;
	 * @return
	 * Returns the player's position;
	 */
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
	
	/**
	 * 
	 * @param name
	 * The player's name;
	 * @return
	 * Returns how many equal names are in the vector;
	 */
	public int isThereName(String name){
		int names = 0;
		int pos = -1;
		for(int i = 0; i < playerCounter; i++){
			if(players[i].getName().equalsIgnoreCase(name)){
				names++;
				if(pos == -1){
					pos = i;
				}
			}
		}
		lastPlayerPosition = pos;
		return names;
	}
	
	/**
	 * It resets the player's level;
	 * It depends on the inserted position;
	 * 
	 * @param position
	 * The player's position;
	 */
	public void resetlvl(int position){
		players[position].resetLvl();
	}
	
	/**
	 * It returns the last player's position;
	 */
	public int getLPP(){
		return lastPlayerPosition;
	}
	
	/**
	 * 
	 * @param position
	 * The player's position;
	 * @param lastScore
	 * The last score obtained by the same player;
	 */
	public void setScore(int position, float lastScore){
		players[position].addScore(lastScore);
	}
	
	//iterador
	
	/**
	 * The iterator will run through all the ColPlayer vector;
	 * Initializes the iterator;
	 */
	public void initializeIterator(){
		current = 0;
	}
	
	/**
	 * Checks if there is a next player after the current position of interator;
	 * 
	 * @return
	 * Returns true if there is a next player;
	 */
	public boolean hasNext(){
		return current != 0 && current < playerCounter;
	}
	
	/**
	 * 
	 * @return
	 * Returns the name of the Player in the according to the current Variable;
	 */
	public String getNameIterator(){
		return players[current].getName();
	}
	
	/**
	 * 
	 * @return
	 * Returns the score of the Player in the according to the current Variable;
	 */
	public float getScoreIterator(){
		return players[current].getScore();
	}
	
	/**
	 * The current Variable adds one to itself;
	 */
	public void next(){
		current++;
	}
}
