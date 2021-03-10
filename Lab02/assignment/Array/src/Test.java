import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Arrays array = new Arrays();
		System.out.print("Please enter the length of your array: ");
		int n = keyboard.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = keyboard.nextInt();
		}
		System.out.print("Your array: ");
		array.show(a);
		array.sort(a);
		System.out.print("\nSorted array: ");
		array.show(a);
		System.out.print("\nSum : " + array.sum(a) + "\n");
		System.out.print("Average : " + array.average(a));
	keyboard.close();
	}
}
