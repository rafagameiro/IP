import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * @author Pedro
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static final String questions = "perguntas.txt";

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		TheBigQuestion theBigQuestion = new TheBigQuestion();
		System.out.println("Benvindo a Grande Questao. Deseja jogar? (S/N)");
		System.out.print("> ");
		String resposta = in.nextLine();


		if(resposta.equalsIgnoreCase("S")){
			try{
				addQuestions(theBigQuestion, questions);
				while(resposta.equalsIgnoreCase("S")){
					System.out.println("Qual e o seu nome?");
					System.out.print("> ");
					String name = in.nextLine();
					theBigQuestion.newPlayer(name);
					theBigQuestion.resetLvl();
					theBigQuestion.newHelp();
					System.out.println("Benvindo, "+ name + ".");

					play(theBigQuestion, name,in);

					System.out.println("\nBenvindo a Grande Questao. Deseja jogar? (S/N)");
					System.out.print("> ");
					resposta = in.nextLine();
					if(resposta.equalsIgnoreCase("N")){

						System.out.println("Que pena! Entao adeus.");
					}
				}
			}catch(FileNotFoundException e){
				System.out.println("File does not exist.");
			}
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

		if(ans.equalsIgnoreCase("H")){
			if(theBigQuestion.canGetHelp()){
				theBigQuestion.help();
				System.out.println(name + ", " + name + "... Era mesmo facil. "+ getRightAns(theBigQuestion, qNumber) + " Deseja continuar? (S/N)");
				System.out.print("> ");
				ans = in.nextLine();
				if(theBigQuestion.keepGoing(ans)){
					theBigQuestion.nextQuestion();
					play(theBigQuestion, name, in);
				}else{
					if(canGoAll(theBigQuestion) && !theBigQuestion.isLevelOne()){
						System.out.println("Quer arriscar tudo ou nada, " + name + "? (S/N)");
						System.out.print("> ");
						ans = in.nextLine();
						if(theBigQuestion.keepGoing(ans)){
							theBigQuestion.nextQuestion();
							tudoOuNada(theBigQuestion, name, in);
							//no
						}else{
							//implementar penalti das ajudas
							theBigQuestion.implementHelpPenalti();
							System.out.println("Parabens, " + name + ".");
							theBigQuestion.nextQuestion();
						}
					}else{
						//implementar penalti das ajudas
						theBigQuestion.implementHelpPenalti();
						System.out.println("Parabens, " + name + ".");
						theBigQuestion.nextQuestion();
					}
				}
			}	//help
		}else{
			//if the answer is right
			if(theBigQuestion.isAnswerRight(qNumber, ans)){
				if(theBigQuestion.getLvlPrize() == 50000){
					theBigQuestion.resetHelps();
					theBigQuestion.implementHelpPenalti();
					if(canGoAll(theBigQuestion)){
						System.out.println("Muito bem, " + name + "! Ganhou  " + theBigQuestion.getTotalPrize()  + " euros. Quer arriscar tudo ou nada, " + name + "? (S/N)");
						System.out.print("> ");
						ans = in.nextLine();
						if(theBigQuestion.keepGoing(ans)){
							theBigQuestion.nextQuestion();
							tudoOuNada(theBigQuestion, name, in);
						}else{
							theBigQuestion.nextLvl();
							theBigQuestion.implementHelpPenalti();
							System.out.println("Parabens, " + name + ".");
							theBigQuestion.nextQuestion();
						}
					}else{
						theBigQuestion.nextLvl();
						theBigQuestion.implementHelpPenalti();
						System.out.println("Parabens, " + name + ".");
						theBigQuestion.nextQuestion();
					}
				}else{
					System.out.println("Muito bem, " + name + "! Ganhou " + theBigQuestion.getLvlPrize() + " euros. Deseja continuar? (S/N)");
					System.out.print("> ");
					ans = in.nextLine();
					// if wants to keep going
					if(theBigQuestion.keepGoing(ans)){
						theBigQuestion.nextLvl();
						theBigQuestion.nextQuestion();
						play(theBigQuestion, name, in);
						//if doesn't want to continue:
					}else{
						if(canGoAll(theBigQuestion)){
							//all or nothing
							System.out.println("Quer arriscar tudo ou nada, " + name + "? (S/N)");
							System.out.print("> ");
							ans = in.nextLine();
							//yes
							if(theBigQuestion.keepGoing(ans)){
								theBigQuestion.nextQuestion();
								tudoOuNada(theBigQuestion, name, in);
								theBigQuestion.nextQuestion();
								//no
							}else{
								theBigQuestion.nextLvl();
								theBigQuestion.implementHelpPenalti();
								System.out.println("Parabens, " + name + ".");
								theBigQuestion.nextQuestion();
							}
						}else{
							//implementar penalti das ajudas
							theBigQuestion.nextLvl();
							theBigQuestion.implementHelpPenalti();
							System.out.println("Parabens, " + name + ".");
							theBigQuestion.nextQuestion();
						}
					}
					//if it isn't
				}

			}else{
				theBigQuestion.lost(name);
				System.out.println("Santa ignorancia, "+ name +"! Ficou com " + theBigQuestion.getTotalPrize() + " euros. Parabens, " + name + ".");
				theBigQuestion.nextQuestion();
			}
		}
	}

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
	private static boolean canGoAll(TheBigQuestion theBigQuestion){
		return theBigQuestion.numOfHelp() != 0;
	}

	private static void tudoOuNada(TheBigQuestion theBigQuestion, String name, Scanner in){
		int qNumber = theBigQuestion.getQuestionNumber();
		String ans = "";
		System.out.println(theBigQuestion.printQuestion(qNumber));
		for(int i = 0; i<= 3; i++){
			System.out.println(printOptionWord(i) + theBigQuestion.printOption(qNumber, i).trim());
		}
		ans = in.nextLine().toUpperCase();
		if(theBigQuestion.isAnswerRight(qNumber, ans)){
			theBigQuestion.resetHelps();
			System.out.println("Muito bem, " + name + "! Ganhou " + theBigQuestion.getTotalPrize() + " euros. Parabens, " + name +".");
			theBigQuestion.nextQuestion();
		}else{
			theBigQuestion.lost(name);
			System.out.println("Santa ignorancia, "+ name +"! Ficou com " + theBigQuestion.getTotalPrize() + " euros. Parabens, " + name + ".");
			theBigQuestion.nextQuestion();
		}
	}
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

}
