package kumar.coding.exercises.problemSolving.String;

import java.util.Stack;

/**
 * This exercise is to find the longest valid parantheses.
 * ASSUMPTIONS: wont have anything other than brackets.
 * @author Kumar
 *
 */
public class LongestValidParantheses {

	public static void main(String[] args) {
		String input ="((()))";
		System.out.println(approach1(input));
	}

	/**
	 * Time complexity is O(n) Space Complexity is O(1). 
	 * @param input
	 * @return
	 */
	private static int approach1(String input) {
		int max = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '('){
				stack.push(i);
			}else{
				stack.pop();
				if(stack.isEmpty()){
					stack.push(i);
				}
				
				max = Math.max(max, i-stack.peek());
			}
		}
		return max;
	}

}
