
public class US_Mail extends ShippingUSA {

	public US_Mail(String description, double weight, String zone, String personType) {
		super(description, weight, zone, personType);
	}
	
	public double getRate() {
		if(getWeight() < 3)
			return 1;
		else
			return 0.55 * getWeight();
	}

}
