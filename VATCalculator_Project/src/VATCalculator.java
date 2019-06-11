/**
 * 
 */

/**
 * @author Rafael Gameiro
 *
 */
public class VATCalculator {
	
	private double min;
	private double max;
	private double med;
	private double TotalIVA, IVAmin, IVAmed, IVAmax;
	private double Net, netmin, netmed, netmax;
	private double Gross;
	
	public VATCalculator(){
		min = 0.05;
		med = 0.12;
		max = 0.20;
		TotalIVA = 0;
		IVAmin = 0;
		IVAmed = 0;
		IVAmax = 0;
		Net = 0;
		netmin = 0;
		netmed = 0;
		netmax = 0;
		Gross = 0;
	}
	
	public VATCalculator(double min, double med, double max){
		this.min = min;
		this.med = med;
		this.max = max;
		TotalIVA = 0;
		IVAmin = 0;
		IVAmed = 0;
		IVAmax = 0;
		Net = 0;
		netmin = 0;
		netmed = 0;
		netmax = 0;
		Gross = 0;
	}
	
	public void addValueMin(double netAmount){
		netmin = netmin + netAmount;
		IVAmin = netmin * min;
	}
	public void addValueMed(double netAmount){
		netmed = netmed + netAmount;
		IVAmed = netmed * med;
	}
	public void addValueMax(double netAmount){
		netmax = netmax + netAmount;
		IVAmax = netmax * max;
	}
	
	public double getVATMin(){
		return IVAmin;
	}
	public double getVATMed(){
		return IVAmed;
	}
	public double getVATMax(){
		return IVAmax;
	}
	public double getVATTotal(){
		double IVA;
		TotalIVA = IVAmin + IVAmed + IVAmax;
		IVA = TotalIVA;
		return IVA;
		
	}
	public double getNetTotal(){
		double net;
		Net = netmin + netmed + netmax;
		net = Net;
		return net;
	}
	public double getGrossTotal(){
	    return Gross = TotalIVA + Net;
	}
	

}