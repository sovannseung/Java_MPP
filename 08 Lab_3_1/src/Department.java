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

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Department dep = (Department) obj;

		boolean result = true;
		if (name.equals(dep.name) && location.equals(dep.location)) {
			if (positions.size() != dep.positions.size()) {
				return false;
			} 
			else {
				for (int i = 0; i < positions.size(); i++) {
					if (!positions.get(i).equals(dep.positions.get(i))) {
						result = false;
						break;
					}
				}
			}
		} 
		else {
			result = false;
		}

		return result;
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
		for (Position p : positions) {
			p.print();
		}
	}

	public void addPosition(Position p) {
		positions.add(p);
	}

	public double getSalary() {
		double total = 0;
		for (Position p : positions) {
			total += p.getSalary();
		}
		return total;
	}

}
