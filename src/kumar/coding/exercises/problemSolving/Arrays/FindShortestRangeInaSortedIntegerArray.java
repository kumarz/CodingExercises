package kumar.coding.exercises.problemSolving.Arrays;

import java.util.PriorityQueue;

/**
 * 
 * @author Kumar
 * This is a exercise where we need to find the shorted range of integers
 * 
 * Input is a list of array of sorted integers.
 * 
 * arr 1 : [4,7,9,12,15]
 * arr 2 : [0,8,10,14,20]
 * arr 3 : [6,12,16,30,50]
 * 
 * output : [6,8]
 * 
 *
 */
public class FindShortestRangeInaSortedIntegerArray {
	static int[][] nums = new int[][]{
		{4,7,9,12,15},
		{0,8,10,14,20},
		{6,12,16,30,50}
	};
	
	public static void main(String[] args) {
        int minx = 0, miny = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] next = new int[nums.length];
        boolean flag = true;
        PriorityQueue <Integer> min_queue = new PriorityQueue <Integer > ((i, j) -> nums[i][next[i]] - nums[j][next[j]]);
        
        for (int i = 0; i < nums.length; i++) {
            min_queue.offer(i);
            max = Math.max(max, nums[i][0]);
        }
        for (int i = 0; i < nums.length && flag; i++) {
            for (int j = 0; j < nums[i].length && flag; j++) {
                int min_i = min_queue.poll();
                if (miny - minx > max - nums[min_i][next[min_i]]) {
                    minx = nums[min_i][next[min_i]];
                    miny = max;
                }
                next[min_i]++;
                if (next[min_i] == nums[min_i].length) {
                    flag = false;
                    break;
                }
                min_queue.offer(min_i);
                max = Math.max(max, nums[min_i][next[min_i]]);
            }
        }
        System.out.println( " The shortest range is " +minx + " - "+  miny);
	}
}
