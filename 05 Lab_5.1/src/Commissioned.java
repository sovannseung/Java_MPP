import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	private List<Order> order;
	
	public Commissioned(String empId, double commission, double baseSalary, List<Order> order) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.order = order;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub

		double totalAmount=0;
		
		for(Order o : order) {
			
			if(o.getOrderDate().getMonthValue()==month && o.getOrderDate().getYear()==year) {
				totalAmount += o.getOrderAmount();
			}

		}
		
		return baseSalary + totalAmount * commission;
	}
	
}
