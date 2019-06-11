/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */


public class SafeBankAccount {
	//Estado ou memoria
	 private int balance;
	 private static final int CAT1 = 1000000;
	 private static final int CAT2 = 200000;
	 public static final float RATECAT1 = 0.03f;
	 public static final float RATECAT2 = 0.02f;
	 public static final float RATECAT3 = 0.01f;
	 private static final int FINE = 200;

    // construtor - metodo particular
    public SafeBankAccount(){ 
	 balance = 0;
    }
    public SafeBankAccount(int initial){
	 balance = initial;
    }


    //interface - conjunto de operações ou funcionalidades
    public void deposit(int amount){
	balance = balance + amount;
    //Pre: amount > 0 
    }

    public void withdraw(int amount){
	if (balance >= amount){
		balance = balance - amount;
	}else {
		balance = balance - FINE;
	}
    //Pre: amount > 0	
    }

    public boolean redZone(){
	return balance <= 0;
    }

    public int getBalance(){
	return balance;
    }
    
    public void applyInterest(){
    	balance = balance + this.computeInterest();    
    }
    
    public int computeInterest(){
    	float tax = 0;
    	if(balance <= CAT2)
    		tax = RATECAT3;
    	else if(balance > CAT2 && balance <= CAT1)
    		tax = RATECAT2;
    	 else tax = RATECAT1;
    	return (int)(tax * balance); // ou utilizar o math.round da livraria math;
    }
}
