
public class Matrices {
	public Matrices() {
	}
	public void show(int[][] matrix) {
		for(int i=0 ; i<matrix.length ; i++ ) {
			for (int j=0 ; j<matrix[0].length ; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.print("\n");
		}
	}
	public int[][] add(int[][] m1, int[][] m2) {
		int[][] res = new int[m1.length][m1[0].length];
		for(int i=0 ; i<m1.length ; i++ )
			for (int j=0 ; j<m1[0].length ; j++)
				res[i][j] = m1[i][j]+m2[i][j];
		return res;
	}
}