
public class TheBigQuestion {
	GameShow gameShow;
	ColPlayers players;
	int questionNumber;

	//	private static final String a = "";

	private int playerPosition;

	public TheBigQuestion(){
		gameShow = new GameShow();
		players = new ColPlayers();
		playerPosition = -1;
		questionNumber = 0;
	}
	public void addQuestion(String question, String op1, String op2, String op3, String op4, String answer){
		gameShow.addQuestion(question, op1, op2, op3, op4, answer);
	}

	public void newPlayer(String name){
		players.newPlayer(name);
		playerPosition = players.indexOfPlayer(name);
	}
	public void nextQuestion(){
		questionNumber++;
	}
	private void hasMoreQuestion(){
		if(gameShow.hasMoreQuestion(questionNumber)){
			questionNumber = 0;
		}
	}
	
	public int getQuestionNumber(){
		hasMoreQuestion();
		return questionNumber;
	}
	public int getNumberOfPlayers(){
		return players.howManyPlayers();
	}
	
	public String getName(int position){
		return players.getName(position);
	}
	public float getScore(int position){
		return players.getTotalPrize(position);
	}
	
	public boolean keepGoing(String sn){
		return sn.equalsIgnoreCase("S");
	}
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
	public String getRightAnwer(){
		return gameShow.getAnswer(questionNumber);
	}

	public String printQuestion(int qNumber){
		return gameShow.getQuestion(qNumber);
	}

	public String printOption(int qNumber, int option){
		return gameShow.getOptions(qNumber, option).trim();
	}
	
	public int getLvl(){
		return players.getLvl(playerPosition);
	}

	public void nextLvl(){
		players.nextLvl(playerPosition);
	}
	public void resetLvl(){
		players.resetlvl(playerPosition);
	}
	
	public int getLvlPrize(){
		return players.getLvlPrize(playerPosition);
	}

	public float getTotalPrize(){
		return players.getTotalPrize(playerPosition);
	}

	public void help(){
		players.needHelp(playerPosition);
	}
	
	public int numOfHelp(){
		return players.getHelpsUsed(playerPosition);
	}

	public boolean canGetHelp(){
		return players.getHelpsUsed(playerPosition) <= 3;
	}

	public void implementHelpPenalti(){
		players.implementHelpPenalti(playerPosition);
	}

	public void lost(String name){
		players.resetPrize(name);
	}
	
	public void resetHelps(){
		players.resetHelps(playerPosition);
	}
	
	public boolean isLevelOne(){
		return players.getLvl(playerPosition) == 1;
	}
	
	public int getScoreBoardPosition(String name){
		return players.indexOfPlayer(name) + 1;
	}
	
	public void ordenarJogadores(){
		players.ordenarJogadores();
	}
	
	public void removePlayer(int position){
		players.removePlayer(position);
	}
	
	//iterador para o score
	public void initializeIterator(){
		players.initializeIterator();
	}
	public boolean hasNext(){
		return players.hasNext();
	}
	public String getNameIterator(){
		return players.getNameIterator();
	}
	public float getScoreIterator(){
		return players.getScoreIterator();
	}
	public void next(){
		players.next();
	}
}
