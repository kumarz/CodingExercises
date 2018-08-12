package kumar.coding.exercises.dataStructures.Arrays;

import java.util.Arrays;

/**
 * Time complexity is O(n) removing duplicates in one pass.
 * Note, will contain extra elements after in the end, 
 * since we are re-using the same array
 * to save sapce.
 * @author Kumar
 *
 */
public class FindingDuplicateinArray {

	public static void main(String[] args) {
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		int output = removeDuplicates(input);
		System.out.println(output);
	}

	 public static int removeDuplicates(int[] nums) {
		 if (nums.length == 0) return 0;
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    return i + 1;
	 }
	 
	 public void approach2(){
		 int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
	      int[] arr2 = { 16, 17, 19, 21, 1001 };
	      int[] arr3 = new int[arr1.length + arr2.length];
	      int i = 0, j = 0, k = 0;
	      while (i < arr1.length && j < arr2.length) {
	           if (arr1[i] < arr2[j]) {
	               arr3[k] = arr1[i];
	               i++;
	           } else {
	               arr3[k] = arr2[j];
	               j++;
	           }
	           k++;
	      }
	 
	      // Copy the remaining elements in array 1 to array 3
	      if (i < arr1.length) {
	         // arraycopy(source, sourcepos, dest, destpos, numOfElements)
	         System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
	      }
	 
	      // Copy the remaining elements in array 2 to array 3
	      if (j < arr2.length) {
	         // arraycopy(source, sourcepos, dest, destpos, numOfElements)
	         System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
	      }
	      System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
	 }
}
