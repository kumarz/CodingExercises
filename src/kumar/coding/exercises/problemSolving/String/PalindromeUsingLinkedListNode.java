package kumar.coding.exercises.problemSolving.String;

import java.util.Stack;

/***
 * 
 * @author Kumar
 * This is an simple palindrome exercise using Linked List
 * Things to consider:
 * Consider test case of inputs having multiple digits
 * Consider negative integers as well.
 *
 */

public class PalindromeUsingLinkedListNode {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { 
			 val = x; 
		 }
	}

	public static void main(String[] args) {
		PalindromeUsingLinkedListNode obj = new PalindromeUsingLinkedListNode();
		ListNode head = obj.new ListNode(-123);
		ListNode node = obj.new ListNode(-123);
		head.next = node;

	}

    public boolean isPalindrome(ListNode head) {
        StringBuffer strBuffer = new StringBuffer();   
        Stack<Integer> input = new Stack<Integer>();
        
        while(head != null){
            strBuffer.append(head.val);
            input.push(head.val);
            head = head.next;
        }

        String inputStr = new String(strBuffer);
        strBuffer.delete(0, strBuffer.length()); // clearing the buffer since its being re-used.
        while(!input.isEmpty()){
            strBuffer.append(input.pop());
            // using stack since its easy to take the objects in the reverse order.
        }
        String reverseStr = new String(strBuffer);
        
        return inputStr.equalsIgnoreCase(reverseStr);
    }
}
