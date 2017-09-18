public class InsertionSort implements SortingAlgorithm {
	//default sort method
	public void sort(int[] a) {
		//iterate through array
		for (int i = 1; i < a.length; i++) {
			//variables to move things around
			int temp = a[i];
			int j = i - 1;
			//check if the next previous items are bigger
			while (j >= 0 && a[j] > temp) {
				//change the next term to the previous term
				a[j + 1] = a[j];
				//decrement by one to check previous elements
				j--;
			}
			//switch the elements
			a[j + 1] = temp;
		}

	}

}
