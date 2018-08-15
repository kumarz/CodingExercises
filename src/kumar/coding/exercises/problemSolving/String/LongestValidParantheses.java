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
		System.out.println(approach2(input));
	}

	/**
	 * Time complexity is O(n) Space Complexity is O(n) for using Stack of n elements. 
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
	
	/**
	 * Time complexity is O(n) Space Complexity is O(1) only left & right are needed. 
	 * @param input
	 * @return
	 */
	public static int approach2(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }

}
