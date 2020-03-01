package binarytrees;

public class TraverseBinaryTree {
	
	/*
	 * traverse the left sub-tree, visit the root, then traverse the right
	 */
	public static void inOrderTreeTraversal(BinaryTreeNode<Integer>  root) {
		if (root != null) {
			inOrderTreeTraversal(root.left);
			System.out.println(root.data);
			inOrderTreeTraversal(root.right);
		}
	}
	
	/*
	 * visit the root, traverse the left sub-tree, traverse the right sub-tree
	 */
	public static void preOrderTreeTraversal(BinaryTreeNode<Integer>  root) {
		if (root != null) {
			System.out.println(root.data);
			preOrderTreeTraversal(root.left);
			preOrderTreeTraversal(root.right);
		}
	}
	
	/*
	 * traverse the left sub-tree, traverse the right sub-tree then visit the root,
	 */
	public static void postOrderTreeTraversal(BinaryTreeNode<Integer>  root) {
		if (root != null) {
			postOrderTreeTraversal(root.left);
			postOrderTreeTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
	/*
	 * traverse binary tree and return the height
	 * traverse the left sub-tree, visit the root, then traverse the right
	 */
	public static int maxDepth(BinaryTreeNode<Integer>  root) {
		
		/*
		 * See https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/amp/
		 * 
		 */
		if (root == null) {
			return 0;
		} else {
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			
			if (leftDepth > rightDepth) {
				return leftDepth + 1;
			} else {
				return rightDepth + 1;
			}
		}
	}
	
	public static boolean isBalanced = true;
	public static int checkBalanced(BinaryTreeNode<Integer> root) {
		
		if (root == null) {
			return 0;
		} else {
			int leftDepth = checkBalanced(root.left);
			int rightDepth = checkBalanced(root.right);

			if (Math.abs(leftDepth-rightDepth) > 1) {
			   isBalanced=false;
		    }
			return Math.max(leftDepth,rightDepth) + 1;
		}
	}
	
	public static int isSymmetric(BinaryTreeNode<Integer> root) {
		return 0;
	}


}
