package kumar.coding.exercises.dataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		 String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
	     List<List<String>> output = hashingApproach(input);
	     for(List item : output){
	    	 System.out.println(item);
	     }
	}

	/**
	 * 
	 * Complexity Analysis
	 * Time Complexity: O(NKlogK)O(NK log K)O(NKlogK), where N is the length of input, and K is the maximum length of a string in strs. 
	 * The outer loop has complexity O(N) as we iterate through each string. 
	 * Then, we sort each string in O(KlogK)O(K \log K)O(KlogK) time.
	 * Space Complexity: O(NK), the total information content stored in answer. 
	 * @param input
	 * @return
	 */
	private static List<List<String>> hashingApproach(String[] input) {
		
		if(input.length == 0){
			return new ArrayList<List<String>>();
		}
		Map<String, List<String>> hash = new HashMap<String,List<String>>();
		for(String item: input){
			char[] temp = item.toCharArray();
			Arrays.sort(temp);
			String key = String.valueOf(temp);
			if(!hash.containsKey(key)){
				hash.put(key, new ArrayList());
			}
				hash.get(key).add(item);
		}
		return new ArrayList(hash.values());
	}
	
}
