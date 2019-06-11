/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	
public static final String FILE = "Perguntas.txt";
public static final String FILE_NOT_EXIST = "File does not exist";
public static final int ZERO = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
		GameShow game = new GameShow();
		Scanner in = new Scanner(System.in);
		int number = -1;
		ReadQuestions(game, FILE);
		
		while(number != 0){
			System.out.println("Quantas perguntas quer ver?");
			number = in.nextInt();
			if(number > game.getNumOfQuest()){
				getQuestions(game,game.getNumOfQuest());
				getQuestions(game,-(game.getNumOfQuest() - number));
			}else
				getQuestions(game,number);
		}
		System.out.println("Adeus.");
		in.close();
	} catch(FileNotFoundException e){
		System.out.println(FILE_NOT_EXIST);
		}
	}
	
	public static void getQuestions(GameShow game, int num){
		for(int i = 0;i != num;i++){
			System.out.println(game.getQuestion(i));
			for(int j =0; j <= 3;j++){
				
				if(game.OpWord(j).equalsIgnoreCase(game.getAnswer(i))){
				System.out.println(">>>" + game.OpWord(j) + ". " + game.getOption(i, j) + "<<<");
				}else{
					System.out.println(game.OpWord(j) + ". " + game.getOption(i, j));
				}
			}
		}
			
	}
	
	private static void ReadQuestions(GameShow game, String FILE) throws FileNotFoundException{
		String quest, op, op2, op3, op4, answer;
		FileReader fiRe = new FileReader(FILE);
		Scanner fin = new Scanner(fiRe);
		while (fin.hasNextLine()){
			quest = fin.nextLine();
			op = fin.nextLine();
			op2 = fin.nextLine();
			op3 = fin.nextLine();
			op4 = fin.nextLine();
			answer = fin.nextLine();
			game.addQuestion(quest, op, op2, op3, op4, answer);
		}
		fin.close();
	}

}
