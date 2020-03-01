package leetcode.fb.questions.linkedlists;

public class AddTwoNumbers {
	
	/**
	 * Definition for singly-linked list.
	 */
	  static public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null; }
	  }
	 
	  static class Solution {
		    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    	
		    	int carry = 0;
	            ListNode newHead = new ListNode(0);
	            ListNode iter = newHead;
	            
		    	
		    	while (l1 != null || l2 != null || carry > 0) {
		    		int val1 = (l1 != null) ? l1.val : 0;
		    		int val2 = (l2 != null) ? l2.val : 0;
		    		
		    		int sum = (carry+val1+val2)%10;
		    		carry = (carry+val1+val2)/10;
	                
	                ListNode newNode = new ListNode(sum);
	                iter.next = newNode;
	                iter = iter.next;
	                
	                if (l1 != null) {
	                    l1 = l1.next;
	                }
	                if (l2 != null) {
	                    l2 = l2.next;
	                }
		    	} 
	            
		        return newHead.next;
		    }
		    
		}
	
	public static void main(String[] args) {
		
	}

}
