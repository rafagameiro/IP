/**
 * 
 * @author Pedro
 * 
 * It contains all the information about the questions;
 *
 */

public class Question {
	private String question;
	private String [] options;
	private String answer;
	private int counter;
	
	/**
	 * Creates a new question where the program insert the question, options and answer;
	 * 
	 * @param addQ
	 * Question;
	 * @param addA
	 * Quesion's answer;
	 */
	public Question(String addQ, String addA){
		question = addQ;
		options = new String[4];
		counter = 0;
		answer = addA;
	}
	/**
	 * 
	 * @return
	 * Return the question's text;
	 */
	public String giveQuestion(){
		return question;
	}
	/**
	 * It adds the option text to the vector's Option;
	 * 
	 * @param op
	 * the options text;
	 */
	public void addOption(String op){
		options[counter] = op;
		counter ++;
	}
	/**
	 * It gives the option's text depending on the options position;
	 * 
	 * @param option
	 * Option's position;
	 * @return
	 * Returns the selected option's text;
	 */
	public String giveOptions(int option){
		return options[option];
	}
	/**
	 * 
	 * @return
	 * Returns the questions's answer;
	 */
	public String giveAnswer(){
		return answer;
	}
	/**
	 * 
	 * @return
	 * Returns the option's position, depending on it's letter;
	 */
	public int giveAnswerPos(){
		int pos = -1;
		if(answer.equals("A")){
			pos = 0;
		}else if(answer.equals("B")){
			pos = 1;
		}else if(answer.equals("C")){
			pos = 2;
		}else if(answer.equals("D")){
			pos = 3;
		}

		return pos;
	}

}
