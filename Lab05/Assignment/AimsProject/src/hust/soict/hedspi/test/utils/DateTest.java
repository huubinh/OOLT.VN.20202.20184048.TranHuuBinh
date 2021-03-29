package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
	public static void main(String args[]) {
	MyDate a = new MyDate(1,2,2000);
	MyDate b = new MyDate(5,7,2002);
	MyDate c = new MyDate(4,2,2001);
	MyDate d = new MyDate(1,2,2000);
	MyDate e = new MyDate(8,3,2000);
	
	MyDate list[] = {a,b,c,d,e};
	list = DateUtils.sortDate(list);
	for ( int i=0; i< list.length; i++)
		System.out.println(list[i].toStringDMYYYY());
	}
}
