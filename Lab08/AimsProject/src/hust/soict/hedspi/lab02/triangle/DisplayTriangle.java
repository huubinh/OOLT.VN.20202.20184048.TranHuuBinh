package hust.soict.hedspi.lab02.triangle;
import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter n: ");
		int n = keyboard.nextInt();
		System.out.print("\n");
		
		for (int i=1; i<=n; i++) { 
			for (int j=n-i; j>0;j--)
				System.out.print(" ");
			for (int k=1; k<=2*i-1; k++)
				System.out.print("*");
			System.out.print("\n");
	    }
		keyboard.close();
		System.exit(0);
	}
}
