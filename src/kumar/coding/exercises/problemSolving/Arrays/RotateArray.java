package kumar.coding.exercises.problemSolving.Arrays;
/**
 * Rotating array, time complexity is O(n)
 * @author Kumar
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {5,2,6,1,7,4,8};
		int k = 4;
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        
	}

}
