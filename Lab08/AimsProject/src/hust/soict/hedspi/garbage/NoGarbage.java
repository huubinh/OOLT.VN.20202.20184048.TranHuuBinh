package hust.soict.hedspi.garbage;
import java.util.Random;
import java.lang.Math;

public class NoGarbage {
	public static void main(String[] args) {
		String s = "";
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		for (int i=0; i< Math.pow(2,22); i++)
			sbf.append(r.nextInt(2));
		s = sbf.toString();
		System.out.println(System.currentTimeMillis() - start);
		System.out.println(s);
	}
}
