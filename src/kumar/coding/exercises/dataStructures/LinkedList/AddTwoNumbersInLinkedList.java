package kumar.coding.exercises.dataStructures.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @author Kumar
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * 
 * Complexity Analysis:
 * Time complexity : O(max(m,n)). Assume that mm and nn represents the length of l1l1 and l2l2 respectively, the algorithm above iterates at most \max(m, n)max(m,n) times.
 * Space complexity: O(max(m,n)). The length of the new list is at most \max(m,n) + 1max(m,n)+1.
 * 
 * Follow up:
 * What if the the digits in the linked list are stored in non-reversed order? 
 *  
 * 
 */

/*
The pseudocode is as following:

Initialize current node to dummy head of the returning list.
Initialize carry to 00.
Initialize pp and qq to head of l1l1 and l2l2 respectively.
Loop through lists l1l1 and l2l2 until you reach both ends.
Set xx to node pp's value. If pp has reached the end of l1l1, set to 00.
Set yy to node qq's value. If qq has reached the end of l2l2, set to 00.
Set sum = x + y + carrysum=x+y+carry.
Update carry = sum / 10carry=sum/10.
Create a new node with the digit value of (sum \bmod 10)(summod10) and set it to current node's next, then advance current node to next.
Advance both pp and qq.
Check if carry = 1carry=1, if so append a new node with digit 11 to the returning list.
Return dummy head's next node.
Note that we use a dummy head to simplify the code. Without a dummy head, you would have to write extra conditional statements to initialize the head's value.

*/

public class AddTwoNumbersInLinkedList {
	public class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		AddTwoNumbersInLinkedList obj = new AddTwoNumbersInLinkedList();
		Node input1 = obj.new Node(2);
		input1.next = obj.new Node(4);
		input1.next.next = obj.new Node(3);

		Node input2 = obj.new Node(5);
		input2.next = obj.new Node(6);
		input2.next.next = obj.new Node(4);
		
		int carry = 0;
		Node dummyHead = obj.new Node(0);
		Node p = input1, q = input2;
		Node current = dummyHead;
		
		while(p != null || q != null){
			int x = p == null ? 0 : p.data;
			int y = q == null ? 0 : q.data;
			int sum = carry  + x + y ;
			carry = sum/10;
			current.next = obj.new Node(sum % 10);
			current = current.next;
			if( p != null) p = p.next;
			if( q != null) q = q.next;
		}
		
		if( carry > 0 ){
			current.next = obj.new Node(carry);
		}
		
		Node output = dummyHead.next;
		while(output != null){
			System.out.println(output.data);
			output = output.next;
		}
	}

}
