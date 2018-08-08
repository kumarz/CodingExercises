package kumar.coding.exercises.dataStructures.LinkedList;

/**
 * This is to remove the node from a linkedList but in one pass. Time complexity is O(n).
 * @author Kumar
 * 
 */

/*
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

*/
public class RemoveKthNodeOfLinkedList {
	
	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int data){
			this.val = data;
			this.next = null;
		}
		
	}

	public static void main(String[] args) {
		RemoveKthNodeOfLinkedList obj = new RemoveKthNodeOfLinkedList();
		
	    ListNode head = obj.new ListNode(1);
	    head.next = obj.new ListNode(2);
	    head.next.next = obj.new ListNode(3);
	    head.next.next.next = obj.new ListNode(4);
	    head.next.next.next.next = obj.new ListNode(5);
	    int n = 2;
	    
	    ListNode response = removeNthFromEnd(head, n);
	    while(response != null){
	    	System.out.println(response.val);
	    	response = response.next;
	    }

	}
	

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
       if(head == null){
           return null;
       }
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        
        // to move the fast node to specified n nodes.
        for(int count = 0 ; count < n; count++){
            fast = fast.next;
        }
        
        // to remove first node
        if(fast == null){
            head = head.next;
            return head;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = (slow.next != null && slow.next.next != null) ? slow.next.next : null;
        
        return head;
    }

}
