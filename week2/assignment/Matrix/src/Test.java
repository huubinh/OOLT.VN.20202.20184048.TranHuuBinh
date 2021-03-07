import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = keyboard.nextInt();
		System.out.print("Enter the number of column: ");
		int c = keyboard.nextInt();
		Matrices m1 = new Matrices(r,c);
		Matrices m2 = new Matrices(r,c);
		
		System.out.print("Matrix 1:\n");
		for(int i = 0; i<r ; i++)
			for(int j = 0; j<c ; j++) {
				System.out.print("m1[" + i + "][" + j + "] = ");
				m1.setElement(i, j, keyboard.nextInt());
			}
		System.out.print("Matrix 2:\n");
		for(int i = 0; i<r ; i++)
			for(int j = 0; j<c ; j++) {
				System.out.print("m2[" + i + "][" + j + "] = ");
				m2.setElement(i, j, keyboard.nextInt());
			}
		
		System.out.print("Your 1st matrix:\n");
		m1.show();
		System.out.print("\nYour 2nd matrix:\n");
		m2.show();
		keyboard.close();
	}
}
