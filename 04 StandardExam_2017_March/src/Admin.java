
import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double total=0;
		
		for(Employee e : list) {
			total += e.computeUpdatedBalanceSum();
		}
		
		return total;
	}
}
