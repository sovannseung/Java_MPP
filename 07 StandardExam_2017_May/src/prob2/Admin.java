package prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<String>();
		
		for(LibraryMember m : members) {
			if(m.equals(item.getTitle())) {
				phoneNums.add(m.getPhone());
			}
		}
		
		Collections.sort(phoneNums);
		
		//implement
		return phoneNums;
	}
}
