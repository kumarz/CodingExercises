package kumar.coding.exercises.problemSolving.String;

import java.util.HashMap;
import java.util.Map;

/**
 * This exercise is to find the first unique character of a string
 * @author kumas12
 * Questions: 
 * 1) is it has to be case-sensitive - if not we need to change the cases of the input.
 * 2) is there any special characters/ spaces allowed
 * 3) watch out for null checks
 *
 */
public class FirstUniqueCharacterInaString {

	public static void main(String[] args) {
		String input = "ilovetocode";
		int index = findIndex(input);
		if(input == null || input.length() == 0 ){
			System.out.println("The given input is empty or null");
		}else if(index != -1){
			System.out.println(" The first unique character found for "+ input + " is "+ input.charAt(findIndex(input)));
		}else{
			System.out.println(" There is no unique character found for "+ input );
		}
		
	}
	
	public static int findIndex(String input){
		Map<Character, Integer> total = new HashMap<Character, Integer>();
		
		for(int count = 0; count < input.length(); count++){
			total.put(input.charAt(count), total.get(input.charAt(count)) != null ? total.get(input.charAt(count))+1 : 1);
		}
		for(int count = 0; count < input.length(); count++){
			if(total.get(input.charAt(count)) != null && total.get(input.charAt(count)) == 1){
				return count;
			}
		}
		
		return -1;
	}

}
