/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Speed caracol = new Speed();
		caracol.SetinMS(0.001);
		caracol.GetinMS();
		System.out.println(caracol.GetinMS());// 0.001 (double)
		caracol.GetinKM();
		System.out.println(caracol.GetinKM());// 0.0036000000000000003 (double)
		caracol.GetinMP();
		System.out.println(caracol.GetinMP());// 0.002236936 (double)
		
		Speed obikwelu = new Speed();
		obikwelu.SetinKM(36.0);
		obikwelu.GetinMS();
		System.out.println(obikwelu.GetinMS());// 10.0 (double)
		obikwelu.GetinKM();
		System.out.println(obikwelu.GetinKM());// 36.0 (double)
		obikwelu.GetinMP();
		System.out.println(obikwelu.GetinMP());// 22.36936 (double)
		obikwelu.SetinMP(24.0);
		obikwelu.GetinKM();
		System.out.println(obikwelu.GetinKM());// 38.624261042783516 (double)
	

	}

}
