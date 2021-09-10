package august2021practice;

public class LinkedLists {
	
	static class Node {
		int val;
		Node next;
		public Node (int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public static void addNodesToList(Node head, int numberOfNodesToAdd) {
		
		Node curr = head;
		for (int i=0; i < numberOfNodesToAdd; i++) {
			Node newNode = new Node(i);
			curr.next = newNode;
			curr = curr.next;
		}
		
	}
	
	public static void printContentsOfLinkedList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
	
	public static Node reverseList(Node head) {
		
		Node prev = null;
		Node next = null;
		Node curr = head;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
		
	}
	
	public static void main (String[] args) {
		
		Node head = new Node(0);
		addNodesToList(head, 3);
		printContentsOfLinkedList(head);
		Node headOfReverseListt = reverseList(head);
		System.out.println("Reverse List");
		printContentsOfLinkedList(headOfReverseListt);
	}

}
