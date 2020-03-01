package leetcode.fb.questions.treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	
	/**
	 * Definition for a binary tree node
	 */
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	  //  My Solution;  Working; All test cases passed.
	  
	class Solution {
		
	    int maxDepth = 0;
	    
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> rightSideList = new ArrayList();
	        
	        traverse(root, 1, rightSideList);
	        return rightSideList;
	    }
	    
	    private void traverse(TreeNode node, int depth, List<Integer> rightSideList) {
	        
	        if (node == null) { 
	            return ;
	        } else {
	        
	          if (depth > maxDepth) {
	              rightSideList.add(node.val);
	              maxDepth = depth;
	          }
	        
	          traverse(node.right, depth+1, rightSideList);
	          traverse(node.left, depth+1, rightSideList);
	        }
	    }
	}

}
