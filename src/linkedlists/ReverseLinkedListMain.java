package linkedlists;

public class ReverseLinkedListMain {
	
	public static void main(String[] args) {
		   LinkedList linkedList = new LinkedList();
		   ListNode<Integer> L1 = linkedList.createLinkedListWithOneNode(1);		   
		   linkedList.addNodeToTail(L1, 2);  
		   linkedList.addNodeToTail(L1, 3);
		   linkedList.printContentsOfList(L1);
		   ListNode<Integer> reversedL1 = linkedList.reverseLinkedList(L1);
		   linkedList.printContentsOfList(reversedL1);
	}

}
