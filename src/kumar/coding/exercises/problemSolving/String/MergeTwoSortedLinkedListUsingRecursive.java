package kumar.coding.exercises.problemSolving.String;

/**
 * 
 * @author Kumar
 * This problem is to figure out the efficient way of merging two list
 *
 */

//Linked List Class
class MergeTwoSortedLinkedListUsingRecursive {

	Node head; // head of list
	static Node a, b;

	/* Node Class */
	static class Node {

		Integer data;
		Node next;

		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
		Node() {
			data = null;
			next = null;
		}
	}

	void printlist(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	Node sortedmerge(Node node1, Node node2) {
		Node dummy = new Node();
		Node res = dummy;
		
		// if both the nodes are null
		if (node1 == null ) {
			return node2;
		}
		
		if(node2 == null) {
			return node1;
		}
		
		while(node1 != null && node2 != null) {
			if(node1.data <= node2.data) {
				res.next = node1;
				res = node1;
				node1 = node1.next;
			}else {
				res.next = node2;
				res = node2;
				node2 = node2.next;
			}
		}
		
		if(node1 == null) {
			res.next = node2;
		}
		
		if(node2 == null) {
			res.next = node1;
		}

		return dummy.next;

	}
	
	public static void main(String[] args) {

		MergeTwoSortedLinkedListUsingRecursive list = new MergeTwoSortedLinkedListUsingRecursive();

		/*Let us create two sorted linked lists to test
		the above functions. Created lists shall be
		a: 5->10->15
		b: 2->3->20*/
		list.a = new Node(5);
		list.a.next = new Node(10);
		list.a.next.next = new Node(15);

		list.b = new Node(2);
		list.b.next = new Node(3);
		list.b.next.next = new Node(20);
		list.b.next.next.next = new Node(22);

		System.out.println("List a before merge :");
		list.printlist(a);
		System.out.println(" \nList b before merge :");
		list.printlist(b);

		// merge two sorted linkedlist in decreasing order
		System.out.println(" \nMerged linked list : ");
		list.printlist(list.sortedmerge(a, b));

	}
}

