/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class BankAccount {
	//Estado ou memoria
		 private int balance;
	
	// construtor - metodo particular
	 public BankAccount(){ 
		 balance = 0;
	 }
	 public BankAccount(int initial){
		 balance = initial;
	 }
	 
	 
	//interface - conjunto de operações ou funcionalidades
	public void deposit(int amount){
		balance = balance + amount;
	//Pre: amount > 0 
	}
	
	public void withdraw(int amount){
		balance = balance - amount;
	//Pre: amount > 0	
	}
	
	public boolean redZone(){
		return balance <= 0;
	    }
	
	public int getBalance(){
		return balance;
	}

}
