
public class ConvertOzToLbs {
	private static final double ONE_OZ_IN_LB = 0.0625;
	private double calculatedLbs = 0;
	
	ConvertOzToLbs(double ozInputByUser) {
		calculatedLbsFromOzs(ozInputByUser);
		
		System.out.println(ozInputByUser + " ounces is equal to " + calculatedLbs + " lbs.");
	}
	
	private double calculatedLbsFromOzs(double ozInputByUser) {
		calculatedLbs = ozInputByUser * ONE_OZ_IN_LB;
		
		return calculatedLbs;
	}
}
