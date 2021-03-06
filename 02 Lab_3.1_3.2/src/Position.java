
public class Position {

	private String title;
	private String description;
	private Employee employee;
	
	public Position(String title, String description, Employee employee) {
		this.title = title;
		this.description = description;
		this.employee = employee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void print() {
		System.out.println("      Position title:" + title + ", Position description:" + description);
			employee.print();
	}
	
	public double getSalary() {
		return employee.getSalary();
	}
	
}
