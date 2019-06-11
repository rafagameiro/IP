/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Question {
	
	public static final int MAX = 4;
	
	private String [] Options;
	private int counter;
	private String Question;
	private String Answer;
	
	public Question(String question, String answer){
		Options = new String[MAX];
		counter = 0;
		Question = question;
		Answer = answer;
	}
	
	public void addOption(String op){
		Options[counter] = op;
		counter++;
	}
	
	public String getOption(int i){
		return Options[i];
	}
	
	public String getAnswer(){
		return Answer;
	}
	
	public String getQuestion(){
		return Question;
	}

	

}
