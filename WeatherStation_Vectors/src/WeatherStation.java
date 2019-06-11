/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class WeatherStation {
	public static final int MAX = 100;
	public static final int GROWTH = 2;
	
	 //vetor acompanhado
	/*
	 * Este metodo utiliza menos memoria, contudo para se determinar o max ou min é necessario percorrer o vector para se determinar qual é o max ou min;
	 */
	private double [] samples;
	private int counter;
	//fim do vetor acompanhado
	
	public WeatherStation(){
		samples = new double[MAX];
		counter = 0;
	}
	
	public void sampleTemperature(double temp){
		if(counter < samples.length){
			samples [counter] = temp;
			counter ++;
		}else if (counter == samples.length){
			resize();
			samples [counter] = temp;
			counter ++;
		}	
	}
	
	public int numberTemperatures(){
		return counter;
	}
	
	private void resize(){
		double [] temp = new double [GROWTH * samples.length];
		/*
		 * while(i < counter){
			temp[i] = samples[i];
			i++;
		}
		 * Isto tb pode ser fito com um for;
		 */
		for(int i = 0; i < counter; i++ ){
			temp[i] = samples[i];
		}
		samples = temp;
	}
	
	public double getTemperature(int i){
		return samples[i - 1];
	}
	
	public double getAverage(){
		double res = 0;
		for(int i = 0; i < counter; i++){
			res = res + samples[i];
		}
		return res / counter;
	}
	
	public double getMinimum(){
		double min = samples[0];
		for(int i = 1; i < counter; i++){
			if(min > samples[i]){
				min = samples[i];
			}
		}
		return min;
	}
	
	public double getMaximum(){
		double max = samples[0];
		for(int i = 1; i < counter; i++){
			if(max < samples[i]){
				max = samples[i];
			}
		}
		return max;
   }
   
   public boolean isTemperature(double temp){
	   boolean what = false;
	   for(int i = 0; i < counter && !what; i++){
		   if(temp == samples[i]){
			   what = true;
		   }
	   }
	   return what;
   }
   
   public void insertAt(double temp, int pos){
	   for(int i = counter; i >= pos; i--){
		   samples[pos -1] = temp; 
	   }
	   counter ++;
   }
   public void removeAt(int pos){
	   for(int i = pos; i <= counter; i++){
		   samples[pos] = samples[pos -1];
	   }
	   counter --;
   }
   
   public int firstIndexOfSample(double t){
	   int value = -1;
	   for(int i = 0; i <= counter && i != value; i++){
		   if(t == samples[i]){
			   value = i;
		   }
	   }
	   return value;
   }
   
   public int lastIndexOfSample(double t){
	   int value = -1;
	   for(int i = counter; i >= 0 && i != value; i--){
		   if(t == samples[i]){
			   value = i;
		   }
	   }
	   return value;
   }
   
   public int countSamplesGreaterThan(double t){
	   int count = 0;
	   for(int i = 0; i <= counter;i++){
		   if(t < samples[i]){
			   count++;
		   }
	   }
	   return count;
   }
   
   public int countSamplesLowerThan(double t){
	   int count = 0;
	   for(int i = 0; i <= counter;i++){
		   if(t > samples[i]){
			   count++;
		   }
	   }
	   return count;
   }
	
}
