
public class ConvertLbsToOz {
	private static final double ONE_LB_IN_OZ = 16.0;
	private double calculatedOzs = 0;
	
	ConvertLbsToOz(double lbsInputByUser) {
		calculatedOzsFromLbs(lbsInputByUser);
		
		System.out.println(lbsInputByUser + " lbs is equal to " + calculatedOzs + " ounces.");
	}
	
	private double calculatedOzsFromLbs(double lbsInputByUser) {
		calculatedOzs = lbsInputByUser * ONE_LB_IN_OZ;
		
		return calculatedOzs;
	}
}
