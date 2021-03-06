import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private String name;
	private List<Department> departments;
	
	public Company(String name) {
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Company Name:" + name);
		for(Department d : departments) {
			d.print();
		}
	}
	
	public void addDepartment(Department d) {
		departments.add(d);
	}
	
	public double getSalary() {
		double total =0;
		for(Department d : departments) {
			total += d.getSalary();
		}
		return total;
	}
}
