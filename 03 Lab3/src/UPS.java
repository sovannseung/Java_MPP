
public class UPS extends ShippingUSA {

	public UPS(String description, double weight, String zone, String personType) {
		super(description, weight, zone, personType);
	}
	
	public double getRate() {
		return 0.45 * getWeight();
	}

}
