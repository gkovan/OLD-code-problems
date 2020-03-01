package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	
   public ListNode<Integer> createLinkedListWithOneNode(final Integer data) {
	   ListNode<Integer> head = new ListNode<Integer>();
	   head.data = data;
	   head.next = null;
	    
	   return head;
   }
   
   public void addNodeToTail(final ListNode<Integer> head, final Integer data) {
		   
	   ListNode<Integer> node = head;
	   ListNode<Integer> prevNode = null;
	   while (node!=null) {
		   prevNode = node;
		   node = node.next;
	   }
	   
	   ListNode<Integer> newNode = new ListNode<Integer>();
	   newNode.data = data;
	   newNode.next = null;
	   prevNode.next = newNode;
   }
   
   public ListNode<Integer> addNodeToHead(ListNode<Integer> head, final Integer data) {
	   ListNode<Integer> newNode = new ListNode<Integer>();
	   newNode.data = data;
	   newNode.next = head;
	   
	   head = newNode;
	   return newNode;
   }
   
   public void printContentsOfList(final ListNode<Integer> head) {
	   System.out.println("Printing contents of list:");
	   System.out.println("--------------------------");
	   
	   ListNode<Integer> node = head;
	   while (node != null) {
		   System.out.print(node.data + ", ");   
		   node = node.next;
	   }
	   System.out.println();
   }
   
	public ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> L1, ListNode<Integer> L2) {
		
		ListNode<Integer> dummyHead = new ListNode<Integer>(0, null);
		ListNode<Integer> current = dummyHead;
		
		while (L1 != null && L2 != null) {
			if (L1.data < L2.data) {
				current.next = L1;
				L1 = L1.next;
			} else {
				current.next = L2;
				L2 = L2.next;
			}
			current = current.next;
		}
		
		current.next  = (L1 != null) ? L1 : L2;
		return dummyHead.next;
	}
	
	public ListNode<Integer> reverseLinkedList(ListNode<Integer> L1) {
		
		ListNode<Integer> prev = null;
		ListNode<Integer> curr = L1;
		ListNode<Integer> next = null;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		L1 = prev;
		return L1;
	}
	
	public ListNode<Integer> reverseSubList(ListNode<Integer> L1, int start, int finish) {

		ListNode<Integer> dummyHead = new ListNode<Integer>(0,L1);
		ListNode<Integer> sublistHead = dummyHead;
		
		int k = 1;
		
		while (k++ < start) {
			sublistHead = sublistHead.next;
		}
		
		// reverse sublist
		ListNode<Integer> sublistIter = sublistHead.next;
		while (start++ < finish) {
			ListNode<Integer> temp = sublistIter.next;
			sublistIter.next = temp.next;
			temp.next = sublistHead.next;
			sublistHead.next = temp;
		}
		
		return dummyHead.next;
	}
	
	public void deleteNodeFromList(ListNode<Integer> nodeToDelete) {
		if (nodeToDelete.next != null) {  // if nodeToDelete is not the tail
			nodeToDelete.data = nodeToDelete.next.data;
			nodeToDelete.next = nodeToDelete.next.next;
		} else {
			// if it is the tail, then can't be done.
			// must you iterate through the list to find the predecessor of 
			// the nodeToDelete
		}
	}
	
	public ListNode<Integer> deleteKthLastNodeFromList(ListNode<Integer> L, int k) {
		ListNode<Integer> iter1 = L;
		ListNode<Integer> iter2 = L;
		
		// advance iter1 by k spaces
		while (k > 1) {
			iter1 = iter1.next;
			k--;
		}
		
		ListNode<Integer> iter2Prev = null;
		
		// advance iter1 and iter2 until iter1 reach tail
		while (iter1.next != null) {
			iter1 = iter1.next;
			iter2Prev = iter2;
			iter2 = iter2.next;
		}
		iter2Prev.next = iter2Prev.next.next;
		
		return L;
	}
	
	public ListNode<Integer> deleteDuplicatesFromSortedListBruteForce(ListNode<Integer> L) {
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		ListNode<Integer> curr = L;
		ListNode<Integer> prevNode = null;
		while(curr != null) {
			if (mySet.contains(curr.data)) {
				while (curr.data.equals(prevNode.data)) {
					curr = curr.next;
				}
				prevNode.next = curr;
				curr = curr.next;
			} else {
				mySet.add(curr.data);
				prevNode = curr;
				curr = curr.next;
				
			}
		}
		return L;
	}
	
	
//	public ListNode<Integer> reverseSubListGK(ListNode<Integer> L1, int start, int finish) {
//		
//		int j = 1;
//		
//		ListNode<Integer> curr = L1;
//		ListNode<Integer> beforeSubList = null;
//		
//		while (j < start) {
//			beforeSubList = curr;
//			curr = curr.next;
//			j++;
//		}
//		
//		ListNode<Integer> afterSubList = null;
//		int k = j;
//		while (k < finish) {
//			curr = curr.next;
//			k++;
//			if ( k == finish ) {
//				afterSubList = curr;
//			}
//		}
//		
//		ListNode<Integer> subList = reverseSubListGKGK(beforeSubList.next, afterSubList);
//		
//		
//		return null;
//	}
//	
//	public ListNode<Integer> reverseSubListGKGK(ListNode<Integer> L1,ListNode<Integer> afterSubList) {
//		
//		return null;
//	}
		
	
//	public ListNode<Integer> reverseSubList(ListNode<Integer> L1, int start, int finish) {
//		
//		// get to the start node
//		ListNode<Integer> beforeStartNode = null;  // keep track of prev Node as well
//		int i = 1;
//		while (i < start) {
//			beforeStartNode = L1;
//			L1 = L1.next;
//			i++;
//		}
//		
//		//insert a dummy node before the start node
//		//ListNode<Integer> dummy = new ListNode<Integer>(0, L1);
//		
//		ListNode<Integer> prev = null;
//		ListNode<Integer> curr = LI;
//		ListNode<Integer> next = null;
//		
//		int j = start;
//		while (curr != null && j < finish) {
//			next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//			j++;
//		}
//		ListNode<Integer> finishNode = prev;
//		
//		beforeStartNode.next = finishNode;
//		
//		dummy = curr;
//
//		return L1;
//	}

}
