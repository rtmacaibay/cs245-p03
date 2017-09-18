public class QuickSort implements SortingAlgorithm {
	//default sort method
	public void sort(int[] a) {
		//begin recursive method
		qsort(a, 0, a.length - 1);
	}
	
	//recursive method for quicksort
	private void qsort(int[] a, int top, int bot) {
		//find pivot point
		int pivot = partition(a, top, bot);
		
		//base cases
		if (top < pivot - 1)
			qsort(a, top, pivot - 1);
		if (bot > pivot)
			qsort(a, pivot, bot);
	}
	
	//move elements around, lower elements below pivot and bigger elements above pivot
	private int partition(int[] a, int top, int bot) {
		//variables to keep track
		int i = top;
		int j = bot;
		int pivot = (top + bot) / 2;
		
		//watches until i and j cross
		while (i <= j) {
			//compares values and check if each number belongs in that section
			while (a[i] < a[pivot])
				i++;
			while (a[j] > a[pivot])
				j--;
			//checks if i and j havent crossed
			if (i <= j) {
				//keep track of pivot
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				//swap elements
				swap(a, i++, j--);
			}
		}
		
		return i;
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
