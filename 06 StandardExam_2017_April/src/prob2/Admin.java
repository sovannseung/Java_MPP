package prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	
	private Department[] department;
	
	//implement
	Admin(Department[] d){
		//department = new ArrayList<Department>();
		
		department = d;
	}
	
	public String hourlyCompanyMessage() {
		StringBuilder sb = new StringBuilder();
		
		for(Department d : department) {
			sb.append(format(d.getName(), d.nextMessage()) + "\n");
		}
		
		return sb.toString();
	}
	
	public String format(String name, String msg) {
		return name + ": " + msg;
	}
	
}
