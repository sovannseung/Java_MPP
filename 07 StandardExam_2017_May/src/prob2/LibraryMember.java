package prob2;

import java.util.Comparator;
import java.util.List;

public class LibraryMember {
	
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord checkoutRecord;
	
	public LibraryMember(String memberId, String firstName, String lastName, String phone) {
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
//	@Override
	public boolean equals(Object title) {
		// TODO Auto-generated method stub
		boolean flag=false;
		List<CheckoutRecordEntry> ckl = checkoutRecord.getCheckoutEntryList();
		for(CheckoutRecordEntry c : ckl) {
			if(c.getLendingItem().getTitle().equals(title)) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	
	
	public static final Comparator PHONE = new Comparator(){
		public int compare(Object o1, Object o2){
			
			String phone1 = new String(((LibraryMember) o1).getPhone());
			String phone2 = new String(((LibraryMember) o2).getPhone());
			
			return phone1.compareTo(phone2);
		}
	};
	
}
