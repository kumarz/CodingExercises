package kumar.coding.exercises.problemSolving.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * This program is to find if two given strings are anagram or not.
 * @author Kumar
 * 
 * Questions: 
 * is any special characters allowed
 * is spaces allowed
 * 
 *
 */
public class IsAnagram {

	public static void main(String[] args) {
		String a = "cinema";
		String b = "iceman";
		String c = "testing";
		
		System.out.println("The given Strings are anagram for each other : " + approachUsingPriorityQueue(a, c));

	}
	
	public static boolean approachUsingArrays(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
		
	}
	
	public static boolean approachUsingPriorityQueue(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		
		PriorityQueue<Character> a = new PriorityQueue<Character>(Collections.reverseOrder());
		PriorityQueue<Character> b = new PriorityQueue<Character>(Collections.reverseOrder());
		List<Character> sortedA = new ArrayList<Character>();
		List<Character> sortedB = new ArrayList<Character>();
		
		for(int count = 0 ; count < s1.length(); count++){
			a.offer(s1.charAt(count));
			b.offer(s2.charAt(count));
		}
		
		for(int count = 0 ; count < s1.length(); count++){
			sortedA.add(a.poll());
			sortedB.add(b.poll());
			if(!sortedA.get(count).equals(sortedB.get(count))){
				return false;
			}
		}
		
		return true;
		
	}

}
