import java.util.ArrayList;

public class Department {
	
	private String Name;
	private ArrayList<Person> person;
	
	public Department(String Name) {
		this.Name = Name;
		person = new ArrayList<Person>();
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void addPerson(Person p) {
		person.add(p);
	}
	
	public double getTotalSalary() {
		
		double totalSalary=0;
		
		// 1. use instand of
//		for(Person p : person) {
//			if(p instanceof Faculty) {
//				Faculty f = (Faculty) p;
//				totalSalary += f.getSalary();
//			}
//			else if(p instanceof Staff) {
//				Staff s = (Staff) p;
//				totalSalary += s.getSalary();
//			}
//		}
		
		// 2. polymorphism
		for(Person p : person) {
			totalSalary += p.getSalary();
		}
		
		return totalSalary;
	}
	
	// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
	public void showAllMembers() {
		for(Person p : person) {
			System.out.println("Name:" + p.getName() + ", Age:" + p.getAge() + ", Type:" + p.getClass().getName());
		}
	}
	
	// shows a list of all faculty names and the total number of units they teach. 
	public void unitsPerFaculty() {
		Faculty f;
		double total=0;
		for(Person p : person) {
			
			// 1. Use  instanceOf
//			if(p instanceof Faculty) {
//				f = (Faculty) p;
//				System.out.println("Faculty name:" + f.getName());
//				total += f.getTotalUnits();
//			}
			
			// 2. User getClass().getSimpleName()
			if(p.getClass().getSimpleName().equals("Faculty")) {
				f = (Faculty) p;
				System.out.println("Faculty name:" + f.getName());
				total += f.getTotalUnits();
			}
		}
		System.out.println("Total number of units they teach:" + total);
	}
}
