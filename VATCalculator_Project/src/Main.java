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
		
		VATCalculator v = new VATCalculator(0.05, 0.12, 0.20);
		
		v.addValueMin(253);
		v.addValueMed(3100);
		v.addValueMax(500);
		v.getVATMin();
		System.out.println(v.getVATMin());// 12.65 (double)
		v.getVATMed();
		System.out.println(v.getVATMed());// 372.0 (double)
		v.getVATMax();
		System.out.println(v.getVATMax());// 100.0 (double)
		v.getVATTotal();
		System.out.println(v.getVATTotal());// 484.65 (double)
		v.getNetTotal();
		System.out.println(v.getNetTotal());// 3853.0 (double)
		v.getGrossTotal();
		System.out.println(v.getGrossTotal());// 4337.65 (double)
		v.addValueMed(405);
		v.getVATTotal();
		System.out.println(v.getVATTotal());// 533.25 (double)
		v.getNetTotal();
		System.out.println(v.getNetTotal());// 4258.0 (double)
		v.getGrossTotal();
		System.out.println(v.getGrossTotal());// 4791.25 (double)

	}

}
