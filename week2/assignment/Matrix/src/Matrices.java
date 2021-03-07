
public class Matrices {
	private int[][] matrix;
	public Matrices(int r, int c) {
		matrix = new int[r][c];
	}
	public void setElement(int i, int j, int v) {
		this.matrix[i][j] = v;
	}
	public int getElement(int r, int c) {
		return this.matrix[r][c];
	}
	public void show() {
		for(int i=0 ; i<matrix.length ; i++ ) {
			for (int j=0 ; j<matrix[0].length ; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.print("\n");
		}
	}
	
}
