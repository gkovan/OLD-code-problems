package august2021practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BinarySearchTree {
	
	static class TreeNode {
		Integer value;
		TreeNode left;
		TreeNode right;
		int depth;  // used in maxDepth
		int level; // used in rightSideView
		
		public TreeNode(Integer _value) {
			value = _value;
			left = null;
			right = null;
		}
		
	}
	
	public static void printTree(TreeNode root) {
		
		if (root != null) {
		   
		   printTree(root.left);
		   System.out.println(root.value);
		   printTree(root.right);
		   
		}
		
	}
	
	public static boolean isValid(TreeNode node, Integer upper, Integer lower) {
		
		if (node == null) 
			return true;
		
		if (upper != null && node.value > upper) {
			return false;
		}
		if (lower != null && node.value < lower) {
			return false;
		}
		
		if ( isValid(node.left, node.value,lower) == false) {
			return false;
		}
		if ( isValid(node.right, upper, node.value ) == false) {
			return false;
		}
		return true;
	}
	
	//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	public static int maxDepth(TreeNode node) {
		
		if (node != null) {
		   int leftDepth = maxDepth(node.left);
		   int rightDepth = maxDepth(node.right);
		   int max = Math.max(leftDepth, rightDepth) + 1;
		   node.depth = max;
		   return max;
		} else {
			return 0;
		}
	}
	
	private static int maxLevel = -1;
	private static Deque<TreeNode> rightSideViewStack = new ArrayDeque<TreeNode>();
	
	public static void rightSideView (TreeNode node, int level) {
		
		if (node != null) {
			node.level = level;
			if (node.level > maxLevel) {
				rightSideViewStack.push(node);
				maxLevel = level;
			
			}
			rightSideView(node.right, level+1);
			rightSideView(node.left, level+1);
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeNode five = new TreeNode(5);  // this is the root
		TreeNode three = new TreeNode(3);
		five.left = three;
		TreeNode eight = new TreeNode(8);
		five.right = eight;
		TreeNode six = new TreeNode(6);
		eight.left = six;
		TreeNode fifteen = new TreeNode(15);
		eight.right = fifteen;
		TreeNode ten = new TreeNode(10);
		fifteen.left = ten;
		
		
		printTree(five);
		
		System.out.println("Is the binary tree valid? " + isValid(five, null, null));
		maxDepth(five);
		System.out.println("The depth of the tree is: " + five.depth);
		
		System.out.println("Right side view");
		System.out.println("---------------");
		rightSideView(five,1);
		rightSideViewStack.forEach (x -> System.out.println(x.value));
	}
}
