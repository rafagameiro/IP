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
		WeatherStation s= new WeatherStation();
		double temp;
		
		
		temp = in.nextDouble();
		in.nextLine();
		s.sampleTemperature(temp);
		
		temp = in.nextDouble();
		in.nextLine();
		s.sampleTemperature(temp);
		
		temp = in.nextDouble();
		in.nextLine();
		s.sampleTemperature(temp);
		
		temp = in.nextDouble();
		in.nextLine();
		s.sampleTemperature(temp);
		
		temp = in.nextDouble();
		in.nextLine();
		s.sampleTemperature(temp);
		
		System.out.printf("%.2f\n", s.getAverage());
		System.out.printf("%.2f\n", s.getMaximum());
		System.out.printf("%.2f\n", s.getMinimum());
			
		
		in.close();
		
		

	}

}
