/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int amount, option;
		SafeBankAccount account;
		
		System.out.println("How much is the inital balance ?");
		amount = in.nextInt();
		in.nextLine();
		account = new SafeBankAccount(amount);
		option = readcommand(in);
		option = 0;
		
		while(option != 6){//faz repetir a operação até  que o utilizador selecione, neste caso, "6";
		switch(option){
		case 1: processDeposit(account,in);
		break;
		case 2: processWithdraw(account, in);
		break;
		case 3: processGetBalance(account);
		break;  
		case 4: processComputeInterest(account);
		break;
		case 5: processApplyInterest(account);
		break;
		default:break;
		}
		}
		System.out.println("Saldo conta:");
		System.out.println(account.getBalance() + " centimos");
		
		
		in.close();
	}
	private static int readcommand(Scanner in) {
		int op;
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Get Balance");
		System.out.println("4 - Compute Interest");
		System.out.println("5 - Apply Interest");
		System.out.println("6 - Exit");
		System.out.println("Escolha opção: ");
		op = in.nextInt();
		in.nextLine();
		return op;
	
	}

	private static void processDeposit(SafeBankAccount account, Scanner in) {
		int dep;
		System.out.println("The value you wish to deposit is?");
		dep = in.nextInt();
		in.nextLine();
		account.deposit(dep);
		if(dep < 0){
			System.out.println("You can't do that!!!");
			System.out.println("The value you wish to deposit is?");
			dep = in.nextInt();
			in.nextLine();
			account.deposit(dep);
		}
		}
	
	private static void processWithdraw(SafeBankAccount account, Scanner in) {
		int dep;
		System.out.println("How much do you wish to take?");
		dep = in.nextInt();
		in.nextLine();
		account.withdraw(dep);
		if(dep > account.getBalance()){
			System.out.println("You don't have enough money");
			System.out.println("How much do you wish to take?");
			dep = in.nextInt();
			in.nextLine();
			account.withdraw(dep);
		}
				
		
	}
	
	private static void processGetBalance(SafeBankAccount account) {
		System.out.println(account.getBalance());
		
	}
	
	private static void processComputeInterest(SafeBankAccount account) {
		System.out.println(account.computeInterest());
		
	}
	
	private static void processApplyInterest(SafeBankAccount account) {
		account.applyInterest();
		
	}

	
	
	
		

	
	

}
