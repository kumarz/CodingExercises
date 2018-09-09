package kumar.coding.exercises.problemSolving.Arrays;
/**
 * This is to find minimum in a roated sorted array
 * @author Kumar
 * Time complexity is O(logn) using binary search algorithm
 * Space complexity is O(1).
 *
 */
public class FindMinimumInRotatedArray {

	public static void main(String[] args) {
		int[] nums = {6,7,8,1,2,3,4,5};
        int l = 0, r = nums.length - 1;
        while(l < r){
            int m = l + (r-l)/2;
            if(nums[m] > nums[r]){
                l = m+1;
            }else if (nums[m] < nums[r]){
                r = m;
            }else{
                r--;
            }
        }
        

		System.out.println(nums[l]);
	}

}
