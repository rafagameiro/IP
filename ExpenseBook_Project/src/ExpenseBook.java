/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class ExpenseBook {
	
	public static final int MAX = 100; 
	
	private double totalGasto;
	private int numTotalDespesas;
	private double [] correntes;
	private double [] extraordinarias;
	private int counterCorrentes;
	private int counterExtraordinarias;
	
	public ExpenseBook(){
		totalGasto = 0;
		numTotalDespesas = 0;
		correntes = new double[MAX];
		extraordinarias = new double[MAX];
		counterCorrentes = 0;
		counterExtraordinarias = 0;
	}
	
	public void insertExpense(String name,double value){
		if(correntes.equals(name)){
			correntes[counterCorrentes] = value;
			counterCorrentes ++;
		} else if(extraordinarias.equals(name)){
			extraordinarias[counterExtraordinarias] = value;
			counterExtraordinarias ++;
		}
	}
	
	public double getExpense(String name){
		if(correntes.equals(name)){
			for(int i = 0; i <= counterCorrentes; i++){
				totalGasto = totalGasto + correntes[i];
			}
		}else if(extraordinarias.equals(name)){
			for(int i = 0; i <= counterExtraordinarias;i++){
				totalGasto = totalGasto + extraordinarias[i];
			}
		}
		return totalGasto;
	}
	
	public int getNumOfExpenses(String name){
		if(correntes.equals(name)){
			return counterCorrentes;
		}else
			return counterExtraordinarias;
	}
	
	public void newMonth(){
		double [] correntes2 = new double[MAX];
		double [] extraordinarias2 = new double[MAX];
		correntes = correntes2;
		extraordinarias = extraordinarias2;
		counterCorrentes = 0;
		counterExtraordinarias = 0;
	}
	
	public int numExpenses(){
		return counterCorrentes + counterExtraordinarias;
	}
	
	public double getTotal(){
		double res1 = 0;
		double res2 = 0;
		for(int i = 0; i <= counterCorrentes; i++){
			res1 = res1 + correntes[i];
		}
		for(int i = 0; i <= counterExtraordinarias; i++){
			res2 = res2 + extraordinarias[i];
		}
		
		totalGasto = res1 + res2;
		return totalGasto;
	}
	
	public String biggestNumOfExpenses(){
		String answer = "Extraordinarias";
		if(counterCorrentes > counterExtraordinarias){
			return answer = "Correntes";
		}else if(counterCorrentes <counterExtraordinarias){
			return answer;	
		}else
			return answer;
	}
	
	

}
