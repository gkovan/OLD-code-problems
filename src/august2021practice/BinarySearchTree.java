package august2021practice;

public class BinarySearchTree {
	
	static class TreeNode {
		Integer value;
		TreeNode left;
		TreeNode right;
		
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
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);
		TreeNode left = new TreeNode(3);
		root.left = left;
		TreeNode right = new TreeNode(8);
		root.right = right;
		
		printTree(root);
		
		System.out.println(isValid(root, null, null));
	}
}
