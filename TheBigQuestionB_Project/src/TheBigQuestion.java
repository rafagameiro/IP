
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
	private boolean hasMoreQuestion(){
		return gameShow.hasMoreQuestion(questionNumber);
	}
	
	public int getQuestionNumber(){
		if(hasMoreQuestion()){
			questionNumber = 0;
			return questionNumber;
		}else{
			return questionNumber;
		}
	}

	public String getName(int position){
		return players.getName(position);
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
		return gameShow.getQuestion(qNumber).trim();
	}

	public String printOption(int qNumber, int option){
		return gameShow.getOptions(qNumber, option).trim();
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

	public int getTotalPrize(){
		return (int) players.getTotalPrize(playerPosition);
	}

	public void help(){
		players.needHelp(playerPosition);
	}
	
	public int numOfHelp(){
		return players.getHelpsUsed(playerPosition);
	}

	public boolean canGetHelp(){
		return players.getHelpsUsed(playerPosition) < 3;
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
	public void newHelp(){
		players.newHelp(playerPosition);
	}
	
	public boolean isLevelOne(){
		return players.getLvl(playerPosition) == 1;
	}
	
}
