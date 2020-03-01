package linkedlists;

public class DeletingMain {

	public static void main(String[] args) {
		
		System.out.println("----  Delete nodes from list ------");

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
		linkedList.printContentsOfList(head);
		// delete the second node in the list
		linkedList.deleteNodeFromList(head.next); // head.next is the second node
		linkedList.printContentsOfList(head);

		linkedList.deleteKthLastNodeFromList(head, 3);
		linkedList.printContentsOfList(head);

		System.out.println("----  Delete duplicates from a list -----");

		LinkedList linkedList2 = new LinkedList();
		ListNode<Integer> head2 = linkedList.createLinkedListWithOneNode(1);
		linkedList.printContentsOfList(head2);
		linkedList.addNodeToTail(head2, 2);
		linkedList.addNodeToTail(head2, 3);
		linkedList.addNodeToTail(head2, 3);
		linkedList.addNodeToTail(head2, 3);
		linkedList.addNodeToTail(head2, 4);
		linkedList.addNodeToTail(head2, 5);
		linkedList.addNodeToTail(head2, 5);
		linkedList.addNodeToTail(head2, 5);
		linkedList.addNodeToTail(head2, 5);
		linkedList.addNodeToTail(head2, 6);
		linkedList.addNodeToTail(head2, 7);
		linkedList.printContentsOfList(head2);
		linkedList2.deleteDuplicatesFromSortedListBruteForce(head2);
		linkedList.printContentsOfList(head2);
	}

}
