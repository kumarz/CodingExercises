package kumar.coding.exercises.problemSolving.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		System.out.println(approach1(input));
		System.out.println(approach2(input));
	}

	private static int approach1(int[] nums) {

        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
	}

	private static int approach2(int[] nums) {
	 // it is important to use XOR operation, as oppose to addition
      // addition-based solution will suffer from overflowing for large numbers
      
	   int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
	}

}
