package leetcode.fb.questions.treesandgraphs;

public class ValidBinarySearchTree {
	
	/**
	 * Definition for a binary tree node.
	 */
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	//  Solution worked and passed all the tests
	// O(n) time complexity since as worst case we visit every node
	// O(n) space complexity since as worst case we grow the stack up to n times
	class Solution {
	    
	    private boolean validate (TreeNode node, Integer upper, Integer lower) {
	        
	        if (node == null) return true;
	        
	        if (upper != null && node.val >= upper) return false;
	        if (lower != null && node.val <= lower) return false;
	        
	        if (validate(node.left, node.val, lower) == false) return false;
	        if (validate(node.right,upper,node.val) == false) return false;
	        
	        return true;
	        
	    }
	    public boolean isValidBST(TreeNode root) {
	        return validate(root,null, null);
	        
	    }
	}

}
