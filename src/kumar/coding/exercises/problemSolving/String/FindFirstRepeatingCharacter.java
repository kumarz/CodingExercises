package kumar.coding.exercises.problemSolving.String;

import java.util.HashMap;
import java.util.Map;

/**
 * To find the first repeating character in a String. Time complexity is o(n).
 * @author Kumar
 *
 */
public class FindFirstRepeatingCharacter {

	public static void main(String[] args) {
		String input = "This is a long string";
		Map<Character, Integer> total = new HashMap<Character, Integer>();
		for(int count = 0 ; count < input.length(); count ++){
			int curretCount = total.get(input.charAt(count))== null ? 0: total.get(input.charAt(count));
			System.out.println(input.charAt(count) + " count is " + curretCount);
			if(curretCount == 1){
				System.out.println("Found the first repeating character " + input.charAt(count) + " repeated at index " + count);
				break;
			}
			total.put(input.charAt(count), curretCount+1);
			
		}
	}

}
