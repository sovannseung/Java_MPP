import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> account;
	
	public Employee(String name) {
		this.name = name;
		
		account = new ArrayList<Account>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		account.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double total = 0;
		
		for(Account a : account) {
			total += a.computeUpdatedBalance();
		}
		
		return total;
	}
}
