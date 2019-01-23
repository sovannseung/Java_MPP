import java.time.LocalDate;

public class DateRange {
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	public DateRange(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public boolean isInRange(LocalDate d) {
		return true;
	}

	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
}
