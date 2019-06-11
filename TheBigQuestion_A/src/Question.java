
public class Question {
	private String question;
	private String [] options;
	private String answer;
	private int counter;

	public Question(String addQ, String addA){
		question = addQ;
		options = new String[4];
		counter = 0;
		answer = addA;
	}

	public String giveQuestion(){
		return question;
	}

	public void addOption(String op){
		options[counter] = op;
		counter ++;
	}

	public String giveOptions(int option){
		return options[option];
	}
	public String giveAnswer(){
		return answer;
	}

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
