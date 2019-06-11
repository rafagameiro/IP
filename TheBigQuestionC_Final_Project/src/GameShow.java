/**
 * @author Pedro
 * 
 * This class will join all the questions that were added through the file reading;
 * It contains all the information about the questions transfered from the Question's class;
 *
 */
public class GameShow {
	//Contants;
	public static final int MAX = 100;

	//Variables;
	private Question [] perguntas;
	private int qCounter;

	//It a creates a vector where the program can save the uploaded questions;
	public GameShow(){
		perguntas = new Question [MAX];
		qCounter = 0;
	}
	
	/**
	 * It a new question in a Vector's position;
	 * It saves the question text, options and answer;
	 * All is saved in the position that corresponds to the qCounter number;
	 * 
	 * @param question
	 * Question;
	 * @param op1
	 * Option A;
	 * @param op2
	 * Option A;
	 * @param op3
	 * Option A;
	 * @param op4
	 * Option A;
	 * @param ans
	 * Question's answer;
	 */
	public void addQuestion(String question, String op1, String op2, String op3, String op4, String ans){
		perguntas[qCounter] = new Question(question, ans);
		perguntas[qCounter].addOption(op1);
		perguntas[qCounter].addOption(op2);
		perguntas[qCounter].addOption(op3);
		perguntas[qCounter].addOption(op4);
		qCounter++;
	}
	
	/**
	 * 
	 * @param position
	 * It's the position of the question;
	 * @return
	 * Returns the question's text;
	 */
	public String getQuestion(int position){
		return perguntas[position].giveQuestion();
	}
	
	/**
	 * 
	 * @param position
	 * It's the position of the question;
	 * @param position
	 * It's the position that corresponds to one of the options of the selected question;
	 * @return
	 * Returns the selected option's text;
	 */
	public String getOptions(int position, int option){
		return perguntas[position].giveOptions(option);
	}
	
	/**
	 * 
	 * @param position
	 * It's the position of the question;
	 * @return
	 * Returns the question's answer position;
	 */
	public int getAnswerPosition(int position){
		return perguntas[position].giveAnswerPos();
	}
	
	/**
	 * 
	 * @param position
	 * It's the position of the question;
	 * @return
	 * Returns the question's answer text;
	 */
	public String getAnswer(int position){
		return perguntas[position].giveAnswer();
	}
	
	/**
	 * 
	 * @param qNumber
	 * It's the number of the current question
	 * @return
	 * Returns true if the current question is the last one or even higher; 
	 */
	public boolean hasMoreQuestion(int qNumber){
		return qCounter <= qNumber;
	}
}
