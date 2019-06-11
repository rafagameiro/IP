/**
 * 
 */
package With_Menu;

/**
 * @author Rafael Gameiro
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String VALUE_TEMPERATURE = "RT";
	public static final String REGISTED_TEMPERATURES = "NT";
	public static final String MEDIA = "AT";
	public static final String MAXIMUM_TEMPERATURE = "GT";
	public static final String MINIMUM_TEMPERATURE = "LT";
	public static final String LEAVE = "S";
	
	private static void processTemperature(WeatherStation s, Scanner in){
		// TODO Auto-generated method stub
		double op;
		op = in.nextDouble();
		s.sampleTemperature(op);
		System.out.println("Temperatura registada com sucesso.");
	}
	private static void processRegisted(WeatherStation s, Scanner in) {
		// TODO Auto-generated method stub
		if(s.numberTemperatures() == 0){
			System.out.println("Sem temperaturas.");
		}else{
			System.out.println("Ha " + s.numberTemperatures() + " temperaturas registadas.");
		}
		
		in.nextLine();
	}

	private static void processMedia(WeatherStation s, Scanner in) {
		// TODO Auto-generated method stub
		if(s.numberTemperatures() == 0){
			System.out.println("Sem temperaturas.");
		}else{
			System.out.printf("Media: %.2f.\n", s.getAverage());		
		}
		in.nextLine();
	}

	private static void processMax(WeatherStation s, Scanner in) {
		// TODO Auto-generated method stub
		if(s.numberTemperatures() == 0){
			System.out.println("Sem temperaturas.");
		}else{
			System.out.printf("Maxima: %.2f.\n", s.getMaximum());
			}
		in.nextLine();
	}

	private static void processMin(WeatherStation s, Scanner in) {
		// TODO Auto-generated method stub
		if(s.numberTemperatures() == 0){
			System.out.println("Sem temperaturas.");
		}else{
			System.out.printf("Minima: %.2f.\n", s.getMinimum());
		}
		in.nextLine();
	}

	private static void processLeave(Scanner in) {
		// TODO Auto-generated method stub
		in.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherStation s = new WeatherStation();
		Scanner in = new Scanner(System.in);
		
		
		String option = "";
		
		while(!option.equals(LEAVE)){
		option = in.next().toUpperCase();
			
			switch(option){
			case VALUE_TEMPERATURE: processTemperature(s,in);break;
			case REGISTED_TEMPERATURES:processRegisted(s,in);break;
			case MEDIA: processMedia(s,in);break;
			case MAXIMUM_TEMPERATURE:processMax(s,in);break;
			case MINIMUM_TEMPERATURE:processMin(s,in);break;
			case LEAVE:processLeave(in);break;
			default: System.out.println("Comando Invalido.");break;
		
			}
		}

		in.close();	
	}
}

