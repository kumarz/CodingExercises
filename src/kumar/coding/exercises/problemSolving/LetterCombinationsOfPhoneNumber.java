package kumar.coding.exercises.problemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a phone book letter combinations
 * @author Kumar
 *
 */
public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		
		List<String> output = possibleCombinations();
		for(String item: output){
			System.out.println(item);
		}
	}
	
	public static List<String> possibleCombinations() {
		List<String> result = new ArrayList<String>();
		String digits = "23";
		Map<Character, char[]> lookup = new HashMap<Character, char[]>();
	    lookup.put('2',new char[]{'a','b','c'});
	    lookup.put('3',new char[]{'d','e','f'});
	    lookup.put('4',new char[]{'g','h','i'});
	    lookup.put('5',new char[]{'j','k','l'});
	    lookup.put('6',new char[]{'m','n','o'});
	    lookup.put('7',new char[]{'p','q','r','s'});
	    lookup.put('8',new char[]{'t','u','v'});
	    lookup.put('9',new char[]{'w','x','y','z'});
		 
		
		if(digits == null || digits.trim().length() == 0){
			return result;
		}
		
		char[] arr = new char[digits.length()];
		helper(digits, 0, arr, result, lookup);
		return result;
	}
	
	public static void helper( String digits, int index, char[] arr, List<String>result, Map<Character, char[]> lookup){
		if(digits.length() == index){
			result.add(String.valueOf(arr));
			return;
		}
		
		char number = digits.charAt(index);
		char[] candidates = lookup.get(number);
		
		for(int count = 0 ; count < candidates.length; count++){
			arr[index] = candidates[count];
			helper(digits, index+1, arr, result, lookup);
		}
		
	}

}
