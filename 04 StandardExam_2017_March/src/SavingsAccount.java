
public class SavingsAccount extends Account {
	
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double balance) {
		this.balance = balance;
		this.interestRate = interestRate;
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
		return balance + (interestRate * balance);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
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
