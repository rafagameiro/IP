import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * @author Pedro
 * 
 * This where the interaction between the program and the user is done;
 * It only implements methods from TheBigQuestion Class;
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static final String questions = "perguntas.txt";

	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		TheBigQuestion theBigQuestion = new TheBigQuestion();
		System.out.println("Benvindo a Grande Questao. Deseja jogar? (S/N)\n");
		System.out.print("> ");
		String resposta = in.nextLine();

		//yes;
		if(resposta.equalsIgnoreCase("S")){
			try{
				addQuestions(theBigQuestion, questions);
				while(resposta.equalsIgnoreCase("S")){
					//Asks for the player name;
					System.out.println("Qual e o seu nome?");
					System.out.print("> ");
					String name = in.nextLine().trim();
					theBigQuestion.newPlayer(name);
					theBigQuestion.resetLvl();
					theBigQuestion.newHelp();
					System.out.println("Benvindo, "+ name + ".");

					play(theBigQuestion, name,in);
					//Ask for more players;
					System.out.println("\nBenvindo a Grande Questao. Deseja jogar? (S/N)");
					System.out.print("> ");
					resposta = in.nextLine();
					//If the answer is no;
					if(resposta.equalsIgnoreCase("N")){

						System.out.println("Que pena! Entao adeus.");
					}
				}
				//If the file doesn't exist;
			}catch(FileNotFoundException e){
				System.out.println("File does not exist.");
			}
			//If the answer is no;
		} else if(resposta.equalsIgnoreCase("N")){
			System.out.println("Que pena! Entao adeus.");
		}

		in.close();
	}

	private static void play(TheBigQuestion theBigQuestion, String name, Scanner in) throws FileNotFoundException{
		int qNumber = theBigQuestion.getQuestionNumber();
		String ans = "";
		printQuestOptions(theBigQuestion, qNumber);
		System.out.print("> ");
		ans = in.nextLine().toUpperCase();
		//If the option selected is "Help";SS
		if(ans.equalsIgnoreCase("H")){
			if(theBigQuestion.canGetHelp()){
				theBigQuestion.help();
				System.out.println(name + ", " + name + "... Era mesmo facil. "+ getRightAns(theBigQuestion, qNumber) + " Deseja continuar? (S/N)");
				System.out.print("> ");
				ans = in.nextLine();
				//yes;
				if(theBigQuestion.keepGoing(ans)){
					theBigQuestion.nextQuestion();
					play(theBigQuestion, name, in);
				}else{
					//if the answer is no;
					//If the user isn't on level one;
					if(canGoAll(theBigQuestion) && !theBigQuestion.isLevelOne()){
						System.out.println("Quer arriscar tudo ou nada, " + name + "(S/N)");
						System.out.print("> ");
						ans = in.nextLine();
						if(theBigQuestion.keepGoing(ans)){
							theBigQuestion.nextQuestion();
							tudoOuNada(theBigQuestion, name, in);
							//yes;
						}else{
							//if the answer is no;
							theBigQuestion.implementHelpPenalti();
							printScoreBoard(theBigQuestion,name);
							theBigQuestion.nextQuestion();
						}
					}else{
						//It subtract from the prize the money for the helps;
						theBigQuestion.implementHelpPenalti();
						printScoreBoard(theBigQuestion,name);
						theBigQuestion.nextQuestion();
					}
				}
			}
		}else{
			//if the answer is right
			if(theBigQuestion.isAnswerRight(qNumber, ans)){
				if(theBigQuestion.getLvlPrize() == 50000){
					theBigQuestion.resetHelps();
					theBigQuestion.implementHelpPenalti();
					System.out.print("Muito bem, " + name +"! Ganhou " + theBigQuestion.getTotalPrize() + " euros.");
					//If the player used any help;
					if(canGoAll(theBigQuestion)){
						System.out.println("Quer arriscar tudo ou nada, " + name + "(S/N)");
						System.out.print("> ");
						ans = in.nextLine();
						// yes;
						if(theBigQuestion.keepGoing(ans)){
							theBigQuestion.nextQuestion();
							tudoOuNada(theBigQuestion, name, in);
						}else{
							//if the answer is no;
							theBigQuestion.nextLvl();
							theBigQuestion.implementHelpPenalti();
							printScoreBoard(theBigQuestion,name);
							theBigQuestion.nextQuestion();
						}
					}else{
						//It subtract from the prize the money for the helps;
						theBigQuestion.nextLvl();
						theBigQuestion.implementHelpPenalti();
						printScoreBoard(theBigQuestion,name);
						theBigQuestion.nextQuestion();
					}
				}else{
					System.out.println("Muito bem, " + name + "! Ganhou " + theBigQuestion.getLvlPrize() + " euros. Deseja continuar? (S/N)");
					System.out.print("> ");
					ans = in.nextLine();
					// if wants to keep going;
					if(theBigQuestion.keepGoing(ans)){
						theBigQuestion.nextLvl();
						theBigQuestion.nextQuestion();
						play(theBigQuestion, name, in);
						//if doesn't want to continue:;
					}else{
						if(canGoAll(theBigQuestion)){
							//all or nothing;
							System.out.println("Quer arriscar tudo ou nada, " + name + "(S/N)");
							System.out.print("> ");
							ans = in.nextLine();
							//yes;
							if(theBigQuestion.keepGoing(ans)){
								theBigQuestion.nextQuestion();
								tudoOuNada(theBigQuestion, name, in);
								//if the answer is no;
							}else{
								theBigQuestion.nextLvl();
								theBigQuestion.implementHelpPenalti();
								printScoreBoard(theBigQuestion,name);
								theBigQuestion.nextQuestion();
							}
						}else{
							//It subtract from the prize the money for the helps;
							theBigQuestion.nextLvl();
							theBigQuestion.implementHelpPenalti();
							printScoreBoard(theBigQuestion,name);
							theBigQuestion.nextQuestion();
						}
					}
					//if it isn't;
				}

			}else{
				theBigQuestion.lost();
				System.out.print("Santa ignorancia, "+ name +"! Ficou com " + theBigQuestion.getTotalPrize() + " euros.");
				printScoreBoard(theBigQuestion,name);
				theBigQuestion.nextQuestion();
			}
		}
	}
	/**
	 * In case the "Help" option is selected it will print the correct answer;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param qNumber
	 * It corresponds to the number of the question;
	 * @return
	 * Returns the answer of the question, depending on the qNumber;
	 */

	private static String getRightAns(TheBigQuestion theBigQuestion, int qNumber){

		String ans = theBigQuestion.getRightAnwer();
		String formatedAns = "";
		switch(ans){
		case "A":
			formatedAns = "A. " + theBigQuestion.printOption(qNumber, 0);
			break;
		case "B":
			formatedAns = "B. " + theBigQuestion.printOption(qNumber, 1) ;
			break;
		case "C":
			formatedAns = "C. " + theBigQuestion.printOption(qNumber, 2);
			break;
		case "D":
			formatedAns = "D. " + theBigQuestion.printOption(qNumber, 3);
			break;
		}
		return formatedAns;
	}
	/**
	 * It will print the question and options depending on the qNumber;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param qNumber
	 * It corresponds to the number of the question;
	 */
	private static void printQuestOptions(TheBigQuestion theBigQuestion, int qNumber){
		System.out.println("Por " + theBigQuestion.getLvlPrize() + " euros, responda a seguinte questao:");
		System.out.println(theBigQuestion.printQuestion(qNumber));
		for(int i = 0; i<= 3; i++){
			System.out.println(printOptionWord(i) + theBigQuestion.printOption(qNumber, i));
		}
		if(theBigQuestion.canGetHelp()){
			System.out.println("H. Nem imagino, quero gastar uma ajuda.");
		}

	}
	/**
	 * A number it's inserted and will check which letter corresponds to the inserted option;
	 * 
	 * @param i
	 * number that correspond to the option in the selected question;
	 * @return
	 * Returns the letter that matches the correct number;
	 */
	private static String printOptionWord(int i){
		String opt = "";
		switch(i){
		case 0: 
			opt = "A. ";
			break;
		case 1:
			opt = "B. ";
			break;
		case 2:
			opt = "C. ";
			break;
		case 3:
			opt = "D. ";
			break;
		}
		return opt;
	}
	/**
	 * It will allow to select the option "All or Nothing", depending on the number of helps used;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @return
	 * Returns true in case the number of allowed helps haven't been reached;
	 */
	
	private static boolean canGoAll(TheBigQuestion theBigQuestion){
		return theBigQuestion.numOfHelp() != 0;
	}
	
	/**
	 * It will enter in the option "All or Nothing" where, if the player answer correctly it will receive all the prize;
	 * If gets it wrong it will lose everything;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param name
	 * It will use the name of the actual players to say its score and position in raking;
	 * @param in
	 * It will allow the player to introduce the option that he considers correct;
	 */
	private static void tudoOuNada(TheBigQuestion theBigQuestion, String name, Scanner in){
		int qNumber = theBigQuestion.getQuestionNumber();
		String ans = "";
		System.out.println(theBigQuestion.printQuestion(qNumber));
		for(int i = 0; i<= 3; i++){
			System.out.println(printOptionWord(i) + theBigQuestion.printOption(qNumber, i));
		}
		ans = in.nextLine().toUpperCase();
		if(theBigQuestion.isAnswerRight(qNumber, ans)){
			theBigQuestion.resetHelps();
			System.out.print("Muito bem, " + name + "! Ganhou " + theBigQuestion.getTotalPrize() + " euros.");
			printScoreBoard(theBigQuestion,name);
			theBigQuestion.nextQuestion();
		}else{
			theBigQuestion.lost();
			System.out.print("Santa ignorancia, "+ name +"! Ficou com " + theBigQuestion.getTotalPrize() + " euros.");
			printScoreBoard(theBigQuestion,name);
			theBigQuestion.nextQuestion();
		}
	}
	
	/**
	 * Read the questions in the selected file in order to present them to the players;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param quests
	 * it will access the file with the questions;
	 * @throws FileNotFoundException
	 * In case of nonexistent file;
	 */
	private static void addQuestions(TheBigQuestion theBigQuestion, String quests) throws FileNotFoundException{
		String question, op1, op2, op3, op4, answer;
		FileReader fich = new FileReader(quests);
		Scanner fin = new Scanner(fich);
		while(fin.hasNextLine()){
			question = fin.nextLine();
			op1 = fin.nextLine();
			op2 = fin.nextLine();
			op3 = fin.nextLine();
			op4 = fin.nextLine();
			answer = fin.nextLine();
			theBigQuestion.addQuestion(question, op1, op2, op3, op4, answer);
		}
		fin.close();
	}
	
	/**
	 * The printScoreBoard method will print the ranking and score of every player that already played the game since its beginning;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param name
	 * It will use the name of the actual players to say its score and position in raking;
	 */
	private static void printScoreBoard(TheBigQuestion theBigQuestion, String name){
		nameRepeated(theBigQuestion,name);
		theBigQuestion.ordenarJogadores();
		System.out.println("Parabens, " + name + "." + " Passou a ocupar a posicao " + theBigQuestion.getPosition(name) + " na nossa tabela de recordes.");
		System.out.println("Veja bem como ela ficou:");
		System.out.println("Ranking");
		theBigQuestion.initializeIterator();
		int i = 1;
		while(theBigQuestion.hasNext()){
			System.out.printf(i + ". " + theBigQuestion.getNameIterator() + " %.2f\n", theBigQuestion.getScoreIterator());
			theBigQuestion.next();
			i++;
		}
	}
	/**
	 * It checks if the current player's name is equal to any of other players name;
	 * If that happens it will check if the current player score is superior to the previous one;
	 * If it's superior it will remove the player and it's information;
	 * If not the current player score will be replaced by the player's score with the same name;
	 * 
	 * @param theBigQuestion
	 * It will evoke TheBigQuestion methods;
	 * @param name
	 * It will use the name of the actual players to say its score and position in raking;
	 */
	private static void nameRepeated(TheBigQuestion theBigQuestion, String name){
		if(theBigQuestion.isThere(name)){
			int currentPlayerPosition = theBigQuestion.getPosition(name);
			float currentPlayerScore = theBigQuestion.getScore(currentPlayerPosition);
			int lastPlayerPosition = theBigQuestion.getLPP();
			float lastPlayerScore = theBigQuestion.getScore(lastPlayerPosition);
			if(currentPlayerScore > lastPlayerScore){
				theBigQuestion.removePlayer(lastPlayerPosition);
			}else{
				theBigQuestion.setScore(currentPlayerPosition, lastPlayerScore);
				theBigQuestion.removePlayer(lastPlayerPosition);
			}
		}
	}

}
