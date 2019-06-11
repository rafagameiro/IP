/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class GameShow {
	
	public static final int MAX = 100;
	
	private Question [] Question;
	int countQuest;
	int current ;
	
	public GameShow(){
		Question = new Question[MAX];
		countQuest = 0;
		current = -1;
	}
	
	public void addQuestion(String quest, String op, String op2, String op3, String op4, String ans){
		Question[countQuest] = new Question(quest, ans);
		Question[countQuest].addOption(op);
		Question[countQuest].addOption(op2);
		Question[countQuest].addOption(op3);
		Question[countQuest].addOption(op4);
		countQuest++;
	}
	
	public String getQuestion(int i){
		return Question[i].getQuestion();
	}
	
	public String getAnswer(int i){
		return Question[i].getAnswer();
	}
	
	public int getNumOfQuest(){
		return countQuest;
	}
	
	public String getOption(int pos, int i){
		return Question[pos].getOption(i);
	}
	
	public String OpWord(int i){
		String word = "";
		switch(i){
		case 0: word = "A";break;
		case 1: word = "B";break;
		case 2: word = "C";break;
		case 3: word = "D";break;
		}
		return word;
	}
}
