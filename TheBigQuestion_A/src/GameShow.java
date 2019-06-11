/**
 * 
 */

/**
 * @author Pedro
 *
 */
public class GameShow {
	public static final int MAX = 100;

	private Question [] perguntas;
	private int qCounter;

	public GameShow(){
		perguntas = new Question [MAX];
		qCounter = 0;
	}

	public void addQuestion(String question, String op1, String op2, String op3, String op4, String ans){
		perguntas[qCounter] = new Question(question, ans);
		perguntas[qCounter].addOption(op1);
		perguntas[qCounter].addOption(op2);
		perguntas[qCounter].addOption(op3);
		perguntas[qCounter].addOption(op4);
		qCounter++;
	}

	public String getQuestion(int position){
		return perguntas[position].giveQuestion();
	}

	public String getOptions(int position, int option){
		return perguntas[position].giveOptions(option);
	}
	public int getAnswerPosition(int position){
		return perguntas[position].giveAnswerPos();
	}
//	public int getDiference(int many){
//		return many - qCounter;
//	}
	public String getAnswer(int position){
		return perguntas[position].giveAnswer();
	}
	public boolean hasMoreQuestion(int qNumber){
		return qCounter < qNumber;
	}
}
