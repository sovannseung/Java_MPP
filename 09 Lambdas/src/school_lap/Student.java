package school_lap;
import java.util.ArrayList;

public class Student extends Person {

	private double GPA;
	private ArrayList<Course> course;
	
	public Student(String name, String phone, int age, double gPA) {
		super(name, phone, age);
		GPA = gPA;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public double getTotalUnits() {
		return 0;
	}
	
	public void addCourse(Course c) {
		course.add(c);
	}
}
