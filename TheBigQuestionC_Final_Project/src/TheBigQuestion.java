/**
 * 
 * @author Pedro
 * 
 * This is where the Game is created and all the principal operations are made;
 * It implements methods from ColPlayers class and GameShow class;
 *
 */

public class TheBigQuestion {
	
	//Variables;
	GameShow gameShow;
	ColPlayers players;
	int questionNumber;
	private int playerPosition;
	/**
	 * It creates a new game every time the programs starts;
	 */
	public TheBigQuestion(){
		gameShow = new GameShow();
		players = new ColPlayers();
		playerPosition = -1;
		questionNumber = 0;
	}
	/**
	 * It will add the questions to the programs database;
	 * 
	 * @param question
	 * question;
	 * @param op1
	 * option A;
	 * @param op2
	 * option B;
	 * @param op3
	 * option C;
	 * @param op4
	 * option D;
	 * @param answer
	 * answer of the corresponding question;
	 */
	public void addQuestion(String question, String op1, String op2, String op3, String op4, String answer){
		gameShow.addQuestion(question, op1, op2, op3, op4, answer);
	}
	
	/**
	 * It creates a new player every time the game starts and after a player's win or loss;
	 * 
	 * @param name
	 * Name inserted by the player;
	 */
	public void newPlayer(String name){
		players.newPlayer(name);
		playerPosition = players.indexOfPlayer(name);
	}
	
	/**
	 * It will add one to the variable questionNumber so then it can move to the next question;
	 */
	public void nextQuestion(){
		questionNumber++;
	}
	
	/**
	 *If the current question is the last one it will reset the number of question and start presenting the questions from the beginning of the file; 
	 */
	private void hasMoreQuestion(){
		if(gameShow.hasMoreQuestion(questionNumber)){
			questionNumber = 0;
		}
	}
	
	/**
	 * It gives the current question number, but firstly it checks if the current question has already reached the last question;
	 * 
	 * @return
	 * Returns the current question position in the vector;
	 */
	public int getQuestionNumber(){
		hasMoreQuestion();
		return questionNumber;
	}
	
	/**
	 * Says the number of created players since the beginning of the game;
	 * 
	 * @return
	 * Returns the number of created players;
	 */
	public int getNumberOfPlayers(){
		return players.howManyPlayers();
	}
	
	/**
	 * 
	 * @param position
	 * It's the position of the player in the vector;
	 * @return
	 * Returns the name of the player in the inserted position;
	 */
	public String getName(int position){
		return players.getName(position);
	}
	/**
	 * 
	 * @param position
	 * It's the position of the player in the vector;
	 * @return
	 * returns the score of the player in the inserted position;
	 */
	public float getScore(int position){
		return players.getTotalPrize(position);
	}
	/**
	 * 
	 * @param sn
	 * It's the player's answer;
	 * @return
	 * Returns true if the inserted answer is yes(S);
	 */
	public boolean keepGoing(String sn){
		return sn.equalsIgnoreCase("S");
	}
	/**
	 * 
	 * @param qNumber
	 * Number of the Question;
	 * @param ans
	 * It's the option inserted by the player;
	 * @return
	 * Returns true if the inserted option is the correct one;
	 */
	public boolean isAnswerRight(int qNumber, String ans){
		int option = -1;
		switch(ans){
		case "A": option = 0; break;
		case "B": option = 1; break;
		case "C": option = 2; break;
		case "D": option = 3; break;
		}

		return option == gameShow.getAnswerPosition(qNumber);
	}
	
	/**
	 * 
	 * @return
	 * Returns the answer of the current question;
	 */
	public String getRightAnwer(){
		return gameShow.getAnswer(questionNumber);
	}
	
	/**
	 * 
	 * @param qNumber
	 * Number of the Question;
	 * @return
	 * Returns the question that corresponds to the inserted number;
	 */
	public String printQuestion(int qNumber){
		return gameShow.getQuestion(qNumber).trim();
	}
	
	/**
	 * 
	 * @param qNumber
	 * Number of the question;
	 * @param option
	 * The number of the option;
	 * @return
	 * Returns the option that corresponds to the number inserted;
	 */
	public String printOption(int qNumber, int option){
		return gameShow.getOptions(qNumber, option).trim();
	}
	
	/**
	 * It moves the player to the next level;
	 */
	public void nextLvl(){
		players.nextLvl(playerPosition);
	}
	
