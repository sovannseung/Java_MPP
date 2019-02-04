import java.util.Objects;

public class Position {

	private String title;
	private String description;
	private Employee employee;
	
	public Position(String title, String description, Employee employee) {
		this.title = title;
		this.description = description;
		this.employee = employee;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		
		Position pos = (Position) obj;
		if(title.equals(pos.title) && description.equals(pos.description) && employee.equals(pos.employee))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(title,description,employee);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Position pos = (Position) super.clone();
		return pos;
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
