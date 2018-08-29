package kumar.coding.exercises.problemSolving.Arrays;
/**
 * Rotating array
 * @author Kumar
 * For Bruteforce using two loops.
 * Time complexity : O(n*k). All the numbers are shifted by one stepO(n) k timesO(K).
 * Space complexity : O(1). No extra space is used.
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		
		for(int item: approach1()){
			System.out.println(item);
		}
		
		for(int item: approach2()){
			System.out.println(item);
		}
        
	}
	
	/**
	 * Time complexity : O(n). Only one pass is used.
	 * Space complexity : O(1). Constant extra space is used.
	 * @return
	 */
	public static int[] approach1(){
		int[] nums = {5,2,6,1,7,4,8};
		int k = 4;
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        return nums;
	}
	
	/**
	 * Time complexity : O(n). Only one pass is used.
	 * Space complexity : O(1). Constant extra space is used.
	 * @return
	 */
	 public static int[] approach2() {
		int[] nums = {5,2,6,1,7,4,8};
		int k = 4;
		k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
