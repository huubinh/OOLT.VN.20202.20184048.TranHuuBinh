import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the length of your array: ");
		int n = keyboard.nextInt();
		Arrays array = new Arrays(n);
		for (int i=0; i<n; i++) {
			System.out.print("array[" + i + "] = ");
			array.setElement(i, keyboard.nextInt());
		}
		System.out.print("Your array: ");
		array.show();
		array.sort();
		System.out.print("\nSorted array: ");
		array.show();
		System.out.print("\nSum : " + array.sum() + "\n");
		System.out.print("Average : " + array.average());
	keyboard.close();
	}
}
