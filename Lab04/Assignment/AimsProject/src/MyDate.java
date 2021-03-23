
public class MyDate {
	private String day;
	private String month;
	private String year;
	
	public MyDate(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void print() {
		System.out.println(month + " "+ day + " " + year);
	}
}
