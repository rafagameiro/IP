/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Diet {

		private int eatT;
		private int burnT;
		private int eatCalories;
		private int burnCalories;
		
		public Diet(){
			eatCalories = 0;
			burnCalories = 0;
			eatT = 0;
			burnT = 0;
		}
		
		public void eat(int c){
			eatCalories = eatCalories + c;
			eatT = eatT + 1;
			//Pre: c > 0;
		}
		
		public void burn(int c){
			burnCalories = burnCalories + c;
			burnT = burnT + 1;
			//Pre: c > 0;
		}
		
		public int Balance(){
			return eatCalories - burnCalories;
		}
		
		public boolean IsBalanceNegative(){
			return Balance() < 0; //posso usar o metodo(Balance()) em vez da expressão toda (eatCalories - burnCalories)
		}

		public float averageEatenCalories(){
			return 1.0f * eatCalories / eatT;
			
		}
		
		public float averageBurntCalories(){
			return 1.0f * burnCalories / burnT;
		}
		
		public int eattimes(){
			return eatT;
		}
		
		public int burntimes(){
			return burnT;
		}
}
