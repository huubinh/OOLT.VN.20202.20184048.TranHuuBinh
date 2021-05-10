package hust.soict.hedspi.lab02.numofdays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DateConverter convert = new DateConverter();
		System.out.print("Enter the month: ");
		String month = keyboard.nextLine();
		int m = convert.getMonth(month);
		if ( m == 0 ) {
			System.out.print("Invalid month");
			System.exit(-1);
		}
		else {
		DaysOfMonthYear get = new DaysOfMonthYear();
		get.setMonth(m);
		System.out.print("Enter the year: ");
		int y = keyboard.nextInt();
		get.setYear(y);
		int d = get.verifyMonthYear();
		if ( d == 0 ) {
			System.out.print("Invalid date");
			System.exit(-1);
		}
		else {
			System.out.print("Number of days of " + get.getMonth() + "/" + get.getYear() + " : " + get.getNumOfDays());
			System.exit(0);
		}
}
		keyboard.close();
	}
}
