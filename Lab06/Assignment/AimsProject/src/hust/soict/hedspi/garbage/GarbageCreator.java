package hust.soict.hedspi.garbage;
import java.util.Random;
import java.lang.Math;

public class GarbageCreator {
	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i=0; i< Math.pow(2,22); i++)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		System.out.println(s);
	}
}
