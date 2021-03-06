
public class CheckingAccount extends Account {

	private double balance;
	private double monthlyFee;
	private String acctId;
	
	public CheckingAccount(String acctId, double monthlyFee, double balance) {
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.acctId = acctId;
	}

	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance - monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
