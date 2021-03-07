
public class DaysOfMonthYear {
	private int month;
	private int year;
	public void setMonth(int m) {
		this.month = m;
	}
	public int getMonth() {
		return this.month;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public int getYear() {
		return this.year;
	}
	public int verifyMonthYear() {
		if( month>=1 && month<=12 && year>=1 && year<=9999 )
			return 1;
		else return 0;
	}
	public int getNumOfDays() {
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if(year%4 != 0)
					return 28;
				else if(year%100 == 0 && year%400 != 0)
					return 28;
				else return 29;
			default : return 0;
		}
	}
}
