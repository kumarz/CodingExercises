package kumar.coding.exercises.problemSolving.String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveDuplicateEvenOccurencesCharacters {
	static String input = "you got beautiful eyes";
	static StringBuffer output = new StringBuffer();
	static Map<String, Integer>count = new HashMap<String, Integer>();

	public static void main(String[] args) {
		System.out.println("Input: "+ input);
		int index = 0;
		for(char item: input.toCharArray()) {
			index++;
			String currentItem = String.valueOf(item);
			count.put(currentItem, count.get(currentItem) == null ? 0: count.get(currentItem)+1 );
			if(count.get(currentItem) % 2 == 0) {
				output.append(currentItem);
			}
		}
		
		System.out.println("Output: " + output.toString());

	}
	
	

}
