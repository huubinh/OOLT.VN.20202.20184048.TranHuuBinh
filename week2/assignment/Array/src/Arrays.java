
public class Arrays {
	private int[] array;
	public Arrays(int n) {
		array = new int[n] ;
	}
	public void setElement(int i, int a) {
		this.array[i] = a;
	}
	public int getElement(int i) {
		return this.array[i];
	}
	public void sort() {
		for (int i=0; i< array.length-1; i++)
			for (int j = i +1; j< array.length; j++)
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
	}
	public int sum() {
		int sum = 0;
		for (int i=0; i< array.length; i++)
			sum += array[i];
		return sum;
	}
	public double average() {
		return (double)sum()/array.length;
	}
	public void show() {
		for (int i=0; i< array.length-1; i++)
			System.out.print(array[i] + ", ");
		System.out.print(array[array.length-1]);
	}
}
