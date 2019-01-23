import java.util.ArrayList;

public class Faculty extends Person {
	
	private double Salary;
	private ArrayList<Course> course;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.Salary = salary;
		
		course = new ArrayList<Course>();
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	// The addCourse method would have to be written in
	// the faculty class.  Something similar would be done 
	// for students.
	public void addCourse(Course c) {
		course.add(c);
	}

	public double getTotalUnits() {
		
		double total=0;
		for(Course c : course) {
			total += c.getUnits();
		}
		
		return total;
	}
	
}
