package kumar.coding.exercises.dataStructures.LinkedList;

import java.util.PriorityQueue;

import kumar.codeing.exercise.model.ListNode;

/*Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
*/
/**
 * 
 * @author Kumar
 *
 */
public class MergeKSortedLinkedList {

	public static void main(String[] args) {
		MergeKSortedLinkedList list = new MergeKSortedLinkedList();
		ListNode list1 = new ListNode(5);
		list1.next = new ListNode(10);
		list1.next.next = new ListNode(12);
		list1.next.next.next = new ListNode(15);
		
		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(6);
		list2.next.next.next = new ListNode(20);

		ListNode[] input = {list1, list2};

		// merge two sorted linked list in decreasing order
		System.out.println(" \nMerged linked list : ");
		printlist(mergeKLists(input));

	}


/*	Complexity Analysis

    Time complexity : O(Nlogk) where k is the number of linked lists.
        The comparison cost will be reduced to O(logk) for every pop and insertion to priority queue. But finding the node with the smallest value just costs O(1) time.
        There are NNN nodes in the final linked list.

    Space complexity :
        O(n) Creating a new linked list costs O(n) space.
        O(k) The code above present applies in-place method which cost O(1) space. And the priority queue (often implemented with heaps) costs O(k) space (it's far less than N in most situations). 
*/
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((l1, l2) -> l1.val - l2.val);
        for(ListNode item: lists){
             if(item != null)minHeap.offer(item); 
        }
        
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(!minHeap.isEmpty()){
            dummy.next = minHeap.poll();
            dummy = dummy.next;
            if(dummy.next != null){
                minHeap.offer(dummy.next);
            }
        }
        return head.next;
    }
    
	
	private static void printlist(ListNode input) {
		while(input != null){
			System.out.print(input.val);
			input = input.next;
		}
		
	}
}
