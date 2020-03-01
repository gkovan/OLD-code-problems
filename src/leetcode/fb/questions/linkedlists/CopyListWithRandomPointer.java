package leetcode.fb.questions.linkedlists;

import java.util.HashMap;

public class CopyListWithRandomPointer {

	/*
	// Definition for a Node.
	 * 
	 */
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
	
	// I copied this solution
	// This one is easier to follow and simpler to code however space complexity is O(n) vs O(1)
    // 2 pass
    // TC: O(N)
    // SC: O(N)

	class Solution1 {
	    public Node copyRandomList(Node head) {
	        HashMap<Node, Node> visited = new HashMap<>();
	        Node dummy = head;
	        Node prev = null;
			// create all node without next and random
	        while(dummy != null){
	            Node n = new Node(dummy.val);
	            if(prev != null){
	                prev.next = n;
	            }
	            prev = n;
	            visited.put(dummy, n);
	            dummy = dummy.next;
	        }
	        
	        dummy = head;
			// add next and random pointer to all created node
	        while(dummy != null){
	            visited.get(dummy).random = visited.get(dummy.random);
	            dummy = dummy.next;
	        }
	        
	        return visited.get(head);   
	    }
	}
	
	
	// my solution did not work.  very close though.
	// Time is O(n)
	// Space is O(1)
	class Solution {
	    public Node copyRandomList(Node head) {
	        Node p = head;
	        
	        // interweave a copy of each node into the list
	        while (p != null) {
	            Node copy = new Node(p.val);
	            copy.next = p.next;
	            p.next = copy;
	            p = p.next.next;
	        }

	        // determine the random references for the newly created duplicated nodes
	        p = head;
	        while (p!=null) {
	            Node random = p.random;
	            p.next.random = (random == null) ? null : random.next;
	            p = p.next.next;
	        }
	        
	        Node pOrig = head;
	        Node pNew = head.next;
	        while (pOrig!=null) {
	            pOrig.next = pOrig.next.next;
	            pNew.next = (pNew.next != null) ? pNew.next.next : null;
	            pOrig = pOrig.next;
	            pNew = pNew.next;
	        }
	        return head.next;
	    }
	}
	

}
