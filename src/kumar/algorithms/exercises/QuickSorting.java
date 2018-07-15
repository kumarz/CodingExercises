package kumar.algorithms.exercises;

/**
 * 
 * @author Kumar
 * This is an implementation of Quick Sorting.
 *
 */
public class QuickSorting {
	static int sample[] = {87,235,64,84,23,222,675,674,234,2,4,6,74,34,26,95};
	public static void main(String[] args) {
		
		quickSort(0,sample.length-1);
		for(int value : sample){
			System.out.println(value);
		}
	}

	private static void quickSort(int low, int high) {        
		int i = low;
	    int j = high;
	
	    // pivot is middle index
	    int pivot = sample[low + (high - low) / 2];
	
	    // Divide into two arrays
	    while (i <= j) {
	        /**
	         * As shown in above image, In each iteration, we will identify a
	         * number from left side which is greater then the pivot value, and
	         * a number from right side which is less then the pivot value. Once
	         * search is complete, we can swap both numbers.
	         */
	        while (sample[i] < pivot) {
	            i++;
	        }
	        while (sample[j] > pivot) {
	            j--;
	        }
	        if (i <= j) {
	            swap(i, j);
	            // move index to next position on both sides
	            i++;
	            j--;
	        }
	    }
	
	    // calls quickSort() method recursively
	    if (low < j) {
	        quickSort(low, j);
	    }
	
	    if (i < high) {
	        quickSort(i, high);
	    }
	}
	
	private static void swap(int i, int j) {
	    int temp = sample[i];
	    sample[i] = sample[j];
	    sample[j] = temp;
	}

}
