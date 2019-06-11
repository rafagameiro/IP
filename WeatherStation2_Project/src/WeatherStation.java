

/**
 * @author Rafael Gameiro
 *
 */
public class WeatherStation {
	private int counter;
	private double max;
	private double min;
	private double sum;
	
	
	public WeatherStation(){
		counter = 0;
		sum = 0;
		max = Double.NEGATIVE_INFINITY;
		min = Double.POSITIVE_INFINITY;
		
	}
	
	public void sampleTemperature(double temp){
		counter++;
		if (temp > max){
			max = temp;
		}
		if (temp < min){
			min = temp;
		}
		sum += temp;	
	}
	
	public int numberTemperatures(){
		return counter;
	}
	
	
	public double getMaximum(){
		return max;
	}
	// Pre: numberTemperatures > 0
	
	public double getMinimum(){
		return min;
	}
	// Pre: numberTemperatures > 0
	
	public double getAverage(){
		double ave;
		if (counter != 0){
			ave = (sum / counter);
		}else
		ave = 0;
		return ave;
	}
	// Pre: numberTemperatures > 0

}
