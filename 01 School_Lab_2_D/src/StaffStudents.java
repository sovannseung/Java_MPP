import java.util.ArrayList;
import java.util.Date;

// Suppose staff members also want to take courses. They get a new title: staffstudents. They still get a salary, 
// and they also have a GPA. For all staffstudents we want to keep track of the starting date of the first course they take. 
// All existing functionality should still work, for example getTotalSalary() should also add salaries payed to staffstudents.

public class StaffStudents extends Staff {

	private double GPA;
	private String StartDate;
	private ArrayList<Course> courses;
	
	public StaffStudents(String name, String phone, int age, double salary, double GPA, String StartDate) {
		super(name, phone, age, salary);
		this.GPA = GPA;
		this.StartDate = StartDate;
	}
	
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
}
