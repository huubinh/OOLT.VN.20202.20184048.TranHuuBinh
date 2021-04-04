package hust.soict.hedspi.aims.utils;
public class DateUtils {
	public static String toStringDay(int day) {
		switch(day) {
		case 1:
		case 21:
		case 31:
			return Integer.toString(day) + "st";
		case 2:
		case 22:
			return Integer.toString(day) + "nd";
		case 3:
		case 23:
			return Integer.toString(day) + "rd";
		default :
			return Integer.toString(day) + "th";
		}
	}
	public static String toStringMonth(int month) {
		switch(month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default: return null;
		}
	}
	public static int toIntDay(String day) {
		if (day.length() == 3)
			return Integer.parseInt(day.substring(0, 1));
		else 
			return Integer.parseInt(day.substring(0, 2));
	}
	public static int toIntMonth(String month) {
		switch (month) {
			case "January":
				return 1;
			case "February":
				return 2;
			case "March":
				return 3;
			case "April":
				return 4;
			case "May":
				return 5;
			case "June":
				return 6;
			case "July":
				return 7;
			case "August":
				return 8;
			case "September":
				return 9;
			case "October":
				return 10;
			case "November":
				return 11;
			case "December":
				return 12;
			default: return 0;
		}
	}
	public static int compareDate(MyDate d1, MyDate d2) {
		if ( d1.getYear() < d2.getYear())
			return -1;
		else if ( d1.getYear() > d2.getYear() )
			return 1;
		else if ( d1.getMonth() < d2.getMonth() )
			return -1;
		else if ( d1.getMonth() > d2.getMonth() )
			return 1;
		else if ( d1.getDay() < d2.getDay() )
			return -1;
		else if ( d1.getDay() > d2.getDay() )
			return 1;
		else return 0;
	}
	public static MyDate[] sortDate(MyDate list[]) {
		for (int i=0; i< list.length-1; i++)
			for (int j = i +1; j< list.length; j++)
				if (compareDate(list[i],list[j])==1) {
					MyDate tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
		return list;
	}
}
