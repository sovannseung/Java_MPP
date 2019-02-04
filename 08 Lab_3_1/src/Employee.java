import java.util.Objects;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String SSN;
	private double salary;
	
	public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, String sSN, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(employeeId,firstName,middleInitial,lastName,birthDate,SSN,salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		
		Employee em = (Employee) obj;
		
		if(employeeId == em.employeeId && firstName.equals(em.firstName) && middleInitial.equals(em.middleInitial) && lastName.equals(em.lastName) && 
		   birthDate.equals(em.birthDate) && SSN.equals(em.SSN) && salary == em.salary) 
			return true;
		else
			return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee emp = (Employee) super.clone();
		
		return emp;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void print() {
		System.out.println("         Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", SSN=" + SSN + ", salary=" + salary + "]");
	}
	
}
