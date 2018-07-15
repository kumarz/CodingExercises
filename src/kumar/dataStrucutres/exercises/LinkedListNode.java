package kumar.dataStrucutres.exercises;

import java.util.ArrayList;

public class LinkedListNode {
	int value;
	LinkedListNode next;

	public static void main(String[] args) {
		ArrayList<LinkedListNode> list = new ArrayList<LinkedListNode>();
		LinkedListNode a = new LinkedListNode();
		a.value = 1;
		LinkedListNode b = new LinkedListNode();
		b.value = 6;
		a.next = b;
		LinkedListNode c = new LinkedListNode();
		c.value = 0;
		LinkedListNode d = new LinkedListNode();
		d.value = 3;
		c.next = d;
		LinkedListNode e = new LinkedListNode();
		e.value = 2;
		LinkedListNode f = new LinkedListNode();
		f.value = 8;
		e.next = f;
		list.add(a);
		list.add(c);
		list.add(e);
		System.out.println("before sorting....");
		for(LinkedListNode item: list){
			if(item != null){
				System.out.println(item.value);
				while(item.next != null){
					item = item.next;
					System.out.println(item.value);
					
				}
				
			}
			
		}
		
		mergeSortedLinkedList(list);
		System.out.println("After  sorting....");
		for(LinkedListNode item: list){
			if(item != null){
				System.out.println(item.value);
				while(item.next != null){
					item = item.next;
					System.out.println(item.value);
					
				}
				
			}
			
		}
	}

	private static void mergeSortedLinkedList(ArrayList<LinkedListNode> list) {
		for(LinkedListNode item: list){
			if(item != null){
				System.out.println(item.value);
				while(item.next != null){
					item = item.next;
					System.out.println(item.value);
					
				}
				
			}
			
		}
	}

}
