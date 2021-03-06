
public class ShippingUSA {
	// description, the weight and the zone
	
	private String description;
	private double weight;
	private String zone;
	private String personType;
	
	public ShippingUSA(String description, double weight, String zone, String personType) {
		this.description = description;
		this.weight = weight;
		this.zone = zone;
		this.personType = personType;
	}
	
	public String getPersonType() {
		return personType;
	}
	
	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public double getRate() {
		return 0;
	}
	
}
