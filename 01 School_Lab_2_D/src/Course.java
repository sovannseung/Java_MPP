
public class Course {

	private String Number;
	private String Title;
	private int Units;
	
	public Course(String number, String title, int units) {
		Number = number;
		Title = title;
		Units = units;
	}

	public String getNumber() {
		return Number;
	}
	
	public void setNumber(String number) {
		Number = number;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setTitle(String title) {
		Title = title;
	}
	
	public int getUnits() {
		return Units;
	}
	
	public void setUnits(int units) {
		Units = units;
	}
	
}
