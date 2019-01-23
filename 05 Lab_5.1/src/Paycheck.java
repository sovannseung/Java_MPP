
public class Paycheck {

		private double grossPay;
		private double fica;
		private double state;
		private double local;
		private double medicare;
		private double socialSecurity;
		private Employee emp;
		
		public Paycheck(Employee emp, double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
			this.emp = emp;
			this.grossPay = grossPay;
			this.fica = fica;
			this.state = state;
			this.local = local;
			this.medicare = medicare;
			this.socialSecurity = socialSecurity;
		}
		
		public Employee getEmp() {
			return emp;
		}

		public double getGrossPay() {
			return grossPay;
		}

		public double getFica() {
			return fica;
		}

		public double getState() {
			return state;
		}

		public double getLocal() {
			return local;
		}

		public double getMedicare() {
			return medicare;
		}

		public double getSocialSecurity() {
			return socialSecurity;
		}
		
		public void print() {
			System.out.println("Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
					+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity 
					+ ", getNetPay()=" + getNetPay() + "]");
		}
		
		public double getNetPay() {
			return grossPay - (grossPay * 0.23) - (grossPay * 0.05) - (grossPay * 0.01) - (grossPay * 0.03) - (grossPay * 0.075); 
		}
		
}
