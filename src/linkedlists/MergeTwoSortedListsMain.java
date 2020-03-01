package linkedlists;

public class MergeTwoSortedListsMain {

	
	
	public static void main (String[] args) {
		   LinkedList linkedList = new LinkedList();
		   ListNode<Integer> L1 = linkedList.createLinkedListWithOneNode(2);		   
		   linkedList.addNodeToTail(L1, 5);  
		   linkedList.addNodeToTail(L1, 7);
		   linkedList.printContentsOfList(L1);
		   
		   ListNode<Integer> L2 = linkedList.createLinkedListWithOneNode(3);		   
		   linkedList.addNodeToTail(L2, 11);  
		   linkedList.printContentsOfList(L2);
		   
		   ListNode<Integer> sortedMergedList = linkedList.mergeTwoSortedLists(L1,L2);
		   linkedList.printContentsOfList(sortedMergedList);
	}

}
