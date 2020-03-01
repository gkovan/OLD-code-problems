package binarytrees;

public class CreateBinaryTree {

	/****
	 * 10 5 15 3 7 12 18 2 1
	 ***/

	public BinaryTreeNode<Integer> createBinaryTree() {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data = 10;
		root.left = null;
		root.right = null;

		BinaryTreeNode<Integer> node10 = insertNodeIntoBinaryTree(root, 5, 15);

		BinaryTreeNode<Integer> node5 = insertNodeIntoBinaryTree(node10.left, 3, 7);
		BinaryTreeNode<Integer> node15 = insertNodeIntoBinaryTree(node10.right, 12, 18);

		BinaryTreeNode<Integer> node3 = insertNodeIntoBinaryTree(node5.left, 2, null);
		BinaryTreeNode<Integer> node2 = insertNodeIntoBinaryTree(node3.left, 1, null);

		return root;

	}
	
	public BinaryTreeNode<Integer> createSymmetricBinaryTree() {
		/*********
		 
		 		10
		 5				5
	3		7		7		3
		 *********/
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data = 10;
		root.left = null;
		root.right = null;
		
		BinaryTreeNode<Integer> node10 = insertNodeIntoBinaryTree(root, 5, 5);
		BinaryTreeNode<Integer> node5left = insertNodeIntoBinaryTree(node10.left, 3, 7);
		BinaryTreeNode<Integer> node5right = insertNodeIntoBinaryTree(node10.right, 7, 3);
		
		return root;
	}

	public BinaryTreeNode<Integer> insertNodeIntoBinaryTree(BinaryTreeNode<Integer> existingNode, Integer leftNodeData,
			Integer rightNodeData) {

		BinaryTreeNode<Integer> left = (leftNodeData != null) ? new BinaryTreeNode<Integer>() : null;
		if (left != null) {
			left.data = leftNodeData;
			left.left = null;
			left.right = null;
		}

		BinaryTreeNode<Integer> right = (rightNodeData != null) ? new BinaryTreeNode<Integer>() : null;
		if (right != null) {
			right.data = rightNodeData;
			right.left = null;
			right.right = null;
		}

		existingNode.left = left;
		existingNode.right = right;
		return existingNode;
	}

}
