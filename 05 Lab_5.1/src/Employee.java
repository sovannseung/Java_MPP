import java.time.LocalDate;

public abstract class Employee {
	private String empId;
	
	public Employee(String empId) {
		this.empId = empId;
	}

	// print by use current date.
	public void print() {
		LocalDate now = LocalDate.of(2019, 01, 22);
		Paycheck payCheck = calcCompensation(now.getMonthValue(), now.getYear());
		payCheck.print();
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(this, grossPay, Tax.FICA, Tax.STATE, Tax.LOCAL, Tax.MEDICARE, Tax.SSN);
	}
	
	public abstract double calcGrossPay(int month, int year);
	
}
