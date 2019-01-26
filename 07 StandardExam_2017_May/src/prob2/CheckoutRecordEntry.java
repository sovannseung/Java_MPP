package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	
	private LocalDate checkOutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType itemType;
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkOutDate, LocalDate dueDate, ItemType itemType) {
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.itemType = itemType;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getItemType() {
		return itemType;
	}
	
	
}
