public class BubbleSort implements SortingAlgorithm {
	//default sort method
	public void sort(int[] a) {
		//iterate through array ASSUMING each iteration the last element is in its right place
		for (int i = a.length; i >= 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				//check if the next element is smaller than our current
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
