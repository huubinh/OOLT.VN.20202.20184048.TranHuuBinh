package hust.soict.hedspi.lab02.array;

public class Arrays {
	
	public Arrays() {
	}
	public void sort(int[] array) {
		for (int i=0; i< array.length-1; i++)
			for (int j = i +1; j< array.length; j++)
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
	}
	public int sum(int[] array) {
		int sum = 0;
		for (int i=0; i< array.length; i++)
			sum += array[i];
		return sum;
	}
	public double average(int[] array) {
		return (double)sum(array)/array.length;
	}
	public void show(int[] array) {
		for (int i=0; i< array.length-1; i++)
			System.out.print(array[i] + ", ");
		System.out.print(array[array.length-1]);
	}
}
