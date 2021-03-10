import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Matrices matrix = new Matrices();
		System.out.print("Enter the number of rows: ");
		int r = keyboard.nextInt();
		System.out.print("Enter the number of column: ");
		int c = keyboard.nextInt();
		
		int[][] m1 = new int[r][c];
		int[][] m2 = new int[r][c];
		
		System.out.print("Matrix 1:\n");
		for(int i = 0; i<r ; i++)
			for(int j = 0; j<c ; j++) {
				System.out.print("m1[" + i + "][" + j + "] = ");
				m1[i][j] = keyboard.nextInt();
			}
		System.out.print("Matrix 2:\n");
		for(int i = 0; i<r ; i++)
			for(int j = 0; j<c ; j++) {
				System.out.print("m2[" + i + "][" + j + "] = ");
				m2[i][j] = keyboard.nextInt();
			}
		
		System.out.print("Your 1st matrix:\n");
		matrix.show(m1);
		System.out.print("\nYour 2nd matrix:\n");
		matrix.show(m2);
		System.out.print("\nSum of 2 matrices:\n");
		matrix.show(matrix.add(m1,m2));
		keyboard.close();
	}
}