	/**
	 * Resets the level of the TheBigQuestion, when starting with a new player;
	 */
	public void resetLvl(){
		players.resetlvl(playerPosition);
	}
	
	/**
	 * 
	 * @return
	 * Returns the price that corresponds to the current level of the player;
	 */
	public int getLvlPrize(){
		return players.getLvlPrize(playerPosition);
	}
	
	/**
	 * It presents the price won by the player depending on the level and on the number of helps used;
	 * 
	 * @return
	 * Return the price got by the player;
	 */
	public int getTotalPrize(){
		return (int) players.getTotalPrize(playerPosition);
	}
	
	/**
	 * If any of the helps were used it will increment one more;
	 */
	public void help(){
		players.needHelp(playerPosition);
	}
	/**
	 * Verify if the player can use the option "All or Nothing";
	 * 
	 * @return
	 * Returns the number of helps used by the player;
	 */
	public int numOfHelp(){
		return players.getHelpsUsed(playerPosition);
	} 
	
	/**
	 * Check the number of helps to see if the player can use one or not;
	 * 
	 * @return
	 * Returns true if the number of helps is lower than 3;
	 */
	public boolean canGetHelp(){
		return players.getHelpsUsed(playerPosition) < 3;
	}
	
	/**
	 * If any of the helps were used it will subtract the value of its usage from the total price of the player;
	 */
	public void implementHelpPenalti(){
		players.implementHelpPenalti(playerPosition);
	}
	
	/**
	 * If the player lost it will reset his price to zero(0);
	 */
	public void lost(){
		players.resetPrize(playerPosition);
	}
	/**
	 * Reset the helps so then, if the player won the "All or Nothing" it will give the all price;
	 */
	public void resetHelps(){
		players.resetHelps(playerPosition);
	}
	
	/**
	 * Reset the number of helps used when starting a new game;
	 */
	public void newHelp(){
		players.newHelp(playerPosition);
	}
	
	/**
	 * Checks if the current player is in the level one;
	 * 
	 * @return
	 * Returns if the current player is on level one;
	 */
	public boolean isLevelOne(){
		return players.getLvl(playerPosition) == 1;
	}
	
	/**
	 * Sends the player position to inform the player about his ranking;
	 * 
	 * @param name
	 * The name of the player;
	 * @return
	 * returns the position of the player in the ColPlayers vector;
	 */
	public int getPosition(String name){
		return players.indexOfPlayer(name) + 1;
	}
	
	/**
	 * It go reorder the existing players by their score;
	 */
	public void ordenarJogadores(){
		players.ordenarJogadores();
	}
	
	/**
	 * 
	 * @param name
	 * The name pf the player;
	 * @return
	 * Returns true if the number of existing names is bigger than 1;
	 */
	public boolean isThere(String name){
		return players.isThereName(name) != 1;
	}
	
	/**
	 * Method necessary for to replace the old player for the new one;
	 * 
	 * @return
	 * Returns the position of the Last player;
	 */
	public int getLPP(){
		return players.getLPP();
	}
	
	/**
	 * If the player's new score is bigger than the old one it will delete the old one;
	 * 
	 * @param position
	 * Its the position of the player;
	 */
	public void removePlayer(int position){
		players.removePlayer(position);
	}
	/**
	 * It will readjusts the score if the the new score is bigger than the old one;
	 * 
	 * @param position
	 * The position of the player;
	 * @param last
	 * The score of the last player;
	 */
	public void setScore(int position, float last){
		players.setScore(position, last);
	}
	
	//Iterator
	
	/**
	 * Initialises the iterator;
	 */
	public void initializeIterator(){
		players.initializeIterator();
	}
	
	/**
	 * 
	 * @return
	 * Returns true if there is a next player;
	 */
	public boolean hasNext(){
		return players.hasNext();
	}
	
	/**
	 * 
	 * @return
	 * Returns the name of the Player in the according to the current Variable;
	 */
	public String getNameIterator(){
		return players.getNameIterator();
	}
	
	/**
	 * 
	 * @return
	 * Returns the score of the Player in the according to the current Variable;
	 */
	public float getScoreIterator(){
		return players.getScoreIterator();
	}
	
	/**
	 * The current Variable adds one to itself;
	 */
	public void next(){
		players.next();
	}
}
