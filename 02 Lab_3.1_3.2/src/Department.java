import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private String location;
	private List<Position> positions;
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void print() {
		System.out.println("   Department Name:" + name + ", Department Location:" + location);
		for(Position p : positions) {
			p.print();
		}
	}
	
	public void addPosition(Position p) {
		positions.add(p);
	}
	
	public double getSalary() {
		double total=0;
		for(Position p : positions) {
			total += p.getSalary();
		}
		return total;
	}
	
	
}
