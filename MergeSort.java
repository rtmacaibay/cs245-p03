public class MergeSort implements SortingAlgorithm {
	//default sort method
	public void sort(int[] a) {
		//base case to check if we reached our one-sized arrays
		if (a.length > 1) {
			//create split arrays
			int[] top = new int[a.length / 2];
			int[] bot = new int[a.length - top.length];
			divide(a, top, bot);
			//sort the two different arrays
			sort(top);
			sort(bot);
			//merge to sort
			merge(a, top, bot);
		}
	}

	//merge two arrays together
	private void merge(int[] a, int[] top, int[] bot) {
		int top_i = 0;
		int bot_i = 0;
		int a_i = 0;
		
		//compares value by value then puts them into array
		while (top_i < top.length && bot_i < bot.length) {
			if (top[top_i] <= bot[bot_i]) {
				a[a_i++] = top[top_i++];
			} else {
				a[a_i++] = bot[bot_i++];
			}
		}
		
		//if bot array out, fill in the rest
		while (top_i < top.length) {
			a[a_i++] = top[top_i++];
		}
		
		//if top array out, fill in the rest
		while (bot_i < bot.length) {
			a[a_i++] = bot[bot_i++];
		}
	}
	
	//divides array into half arrays
	private void divide(int[] a, int[] top, int[] bot) {
		//the middle point in the array
		int div_point = a.length / 2;
		
		//fill top array
		for (int i = 0; i < div_point; i++) {
			top[i] = a[i];
		}
		//fill bot array
		for (int i = 0, j = div_point; j < a.length; i++, j++) {
			bot[i] = a[j];
		}
	}
}
