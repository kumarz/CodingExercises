package kumar.coding.exercises.dataStructures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class DetectALoopInLinkedList {
	
	public class Node{
		int value;
		Node next;
		
		@SuppressWarnings("unused")
		public Node(int data){
			this.value = data;
			this.next = null;
		}
	}
	
	static List<Integer> visited = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		DetectALoopInLinkedList obj = new DetectALoopInLinkedList();
		Node head = obj.new Node(5);
		head.next = obj.new Node(3);
		head.next.next = obj.new Node(4);
		head.next.next.next = head.next;
		
		System.out.println("Is loop exist: " + isLoopExist(head));
		System.out.println("Is loop exist: " + approach2(head));
		
	}
	
	public static boolean isLoopExist(Node head){
		while(head != null){
			if(visited.contains(head.value)){
				System.out.println("A loop has been detected at "+ head.value);
				return true;
			}
			visited.add(head.value);
			head = head.next;
		}
		return false;
	}
	
	public static boolean approach2(Node head){
		if(head == null){
			return false;
		}
		
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast){
				System.out.println("A loop has been detected at "+ slow.value);
				return true;
			}
		}
		return false;
	}

}
