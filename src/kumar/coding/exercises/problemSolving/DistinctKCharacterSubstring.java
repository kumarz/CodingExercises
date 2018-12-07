package kumar.coding.exercises.problemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctKCharacterSubstring {

	public static void main(String[] args) {
		String input = "kjabjfnljaghjkkleuroitybnmbxznawlqhejwheqw";
		List<String> output = new ArrayList<String>();
		int k = 5;
		Map<Character, Integer> lookup = new HashMap<Character, Integer>();
		for(int i = 0; i+k < input.length(); i++){
			String item = input.substring(i, i+k);
			int duplicateCount = 0;
			lookup.clear();
			for(char temp : item.toCharArray()){
				lookup.put(temp, lookup.getOrDefault(temp, 0)+1);
				if(lookup.getOrDefault(temp, 0) > 1){
					duplicateCount++;
				}
			}
			
			if(duplicateCount == 1){
				output.add(item);
				i += k;
			}
			
		}
		for(String item: output){
			System.out.print(item + " " );
		}
	}

}
