package kumar.problem.solving.exercises;

import java.util.PriorityQueue;

/***
 * 
 * @author Kumar
 * This is an simple palindrome exercise using Linked List
 *
 */
public class SortingArrayOfIntegers {

	public static void main(String[] args) {
		int[] input = {43,23,64,5,62,12,75,28,97,4,7,3};
		PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
		for(int item: input){
			sorted.offer(item);
		}
		
		for(int count= 0; count < input.length; count++){
			input[count] = sorted.poll();
			System.out.println(input[count]);
		}

	}

}
