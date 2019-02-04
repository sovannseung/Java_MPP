
import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		//output the list of all Students from the original list that have a gpa greater than 3.0 and have a major of "Computer Science". 
		
		return list.stream()
		    .filter(s -> s.getGpa()>3.0 && s.getMajor().equals("Computer Science"))
		    .collect(Collectors.toList());
		
	}
}
