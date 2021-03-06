
public class FedEx extends ShippingUSA {

	public FedEx(String description, double weight, String zone, String personType) {
		super(description, weight, zone,personType);
	}

	public double getRate() {
		double rate;
		String zone = getZone();
		
		if(zone.equals("IA") || zone.equals("MT") || zone.equals("OR") || zone.equals("CA")) {
			rate = 0.35;
		}
		else if(zone.equals("TX") || zone.equals("UT")) {
			rate = 0.30;
		}
		else if(zone.equals("FL") || zone.equals("MA") || zone.equals("OH")) {
			rate = 0.55;
		}
		else {
			rate = 0.43;
		}
		
		return rate * getWeight();
	}
	
}
