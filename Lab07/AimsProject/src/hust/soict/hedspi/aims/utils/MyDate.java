package hust.soict.hedspi.aims.utils;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public MyDate(String day, String month, String year) {
		this.day = DateUtils.toIntDay(day);
		this.month = DateUtils.toIntMonth(month);
		this.year = Integer.parseInt(year);
	}
	public MyDate(int day, String month, String year) {
		this.day = day;
		this.month = DateUtils.toIntMonth(month);
		this.year = Integer.parseInt(year);
	}
	public MyDate(String day, int month, String year) {
		this.day = DateUtils.toIntDay(day);
		this.month = month;
		this.year = Integer.parseInt(year);
	}
	public MyDate(String day, String month, int year) {
		this.day = DateUtils.toIntDay(day);
		this.month = DateUtils.toIntMonth(month);
		this.year = year;
	}
	public MyDate(int day, int month, String year) {
		this.day = day;
		this.month = month;
		this.year = Integer.parseInt(year);
	}
	public MyDate(int day, String month, int year) {
		this.day = day;
		this.month = DateUtils.toIntMonth(month);
		this.year = year;
	}
	public MyDate(String day, int month, int year) {
		this.day = DateUtils.toIntDay(day);
		this.month = month;
		this.year = year;
	}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toStringDate() {
		return String.join(" ",DateUtils.toStringMonth(month),DateUtils.toStringDay(day),Integer.toString(year));
	}
	public String toStringDMYYYY() {
		return String.join("/",Integer.toString(day),
						Integer.toString(month),Integer.toString(year));
	}
}
