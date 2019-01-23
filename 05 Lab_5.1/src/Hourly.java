
public class Hourly extends Employee {

	private double hourWage;
	private double hoursePerWeek;
	
	public Hourly(String empId, double hourWage, double hoursePerWeek) {
		super(empId);
		this.hourWage = hourWage;
		this.hoursePerWeek = hoursePerWeek;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return hourWage * hoursePerWeek * 4;
	}

}
