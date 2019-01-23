import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		Employee empSalary = new Salaried("0001", 100);
		System.out.println("************* Salary *************");
		empSalary.print();
		
		Employee empHour = new Hourly("0002", 5, 7);
		System.out.println("************* Hourly *************");
		empHour.print();
		
		List<Order> myOrder1 = Arrays.asList(new Order("001", LocalDate.of(2019, 1, 22),10));
		Employee empCommission1 = new Commissioned("0003", 20, 100, myOrder1);
		System.out.println("************* Commission 2 *************");
		empCommission1.print();
		
		List<Order> myOrder2 = Arrays.asList(new Order("001", LocalDate.of(2019, 1, 22),10), new Order("002", LocalDate.of(2019, 1, 23),20));
		Employee empCommission2 = new Commissioned("0003", 20, 100, myOrder2);
		System.out.println("************* Commission 2 *************");
		empCommission2.print();
		
	}

}
