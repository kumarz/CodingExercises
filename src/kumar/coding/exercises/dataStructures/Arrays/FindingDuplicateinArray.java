package kumar.coding.exercises.dataStructures.Arrays;
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
}
