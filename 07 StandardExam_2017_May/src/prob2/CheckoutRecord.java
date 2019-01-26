package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> checkoutRecord;
	
	public CheckoutRecord() {
		checkoutRecord = new ArrayList<CheckoutRecordEntry>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutRecord;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutRecord.add(entry);
	}
	
	
	
}
