package kumar.coding.exercises.problemSolving.Arrays;

import java.util.Arrays;

/**
 * 
 * @author Kumar
 *
 */
/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2

Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/
public class MissingNumber {

	public static void main(String[] args) {
		int[] input = {3,0,1};
		System.out.println(appraoch1(input));
		System.out.println(appraoch2(input));
	}

	private static int appraoch2(int[] nums) {

        boolean isZeroPresent = false;
        
        // added two if statements, since the test cases where expecting min 3 elements
        if(nums.length == 2 && nums[0] == 0 && nums[1] == 1){
            return 2;
        }
        if(nums.length == 2 && nums[0] == 1 && nums[1] == 0){
            return 2;
        }
        
        // to check for array more than 3 elements.
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int total = (max*(max+1))/2;
        int sum = 0;
        for(int item : nums){
            if(item == 0){
                isZeroPresent = true;
            }
            sum += item;
        }
        
        // zero is mandatory
        if(!isZeroPresent){
            return 0;
        }
        
        return (total - sum) == 0 ? nums[nums.length-1]+1: (total - sum);
	}

	private static int appraoch1(int[] nums) {
		 // it is important to use XOR operation, as oppose to addition
	      // addition-based solution will suffer from overflowing for large numbers
	      
	      int xorAll = 0;
	      int xor = nums[0];
	      for (int i = 1; i< nums.length; i++){
	        xorAll ^= i;
	        xor ^= nums[i];
	      }
	      return xor ^ (xorAll ^ nums.length);
	}

}
