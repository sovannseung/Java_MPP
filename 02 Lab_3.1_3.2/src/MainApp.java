
public class MainApp {

	public static void main(String[] args) {
		
		// creates a Company object with two Department objects
		Company company = new Company("Company 01");
		
		Department department1 = new Department("Department 1", "Location 1");
		Department department2 = new Department("Department 2", "Location 2");
		
		company.addDepartment(department1);
		company.addDepartment(department2);
		
		Employee employee1_1 = new Employee(1, "firstName 1_1", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 1);
		Employee employee1_2 = new Employee(1, "firstName 1_2", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 2);
		Employee employee1_3 = new Employee(1, "firstName 1_3", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 3);
		
		Employee employee2_1 = new Employee(1, "firstName 2_1", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 4);
		Employee employee2_2 = new Employee(1, "firstName 2_2", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 5);
		Employee employee2_3 = new Employee(1, "firstName 2_3", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 6);
		
		// Each department should have at least three positions
		Position position1_1 = new Position("Position1_1","Description 1_1",employee1_1);
		Position position1_2 = new Position("Position1_2","Description 1_2",employee1_2);
		Position position1_3 = new Position("Position1_3","Description 1_3",employee1_3);
		department1.addPosition(position1_1);
		department1.addPosition(position1_2);
		department1.addPosition(position1_3);
		
		Position position2_1 = new Position("Position2_1","Description 2_1",employee2_1);
		Position position2_2 = new Position("Position2_2","Description 2_2",employee2_2);
		Position position2_3 = new Position("Position2_3","Description 2_3",employee2_3);
		department2.addPosition(position2_1);
		department2.addPosition(position2_2);
		department2.addPosition(position2_3);
		
		// for Lab 3.1
		company.print();
		
		// for Lab 3.2
		System.out.println("Total salary:" + company.getSalary());  
		
	}

}
