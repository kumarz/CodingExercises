package kumar.coding.exercises.problemSolving.Arrays;
/**
 * Find the number in the array that is not repeated
 * with time complexity as O(n)
 * space complexity as possible as O(1)
 * @author Kumar
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		int[] input = {4,1,2,2,1};
		int i = 0;
		for(int item: input){
			i ^= item;
		}
		System.out.println(i );
	}

}
