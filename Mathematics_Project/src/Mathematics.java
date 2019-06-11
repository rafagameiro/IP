/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
import java.math.*;

public class Mathematics {
	
	
	
	//Pre n >= 1
	public static boolean isPrime(int n){
		int i= 2;
		while ((i <= Math.sqrt(n)) && (n %i!=0)){
			i++;
		}
		return (i > Math.sqrt(n));
	}
	
    public static boolean isPerfect(int n){
		int d = 1;
		int total = 0;
		
		while (d<n){
			if(n % d == 0){
				total = total + d;
			}
			d++;
		}
		return (total == n);
	}
	
	public static int perfectNumber(int n){
		int i = 1;
		while(1 < 10000){
			if(Mathematics.isPerfect(i)){
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static int fatorialRec(int n){
		int res;
		if(n == 0){
			res = 1;
		}else res = n * fatorialRec(n-1);
		return res;
	}
	/*or......
	public static int FatorialIt(int n){
	int res = 1;
	int i = n;
	while (i>1){
	res = res * i;
	i--
	}
	return res;
	}
	*/
	
	public static int fibonacciRec(int n){
		int res;
		if(n <= 1){
			res = n;	
		}else res = fibonacciRec(n-1) + fibonacciRec(n-2);
		return res;
	}
	

}
