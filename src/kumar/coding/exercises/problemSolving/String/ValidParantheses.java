package kumar.coding.exercises.problemSolving.String;

import java.util.Stack;

/**
 * Check if the parantheses are closed properly.
 * @author Kumar
 *
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.
Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true


*/
public class ValidParantheses {

	public static void main(String[] args) {
		String input = "([)]";
		// String input = "()[]";
		System.out.println(isValid(input));
	}

	/**
	 * Time complexity is O(n) Space complexity is O(1).
	 * @param input
	 * @return
	 */
	private static boolean isValid(String input) {
		Stack<Character> result = new Stack<Character>();
		for(char item : input.toCharArray()){
			switch(item){
			case '{' :
						result.push('}');
						break;
			case '(' :
						result.push(')');
						break;
			case '[' :
						result.push(']');
						break;
			default: 
						if(result.isEmpty() || result.pop() != item){
							return false;
						}
			}
		}
		return result.isEmpty();
	}

}
