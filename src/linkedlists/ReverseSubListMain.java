package linkedlists;

public class ReverseSubListMain {
	
	public static void main(String[] args) {
		
		   LinkedList linkedList = new LinkedList();
		   ListNode<Integer> L1 = linkedList.createLinkedListWithOneNode(10);		   
		   linkedList.addNodeToTail(L1, 9);  
		   linkedList.addNodeToTail(L1, 8);
		   linkedList.addNodeToTail(L1, 7);
		   linkedList.addNodeToTail(L1, 6);
		   linkedList.addNodeToTail(L1, 5);
		   linkedList.addNodeToTail(L1, 4);
		   linkedList.addNodeToTail(L1, 3);
		   linkedList.addNodeToTail(L1, 2);
		   linkedList.addNodeToTail(L1, 1);
		   linkedList.printContentsOfList(L1);
		   ListNode<Integer> reversedSubListL1 = linkedList.reverseSubList(L1,3,6);
		   linkedList.printContentsOfList(reversedSubListL1);
		
	}

}
