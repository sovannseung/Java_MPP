
public class MainApp {

	public static void main(String[] args) {
		
		
		// Test point: 1  
		Employee employee_equal_1 = new Employee(1, "firstName", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 1);
		Employee employee_equal_2 = new Employee(1, "firstName", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 1);
		System.out.println("Employee must be true: " + employee_equal_1.equals(employee_equal_2));
		
		Employee employee_unequal_1 = new Employee(1, "firstName", "middleInitial 01", "lastName 01", "2010-01-01", "SSN 01", 1);
		Employee employee_unequal_2 = new Employee(1, "first Name", "middle Initial 01", "lastName 01", "2010-01-01", "SSN 01", 1);
		System.out.println("Employee must be false: " + employee_unequal_1.equals(employee_unequal_2));
		
		// Test point: 2
		Position position_equal_1 = new Position("Position","Description",employee_equal_1);
		Position position_equal_2 = new Position("Position","Description",employee_equal_2);
		System.out.println("Position must be true: " + position_equal_1.equals(position_equal_2));
		
		Position position_unequal_1 = new Position("Position","Description",employee_equal_1);
		Position position_unequal_2 = new Position("Position","Description",employee_unequal_2);
		System.out.println("Position must be false: " + position_unequal_1.equals(position_unequal_2));
	
		
		
	}

}
