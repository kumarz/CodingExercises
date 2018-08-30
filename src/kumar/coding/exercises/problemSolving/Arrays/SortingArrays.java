package kumar.coding.exercises.problemSolving.Arrays;

import java.util.PriorityQueue;

public class SortingArrays {

	public static void main(String[] args) {
		int nums[] = new int[]{1,2,0,0,1,2};
		PriorityQueue<Integer> sortedQ = new PriorityQueue<Integer>();
		for(int item: nums){
			sortedQ.offer(item);
		}
        for(int count = 0; count < nums.length && !sortedQ.isEmpty(); count++){
            nums[count] = sortedQ.poll();
            System.out.println(nums[count]);
        }

	}

}
