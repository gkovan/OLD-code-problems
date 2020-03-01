package linkedlists;

public class LinkedListMain {
   public static void main (String[] args) {
	   LinkedList linkedList = new LinkedList();
	   ListNode<Integer> head = linkedList.createLinkedListWithOneNode(1);
	   linkedList.printContentsOfList(head);
	   linkedList.addNodeToTail(head, 2);
	   linkedList.addNodeToTail(head, 3);
	   linkedList.addNodeToTail(head, 4);
	   linkedList.addNodeToTail(head, 5);
	   linkedList.addNodeToTail(head, 6);
	   linkedList.addNodeToTail(head, 7);
	   linkedList.addNodeToTail(head, 8);
	   linkedList.addNodeToTail(head, 9);
	   linkedList.addNodeToTail(head, 10);
	   linkedList.addNodeToTail(head, 11);
	   linkedList.addNodeToTail(head, 12);
	   linkedList.printContentsOfList(head);
	   
	   System.out.println("Adding a new node to the head of the list");
	   head = linkedList.addNodeToHead(head, 88);
	   linkedList.printContentsOfList(head);
	   
	   System.out.println("Adding a new node to the head of the list");
	   head = linkedList.addNodeToHead(head, 99);
	   linkedList.printContentsOfList(head);
   }
}
