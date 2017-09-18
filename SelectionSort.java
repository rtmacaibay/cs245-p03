public class SelectionSort implements SortingAlgorithm {
	//default sort method
	public void sort(int[] a) {
		//keep track of lowest number
		int min = 0;
		
		//iterate through entire array
		for (int i = 0; i < a.length; i++) {
			//keep track of initial point
			min = i;
			//iterate through every part after the sorted part
			for (int j = i + 1; j < a.length; j++) {
				//compare if our min isnt really our min
				if (a[min] > a[j]) {
					min = j;
				}
			}
			//swap...
			swap(a, i, min);
		}
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
