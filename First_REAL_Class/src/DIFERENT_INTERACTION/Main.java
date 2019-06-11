/**
 * 
 */
package DIFERENT_INTERACTION;

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String DEPOSIT = "D";
	public static final String WITHDRAW = "L";
	public static final String BALANCE = "CS";
	public static final String COMPUTE_INTEREST = "CJA";
	public static final String APPLY_INTEREST = "AJA";
	public static final String SIMULATION = "SM";
	public static final String HELP = "A";
	public static final String LEAVE = "S";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String option = "";
		int amount;
		SafeBankAccount account;
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		in.nextLine();
		account = new SafeBankAccount(amount);
		
		
		while(!option.equals("S")){//faz repetir a operação até  que o utilizador selecione, neste caso, "S";V tb podes fazer option != "6";
			option = in.next().toUpperCase();
			
		switch(option){
		case WITHDRAW: processWithdraw(account, in); break;
		case DEPOSIT: processDeposit(account, in);break;
		case BALANCE: processBalance(account); break;
		case COMPUTE_INTEREST: processComputeInterest(account); break;
		case APPLY_INTEREST: processApplyInterest(account); break;
		case SIMULATION: processSimulation(account,in); break;
		case HELP: Help();break;
		case LEAVE: break;
		default : System.out.println("Invalid command");
		}
		}
		in.close();

	}
	
	

	private static void processWithdraw(SafeBankAccount account, Scanner in) {
		// TODO Auto-generated method stub
		int op;
		op = in.nextInt();
		in.nextLine();
		if (op > account.getBalance()){
			System.out.println("Invalid operation");
		}
		account.withdraw(op);	
		System.out.println(account.getBalance());
	}
	private static void processDeposit(SafeBankAccount account, Scanner in) {
		// TODO Auto-generated method stub
		int op;
		op = in.nextInt();
		account.deposit(op);
		in.nextLine();
		System.out.println(account.getBalance());
	}
	private static void processBalance(SafeBankAccount account) {
		// TODO Auto-generated method stub
		System.out.println(account.getBalance());
		
	}
	private static void processComputeInterest(SafeBankAccount account) {
		// TODO Auto-generated method stub
		account.computeInterest();
		System.out.println(account.computeInterest());
		System.out.println(account.getBalance());
	}
	private static void processApplyInterest(SafeBankAccount account) {
		// TODO Auto-generated method stub
		account.applyInterest();
		System.out.println(account.getBalance());
	}
	private static void processSimulation(SafeBankAccount account, Scanner in) {
		// TODO Auto-generated method stub
		int op;
		op = in.nextInt();
		in.nextLine();
		System.out.println(account.howManySavingYears(op));
	}
    private static void Help() {
		// TODO Auto-generated method stub
    	System.out.println("You can any of these commands with lower case or upper case:");
    	System.out.println("L - Withdraw");
    	System.out.println("D - Deposit");
    	System.out.println("CS - Get Balance");
    	System.out.println("CJA - Compute Interest");
    	System.out.println("AJA - Apply Interest");
    	System.out.println("S - Leave");
    	
	}

}
